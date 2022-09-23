package example.Models;

import java.util.ArrayList;

public class Empresa {
    private String nome; 
    private String sigla;
    private ArrayList<Cliente> clientes;
    
    

    public Empresa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public Empresa(String nome, String sigla, ArrayList<Cliente> clientes) {
        this.nome = nome;
        this.sigla = sigla;
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    } 
    
    public void adicionaCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
}
