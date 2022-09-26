package example.app.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import example.Types.Estacao;

public class Agencia extends Empresa {

    /** Destinos e preços são mapeados aqui */
    protected Map<Destino, Double> destinos;
    /** Clientes e viagens são mapeados aqui */
    protected Map<Cliente, Destino> viagens;
    protected double promocao;
    protected Estacao estacao;

    /**
     * Método construtor, inicializa viagens,demais atributos são 
     * instanciados na superclasse
     * @param nome
     * @param caixa
     * @param clientes
     */
    public Agencia(String nome, double caixa, Map<Cliente, Boolean> clientes) {
        super(nome, caixa, clientes);
        this.viagens = new HashMap<Cliente,Destino>();
        this.promocao = 1.0;
        this.estacao = null;
    }

    /**
     * Método construtor, inicializa viagens e adiciona destinos passados no construtor, demais atributos são 
     * instanciados na superclass
     * @param nome
     * @param clientes
     * @param destinos
     */
    public Agencia(String nome, Map<Cliente, Boolean> clientes, Map<Destino, Double> destinos) {
        super(nome, clientes);
        this.destinos = destinos;
        this.viagens = new HashMap<Cliente,Destino>();
        this.promocao = 0.0;
        this.estacao = null;
    }

    /**
     * @return mapeamento de destinos e preços
     */
    public Map<Destino, Double> getDestinos() {
        return destinos;
    }

    /**
     * Adiciona um novo destino ao mapeamento
     * @param destinos
     */
    public void setDestinos(Map<Destino, Double> destinos) {
        this.destinos = destinos;
    }

    /**
     * 
     * @return mapeamento de todas as viagens
     */
    public Map<Cliente, Destino> getViagens() {
        return viagens;
    }

    /**
     * 
     * @param viagens seta as viagens ao mapeamento
     */
    public void setViagens(Map<Cliente, Destino> viagens) {
        this.viagens = viagens;
    }

    /**
     * Busca promoção
     * @return double promocao
     */
    public double getPromocao() {
        return promocao;
    }

    /**
     * Define promoção
     * @param promocao
     */
    public void setPromocao(double promocao) {
        this.promocao = promocao;
    }

    /**
     * Busca estacao
     * @return
     */
    public Estacao getEstacao() {
        return estacao;
    }

    /**
     * Define estacao
     * @param estacao
     */
    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    /**
     * Adiciona um novo cliente ao mapeamento de clientes (pertencente à superclasse Empresa)
     * @param cliente, do tipo Cliente
     */
    public void agenciaAdicionaClientes(Cliente cliente) {
        this.adicionaCliente(cliente);
    }
    
    /**
     * Insere um novo destino e seu preço no mapeamento da agencia:
     *  - Se for VERÃO: Passagens aumentam em 20%
     *  - Se for PRIMAVERA: Passagens aumentam em 15%
     *  - Se for OUTONO: Passagens diminuem 5%
     *  - Se for INVERNO ou houverem promoções passagens diminuem de acordo com promoção disponível 
     * @param destino do tipo Destino
     */
    public void adicionaDestino(Destino destino) {
        if(this.estacao == Estacao.VERAO) {
            this.destinos.put(destino, destino.getPreco() * 1.15);
        } else if(this.estacao == Estacao.PRIMAVERA) {
            this.destinos.put(destino, destino.getPreco() * 1.15);
        } else if (this.estacao == Estacao.OUTONO) {
            this.destinos.put(destino, destino.getPreco() * 0.95);
        } else if( this.promocao > 0.0 || this.estacao == Estacao.INVERNO ) {
            this.destinos.put(destino, destino.getPreco() * (1 + promocao));
        } else {
            this.destinos.put(destino, destino.getPreco());
        }
    }

    /**
     * Verifica se o destino existe no mapeamento destinos
     * @param destino
     * @return valor booleano
     */
    public Boolean buscaDestino(Destino destino) {
        Double destinoExists = this.destinos.get(destino);

        if(destinoExists == null){
            return false;
        }

        return true;
    }

    /**
     * 
     * Realiza o agendamento de uma viagem para o cliente, desde que este esteja devidamente cadastrado
     * e possua status de ativo.
     * @param cliente, variável do tipo Cliente que deverá ser passado para o método a fim de cadastrar uma viagem
     * @param destino, variavel do tipo Destino que deverá ser passado para o método a fim de cadastrar uma viagem
     */
    public void agendaViagem(Cliente cliente, Destino destino) {

        Boolean auxClienteExiste = this.buscaCliente(cliente);
        Boolean auxDestinoExiste = this.buscaDestino(destino);

        if(auxClienteExiste && cliente.getIdade() > 21 && auxDestinoExiste) {
            if(cliente.carteira.getSaldo() >= destino.getPreco()) {
                cliente.carteira.compraSaldo(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else if(cliente.carteira.getLimiteCredito() >= destino.getPreco()){
                cliente.carteira.compraNoCredito(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else if(cliente.carteira.getLimiteDebito() >= destino.getPreco()) {
                cliente.carteira.compraNoDebito(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else if(
                cliente.carteira.getSaldo() + cliente.carteira.getLimiteCredito() + cliente.carteira.getLimiteDebito() >= destino.getPreco()
            ) {
                cliente.carteira.combinaSaldo();
                cliente.carteira.compraSaldo(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else {
                System.out.println("Não foi possível comprar passagens! Saldo insuficiente!");
                return;
            }
        } else {

            this.adicionaDestino(destino);
            this.adicionaCliente(cliente);

            agendaViagem(cliente, destino);
        }
    }

    /**
    * Realiza o agendamento de uma viagem para o cliente, desde que este esteja devidamente cadastrado
    * e possua status de ativo.
    * @param cliente
    * @param destino
    * @param estacao
    */
    public void agendaViagemParaEstacao(Cliente cliente, Destino destino, Estacao estacao) {

        Boolean auxClienteExiste = this.buscaCliente(cliente);
        Boolean auxDestinoExiste = this.buscaDestino(destino);
        this.setEstacao(estacao);

        if(auxClienteExiste && cliente.getIdade() >= 21 && auxDestinoExiste) {
            if(destino.getPreco() > cliente.carteira.getSaldo()) {
                cliente.carteira.compraSaldo(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else if(cliente.carteira.getLimiteCredito() >= destino.getPreco()){
                cliente.carteira.compraNoCredito(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else if(cliente.carteira.getLimiteDebito() >= destino.getPreco()) {
                cliente.carteira.compraNoDebito(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else if(
                cliente.carteira.getSaldo() + cliente.carteira.getLimiteCredito() + cliente.carteira.getLimiteDebito() >= destino.getPreco()
            ) {
                cliente.carteira.combinaSaldo();
                cliente.carteira.compraSaldo(destino.getPreco());
                this.viagens.put(cliente, destino);
                return;
            } else {
                System.out.println("Não foi possível comprar passagens! Saldo insuficiente!");
                return;
            }
        } else {

            this.adicionaDestino(destino);
            this.adicionaCliente(cliente);

            agendaViagemParaEstacao(cliente, destino, estacao);
        }
    }

    /**
     * Remove uma viagem desde que o cliente esteja devidamente cadastrado.
     * @param cliente
     */
    public void cancelaViagem(Cliente cliente) {
        this.viagens.remove(cliente);
    }

    /**
     * Calcula o saldo da agência a partir de todas as viagens adicionadas
     * @return valor do saldo como double
     */
    public double calculaSaldoAgencia() {
        double auxSaldo = 0.0;
        Iterator<Map.Entry<Cliente,Destino>> iterador = this.viagens.entrySet().iterator();
        
        while(iterador.hasNext())
        {
            Map.Entry<Cliente, Destino> viagem = iterador.next();

            auxSaldo += viagem.getValue().getPreco(); 
        }

        this.setCaixa(auxSaldo);
        return auxSaldo;
    }
}
