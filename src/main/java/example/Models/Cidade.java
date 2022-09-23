package example.Models;

import example.Types.Climas;

public class Cidade {
    
    private String nome; 
    private int populacao;
    private int quantidade_atracoes;
    private boolean cidade_turistica;
    private Climas clima;
    
    public Cidade(String nome, int populacao, int quantidade_atracoes, boolean cidade_turistica, Climas clima) {
        this.nome = nome;
        this.populacao = populacao;
        this.quantidade_atracoes = quantidade_atracoes;
        this.cidade_turistica = cidade_turistica;
        this.clima = clima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getQuantidade_atracoes() {
        return quantidade_atracoes;
    }

    public void setQuantidade_atracoes(int quantidade_atracoes) {
        this.quantidade_atracoes = quantidade_atracoes;
    }

    public boolean isCidade_turistica() {
        return cidade_turistica;
    }

    public void setCidade_turistica(boolean cidade_turistica) {
        this.cidade_turistica = cidade_turistica;
    }

    public Climas getClima() {
        return clima;
    }

    public void setClima(Climas clima) {
        this.clima = clima;
    }

    
    
}
