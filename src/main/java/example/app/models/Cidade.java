package example.app.models;

import example.Types.Climas;

public class Cidade {
    protected String nome;
    protected Integer populacao;
    protected Climas clima;
    
    /**
     * 
     * @param nome da cidade
     * @param populacao da cidade
     * @param clima da cidade pode ser Chuvoso, Ensolarado, Agradável, Tempestuoso ou de Ventania
     */
    public Cidade(String nome, Integer populacao, Climas clima) {
        this.nome = nome;
        this.populacao = populacao;
        this.clima = clima;
    }

    /**
     * 
     * @return string nome da cidade
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da cidade
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Busca população da cidade
     * @return
     */
    public Integer getPopulacao() {
        return populacao;
    }

    /**
     * Define a população da cidade
     * @param populacao
     */
    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    /**
     * Busca o clima da cidade
     * @return
     */
    public Climas getClima() {
        return clima;
    }

    /**
     * Define o clima da cidade
     * @param clima
     */
    public void setClima(Climas clima) {
        this.clima = Climas.CHUVOSO;
    }

    
}
