package example.Models;

import java.util.HashMap;
import java.util.Map;

import example.Types.Climas;

public class Destinos extends Cidade {

    private double preco;

    private Map<String, Integer> atracoes = new HashMap<String, Integer>();

    public Destinos(String nome, int populacao, int quantidade_atracoes, boolean cidade_turistica, Climas clima,
            double preco) {
        super(nome, populacao, quantidade_atracoes, cidade_turistica, clima);
        this.preco = preco;
    }

    public Destinos(String nome, int populacao, int quantidade_atracoes, boolean cidade_turistica, Climas clima,
            double preco, Map<String, Integer> atracoes) {
        super(nome, populacao, quantidade_atracoes, cidade_turistica, clima);
        this.preco = preco;
        this.atracoes = atracoes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Map<String, Integer> getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(Map<String, Integer> atracoes) {
        this.atracoes = atracoes;
    }    

    public void adicionaAtracoes(String arg0, Integer arg1) {
        this.atracoes.put(arg0, arg1);
    }
}
