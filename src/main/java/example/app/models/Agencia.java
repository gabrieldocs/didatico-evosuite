package example.app.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Agencia extends Empresa {

    protected Map<Destino, Double> destinos;
    protected Map<Cliente, Destino> viagens;

    public Agencia(String nome, double caixa, Map<Cliente, Boolean> clientes) {
        super(nome, caixa, clientes);
        this.viagens = new HashMap<Cliente,Destino>();
    }

    public Agencia(String nome, Map<Cliente, Boolean> clientes, Map<Destino, Double> destinos) {
        super(nome, clientes);
        this.destinos = destinos;
        this.viagens = new HashMap<Cliente,Destino>();
    }

    public Map<Destino, Double> getDestinos() {
        return destinos;
    }

    public void setDestinos(Map<Destino, Double> destinos) {
        this.destinos = destinos;
    }

    public Map<Cliente, Destino> getViagens() {
        return viagens;
    }

    public void setViagens(Map<Cliente, Destino> viagens) {
        this.viagens = viagens;
    }

    public void agenciaAdicionaClientes(Cliente cliente) {
        this.adicionaCliente(cliente);
    }
    
    public void adicionaDestino(Destino destino) {
        this.destinos.put(destino, destino.getPreco());
    }

    public Boolean buscaDestino(Destino destino) {
        Double destinoExists = this.destinos.get(destino);

        if(destinoExists == null){
            return false;
        }

        return true;
    }

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

    public void cancelaViagem(Cliente cliente) {
        this.viagens.remove(cliente);
    }

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
