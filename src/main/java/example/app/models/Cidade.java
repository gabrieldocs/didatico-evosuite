package example.app.models;

import example.Types.Climas;

public class Cidade {
    protected String nome;
    protected Integer populacao;
    protected Climas clima;
    
    public Cidade(String nome, Integer populacao, Climas clima) {
        this.nome = nome;
        this.populacao = populacao;
        this.clima = clima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public Climas getClima() {
        return clima;
    }

    public void setClima(Climas clima) {
        this.clima = clima;
    }

    
}
