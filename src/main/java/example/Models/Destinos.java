package example.Models;

import java.util.HashMap;
import java.util.Map;

import example.Types.Climas;

public class Destinos extends Cidade {

    private double preco;

    private Map<String, Double> atracoes = new HashMap<String, Double>();

    public Destinos(String nome, int populacao, int quantidade_atracoes, boolean cidade_turistica, Climas clima,
            double preco) {
        super(nome, populacao, quantidade_atracoes, cidade_turistica, clima);
        this.preco = preco;
    }

    public Destinos(String nome, int populacao, int quantidade_atracoes, boolean cidade_turistica, Climas clima,
            double preco, Map<String, Double> atracoes) {
        super(nome, populacao, quantidade_atracoes, cidade_turistica, clima);
        this.preco = preco;
        this.atracoes = atracoes;
    }

    public Destinos(String nome, int populacao, int quantidade_atracoes, boolean cidade_turistica, Climas clima) {
        super(nome, populacao, quantidade_atracoes, cidade_turistica, clima);
    }

    public Destinos(Destinos destinos, double preco, Map<String, Double> atracoes) {
        super(
            destinos.getNome(), 
            destinos.getPopulacao(), 
            destinos.getQuantidade_atracoes(),
            destinos.getCidade_turistica(),
            destinos.getClima()
        );
        this.preco = preco;
        this.atracoes = atracoes;
    }

    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Map<String, Double> getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(Map<String, Double> atracoes) {
        this.atracoes = atracoes;
    }    

    public void adicionaAtracoes(String arg0, Double arg1) {
        this.atracoes.put(arg0, arg1);
        this.preco += arg1;
    }

    public void removeAtracoes(String arg0) {
        this.atracoes.remove(arg0);
    }
}
