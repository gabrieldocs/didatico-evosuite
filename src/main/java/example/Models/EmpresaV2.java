package example.Models;

import java.util.Map;
import java.util.HashMap;

public class EmpresaV2 {

    protected String nome;
    protected Map<Integer, Map<Cliente, Boolean>> clientes;

    
    public EmpresaV2(String nome) {
        this.nome = nome;
        this.clientes = new HashMap<Integer,Map<Cliente,Boolean>>();
    }


    public EmpresaV2(String nome, Map<Integer, Map<Cliente, Boolean>> clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Map<Integer, Map<Cliente,Boolean>> getClientes() {
        return clientes;
    }

    public void setClientes(Map<Integer, Map<Cliente, Boolean>> clientes) {
        this.clientes = clientes;
    }

    public void resetListaClientes() {
        this.clientes = new HashMap<Integer,Map<Cliente,Boolean>>();
    }

    public void limpaListaClientes() {
        this.clientes = null;
    }
    
    public void adicionaNovoCliente(Cliente cliente) {
        Map<Cliente, Boolean> novoCliente = new HashMap<Cliente, Boolean>();
        novoCliente.put(cliente, false);
        this.clientes.put(this.clientes.size() + 1, novoCliente );
    }

}
