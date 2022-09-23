package example.Controllers;

import java.util.ArrayList;

import example.Models.Carteira;
import example.Models.Cliente;
import example.Models.Destinos;
import example.Models.Roteiro;

public class ClienteController {

    public ArrayList<Cliente> clientes;

    public ClienteController(ArrayList<Cliente> clientes) {
        if(this.clientes == null) {
            this.clientes = new ArrayList<Cliente>();
        }

        if(
            this.clientes != null &&
            this.clientes.isEmpty()
        ) {
            this.clientes = clientes;
        }

        if(
            this.clientes != null && 
            this.clientes.isEmpty() == false
        ) {
            for(Cliente c: clientes) {
                this.clientes.add(c);
            }
        }
    }

    public ClienteController(Cliente cliente) {

        if(this.clientes == null) {
            this.clientes = new ArrayList<Cliente>();
        }

        if(
            this.clientes != null &&
            this.clientes.isEmpty() == true
        ) {
            this.clientes.add(cliente);
        }

        if(this.clientes.isEmpty() == false) {
            this.clientes.add(cliente);
        }
    }

    public ArrayList<Cliente> buscarClientes() {
        return this.clientes;
    }

    public Cliente buscarClientePorId(String _id) {
        
        for( int i = 0; i <= clientes.size(); i++) {
            if(this.clientes.get(i).getId().equals(_id)) {
                return this.clientes.get(i);
            }
        }
        return null;
    }
    
    public void criarCliente(String nome, String id) {
        Cliente c = new Cliente(nome, id);
        this.clientes.add(c);
    }

    public void atualizarClientePorPosicao(int position, Cliente novoCliente) {
        Cliente c = null;
        c = new Cliente(this.clientes.get(position).getNome(), this.clientes.get(position).getEmail());
        c.setId(this.clientes.get(position).getId());
        this.clientes.set(position, novoCliente);
    }

    public void atualizarClientePorId(String _id, Cliente novoCliente) {
        Cliente c = null;
        int index = 0;
        for( int i = 0; i <= clientes.size(); i++) {
            if(this.clientes.get(i).getId().equals(_id)) {
                index = i;
                c = new Cliente(this.clientes.get(i).getNome(), this.clientes.get(i).getEmail());
            }
        }

        if(novoCliente.getNome() != null && novoCliente.getEmail() != null) {
            c.setNome(novoCliente.getNome());
            c.setEmail(novoCliente.getEmail());
            return;
        }
        this.clientes.set(index, novoCliente);
    }

    public void deletarCliente(int index) {
        this.clientes.remove(index);
    }

    public void adicionarVoucher(Cliente cliente, String valor) {
        Cliente c = new Cliente(this.buscarClientePorId(cliente.getId()).getNome(), this.buscarClientePorId(cliente.getId()).getEmail());
        c.setVoucher(valor);
        return;
    }

    public String buscaVoucher(Cliente cliente) {
        Cliente c = new Cliente(this.buscarClientePorId(cliente.getId()).getNome(), this.buscarClientePorId(cliente.getId()).getEmail());
        return c.getVoucher();
    }

    public void criaNovoRoteiro(Cliente cliente, Destinos destino) {
        this.buscarClientePorId(cliente.getId()).setRoteiro(new Roteiro(destino));   
    }

    public void limpaRoteiro(Cliente cliente) {
        this.buscarClientePorId(cliente.getId()).setRoteiro(null);   
    }

    public void criaNovaCarteira(Cliente cliente, Carteira carteira) {
        this.buscarClientePorId(cliente.getId()).adicionaCarteira(carteira);
    }
}
