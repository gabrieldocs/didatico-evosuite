package example.app.models;

import java.util.ArrayList;

import example.Types.Climas;

public class Destino extends Cidade {

    protected Double preco;
    protected ArrayList<String> atracoes;
    protected Boolean cidadeTuristica;
    
    public Destino(String nome, Integer populacao, Climas clima, Double preco) {
        super(nome, populacao, clima);
        this.preco = preco;
        this.cidadeTuristica = false;
    }

    public Destino(String nome, Integer populacao, Climas clima, Double preco, ArrayList<String> atracoes) {
        super(nome, populacao, clima);
        this.preco = preco;
        this.atracoes = atracoes;
        if(atracoes.size() > 5) {
            this.cidadeTuristica = true;
        }
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ArrayList<String> getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(ArrayList<String> atracoes) {
        this.atracoes = atracoes;
    }

    public Boolean getCidadeTuristica() {
        return cidadeTuristica;
    }

    public void setCidadeTuristica(Boolean cidadeTuristica) {
        this.cidadeTuristica = cidadeTuristica;
    }
    
    public void adicionaAtracao(String atracao) {
        this.atracoes.add(atracao);
    }
    
    public void removeAtracao(int posicao) {
        this.atracoes.remove(posicao);
    }
}
