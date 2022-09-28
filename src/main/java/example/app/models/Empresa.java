package example.app.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Empresa {

    protected String nome;
    protected double caixa;
    protected Map<Cliente,Boolean> clientes;

    /**
     * Método construtor
     * @param nome
     * @param clientes
     */
    public Empresa(String nome, Map<Cliente, Boolean> clientes) {
        this.nome = nome;
        this.caixa = 0.0;
        this.clientes = clientes;
    }

    
    /**
     * Método construtor
     * @param nome
     * @param caixa
     * @param clientes
     */
    public Empresa(String nome, double caixa, Map<Cliente, Boolean> clientes) {
        this.nome = nome;
        this.caixa = caixa;
        this.clientes = clientes;
    }


    /**
     * Busca nome da empresa
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define nome da empresa
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Busca mapeamento de clientes da empresa
     * @return
     */
    public Map<Cliente, Boolean> getClientes() {
        return clientes;
    }

    /**
     * Define mapeamento de clientes da empresa
     * @param clientes
     */
    public void setClientes(Map<Cliente, Boolean> clientes) {
        this.clientes = clientes;
    }

    /**
     * Busca caixa da empresa
     * @return double caixa
     */
    public double getCaixa() {
        return caixa;
    }

    /**
     * Define caixa da empresa
     * @param caixa
     */
    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    /**
     * Adiciona novo cliente ao mapeamento de clientes. Caso o cliente tenha menos que 21 anos ele 
     * é adicionado com status de inativo (falso).
     * @param cliente
     */
    public void adicionaCliente(Cliente cliente) {
        this.clientes.put(cliente, cliente.getIdade() > 21 ? true : false);
    }

    /**
     * Remove um cliente do mapeamento
     * @param cliente
     */
    public void removeCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    /**
     * Verifica se o cliente existe no mapeamento, se sim retorna verdadeiro, senão retorna falso
     * @param cliente
     * @return
     */
    public Boolean buscaCliente(Cliente cliente) {

        Boolean auxCliente = this.clientes.get(cliente);

        if(auxCliente == null) {
            return false;
        }
        return auxCliente;
    }

    /**
     * Verifica se o cliente está ativo, se sim retorna verdadeiro, senão retorna falso
     * @param cliente
     * @return
     */
    public Boolean buscaClienteAtivo(Cliente cliente) {

        Boolean auxCliente = this.clientes.get(cliente);

        if(auxCliente) {
            return true;
        }
        return false;
    }

    /**
     * Retorna uma lista com todos os clientes
     * @return ArrayList<Cliente> com todos os clientes
     */
    public ArrayList<Cliente> listaTodosClientes() {
        ArrayList<Cliente> auxClientes = new ArrayList<Cliente>(); 
        Iterator<Map.Entry<Cliente,Boolean>> iterador = this.clientes.entrySet().iterator();
        
        while(iterador.hasNext())
        {
            Map.Entry<Cliente, Boolean> cliente = iterador.next();

            auxClientes.add(cliente.getKey()); 
        }

        return auxClientes;
    }

    /**
     * Retorna uma lista com todos os clientes ativos!
     * @return ArrayList<Cliente> com todos os clientes ativos
     */
    public ArrayList<Cliente> listaTodosClientesAtivos() {
        ArrayList<Cliente> auxClientes = new ArrayList<Cliente>(); 
        Iterator<Map.Entry<Cliente,Boolean>> iterador = this.clientes.entrySet().iterator();
        
        while(iterador.hasNext())
        {
            Map.Entry<Cliente, Boolean> cliente = iterador.next();

            if(cliente.getKey().getIdade() > 21)
                auxClientes.add(cliente.getKey()); 
        }

        return auxClientes;
    }

    /**
     * Retorna uma lista com todos os clientes inativos
     * @return ArrayList<Cliente> com todos os clientes inativos
     */
    public ArrayList<Cliente> listaTodosClientesInativos() {
        ArrayList<Cliente> auxClientes = new ArrayList<Cliente>(); 
        Iterator<Map.Entry<Cliente,Boolean>> iterador = this.clientes.entrySet().iterator();
        
        while(iterador.hasNext())
        {
            Map.Entry<Cliente, Boolean> cliente = iterador.next();

            if(cliente.getKey().getIdade() < 21)
                auxClientes.add(cliente.getKey()); 
        }

        return auxClientes;
    }    
}
