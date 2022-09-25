package example.app.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Empresa {

    protected String nome;
    protected double caixa;
    protected Map<Cliente,Boolean> clientes;

    public Empresa(String nome, Map<Cliente, Boolean> clientes) {
        this.nome = nome;
        this.caixa = 0.0;
        this.clientes = clientes;
    }

    
    public Empresa(String nome, double caixa, Map<Cliente, Boolean> clientes) {
        this.nome = nome;
        this.caixa = caixa;
        this.clientes = clientes;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Cliente, Boolean> getClientes() {
        return clientes;
    }

    public void setClientes(Map<Cliente, Boolean> clientes) {
        this.clientes = clientes;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public void adicionaCliente(Cliente cliente) {
        this.clientes.put(cliente, cliente.getIdade() > 21 ? true : false);
    }

    public void removeCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public Boolean buscaCliente(Cliente cliente) {

        Boolean auxCliente = this.clientes.get(cliente);

        if(auxCliente == null) {
            return false;
        }
        return true;
    }

    public Boolean buscaClienteAtivo(Cliente cliente) {

        Boolean auxCliente = this.clientes.get(cliente);

        if(auxCliente) {
            return true;
        }
        return false;
    }

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
