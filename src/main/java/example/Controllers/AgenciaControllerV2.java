package example.Controllers;

import java.util.ArrayList;

import example.Models.Agencia;
import example.Models.Cliente;
import example.Models.Destinos;

/**
 * @author Lucas Gabriel
 */
public class AgenciaController {
    
    public Agencia agencia;
    
    /**
     * 
     * @param agencia
     */
    public AgenciaController(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * 
     * @return
     */
    public Agencia buscarAgencia() {
        return this.agencia;
    }

    /**
     * 
     * @param agencia
     */
    public void criarAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * 
     * @param agencia
     */
    public void atualizarAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * 
     */
    public void deletarAgencia() {
        this.agencia = null;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Cliente> buscarClientes() {
        return this.agencia.getClientes();
    }
    
    /**
     * 
     * @param cliente
     */
    public void criarClientes(Cliente cliente) {
        this.agencia.adicionaCliente(cliente);
    }
    
    /**
     * 
     * @param index
     * @param cliente
     */
    public void atualizarClientes(int index, Cliente cliente) {
        this.agencia.adicionaCliente(cliente);
    }
    
    /**
     * 
     * @param index
     */
    public void deletarClientes(int index) {
        this.agencia.getClientes().remove(index);
    }

    /**
     * 
     * @param cliente
     */
    public void buscarDestinos(int cliente) {
        this.agencia.getClientes().get(cliente).getRoteiro();
    }

    /**
     * 
     * @param escolha
     * @param desconto
     */
    public void criarDestinos(Destinos escolha, double desconto) {
        this.agencia.adicionaEscolha(escolha, desconto);
    }

    /**
     * 
     */
    public void atualizarDestinos() {
        return;
    }

    /**
     * 
     */
    public void deletarDestinos() {
        return;
    }
}
