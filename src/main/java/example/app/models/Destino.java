package example.app.models;

import java.util.ArrayList;

import example.Types.Climas;

public class Destino extends Cidade {

    /** Preço do deslocamente até o destino */
    protected Double preco;
    /** Lista de atrações da cidade */
    protected ArrayList<String> atracoes;
    /** Booleano verdadeiro se a cidade é turistica, false se contrário */
    protected Boolean cidadeTuristica;
    
    /**
     * Método construtor
     * @param nome
     * @param populacao
     * @param clima
     * @param preco
     */
    public Destino(String nome, Integer populacao, Climas clima, Double preco) {
        super(nome, populacao, clima);
        this.preco = preco;
        this.cidadeTuristica = false;
    }

    /**
     * Método construtor
     * @param nome
     * @param populacao
     * @param clima
     * @param preco
     * @param atracoes
     */
    public Destino(String nome, Integer populacao, Climas clima, Double preco, ArrayList<String> atracoes) {
        super(nome, populacao, clima);
        this.preco = preco;
        this.atracoes = atracoes;
        if(atracoes.size() > 5) {
            this.cidadeTuristica = true;
        }
    }

    /**
     * Busca preço
     * @return double preço
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Define o preço
     * @param preco
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * Retorna lista de atrações como ArrayList
     * @return
     */
    public ArrayList<String> getAtracoes() {
        return atracoes;
    }

    /**
     * Define uma lista de atrações
     * @param atracoes
     */
    public void setAtracoes(ArrayList<String> atracoes) {
        this.atracoes = atracoes;
    }

    /**
     * Retorna um booleano se a cidade é turística
     * @return
     */
    public Boolean getCidadeTuristica() {
        return cidadeTuristica;
    }

    /**
     * Define um booleano para cidae turística
     * @param cidadeTuristica
     */
    public void setCidadeTuristica(Boolean cidadeTuristica) {
        this.cidadeTuristica = cidadeTuristica;
    }
    
    /**
     * Adiciona nova atração na cidade
     * @param atracao
     */
    public void adicionaAtracao(String atracao) {
        this.atracoes.add(atracao);
    }
    
    /**
     * Remove uma atração da lista de atrações
     * @param posicao
     */
    public void removeAtracao(int posicao) {
        this.atracoes.remove(posicao);
    }
}
