package example.Controllers;

import java.util.ArrayList;
import java.util.Map;

import example.Models.Destinos;

public class DestinosController {

    private ArrayList<Destinos> destinos;

    public DestinosController(ArrayList<Destinos> destinos) {
        this.destinos = destinos;
    }

    public ArrayList<Destinos> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Destinos> destinos) {
        this.destinos = destinos;
    }

    public void adicionaDestino(Destinos novoDestino) {
        this.destinos.add(novoDestino);
    }

    public void removeDestino(int position) {
        this.destinos.remove(position);
    }

    public void substituiDestino(Destinos novoDestino, int position) {
        this.destinos.set(position, novoDestino);
    }

    public void atualizaValorDestino(Destinos novoDestino, double valor) {
        novoDestino.setPreco(valor);
    }

    public Map<String, Double> buscaAtracoesNoDestino(int index) {
        if(this.destinos.get(index) == null)
            return null;
            
        return this.destinos.get(index).getAtracoes();
    }

    public void adicionaAtracoesNoDestino(int index, String nome, double valor) {
        if(this.destinos.get(index) == null)
            return;

        this.destinos.get(index).adicionaAtracoes(nome, valor);
    }

    public void removeAtracoesNoDestino(int index, String nome) {
        if(this.destinos.get(index) == null)
            return;

        this.destinos.get(index).removeAtracoes(nome);
    }

    public double precoDestinos() {
        double total = 0.0;

        for(Destinos d: destinos) {
            total += d.getPreco();
        }

        return total;
    }
}
