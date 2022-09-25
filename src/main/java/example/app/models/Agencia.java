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

    public void AgenciaAdicionaClientes(Cliente cliente) {
        this.adicionaCliente(cliente);
    }
    
    public void marcaViagem(Cliente cliente, Destino destino) {
        Boolean auxClienteExiste = this.buscaCliente(cliente);
        if(auxClienteExiste) {
            this.viagens.put(cliente, destino);
        } else {
            this.adicionaCliente(cliente);
            marcaViagem(cliente, destino);
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

        return auxSaldo;
    }
}
