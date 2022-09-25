package example.app.models;

import java.util.HashMap;
import java.util.Map;

public class Empresa {

    protected String nome;
    protected double caixa;
    protected Map<Integer, Map<Cliente,Boolean>> clientes;

    public Empresa(String nome, Map<Integer, Map<Cliente, Boolean>> clientes) {
        this.nome = nome;
        this.caixa = 0.0;
        this.clientes = clientes;
    }

    
    public Empresa(String nome, double caixa, Map<Integer, Map<Cliente, Boolean>> clientes) {
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

    public Map<Integer, Map<Cliente, Boolean>> getClientes() {
        return clientes;
    }

    public void setClientes(Map<Integer, Map<Cliente, Boolean>> clientes) {
        this.clientes = clientes;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public void adicionaCliente(Cliente cliente) {
        int auxClientesSize = this.clientes.size();
        Map<Cliente, Boolean> auxNovoCliente = new HashMap<Cliente,Boolean>();
        auxNovoCliente.put(cliente, cliente.getIdade() > 21 ? true : false);
        this.clientes.put(auxClientesSize, auxNovoCliente);
    }

    public void removeCliente(int posicao) {
        this.clientes.remove(posicao);
    }
}
