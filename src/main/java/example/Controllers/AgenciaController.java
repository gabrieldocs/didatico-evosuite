package example.Controllers;

import java.util.ArrayList;

import example.Models.Agencia;
import example.Models.Cliente;
import example.Models.Destinos;

public class AgenciaController {
    
    public Agencia agencia;
    
    public AgenciaController(Agencia agencia) {
        this.agencia = agencia;
    }

    public Agencia buscarAgencia() {
        return this.agencia;
    }

    public void criarAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void atualizarAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void deletarAgencia() {
        this.agencia = null;
    }

    public ArrayList<Cliente> buscarClientes() {
        return this.agencia.getClientes();
    }
    
    public void criarClientes(Cliente cliente) {
        this.agencia.adicionaCliente(cliente);
    }
    
    public void atualizarClientes(int index, Cliente cliente) {
        this.agencia.adicionaCliente(cliente);
    }
    
    public void deletarClientes(int index) {
        this.agencia.getClientes().remove(index);
    }

    public void buscarDestinos(int cliente) {
        this.agencia.getClientes().get(cliente).getRoteiro();
    }
    public void criarDestinos(Destinos escolha, double desconto) {
        this.agencia.adicionaEscolha(escolha, desconto);
    }

    public void atualizarDestinos() {
        return;
    }

    public void deletarDestinos() {
        return;
    }
}
