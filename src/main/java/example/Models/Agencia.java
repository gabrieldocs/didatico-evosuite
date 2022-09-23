package example.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import example.Types.Estacao;

public class Agencia extends Empresa {

    private double promocao;
    private Estacao estacao;
    private Map<Destinos, Double> escolhas = new HashMap<Destinos, Double>();

    public Agencia(String nome, String sigla, double promocao, Estacao estacao) {
        super(nome, sigla);
        this.promocao = promocao;
        this.estacao = estacao;
    }

    public Agencia(String nome, String sigla, double promocao, Estacao estacao, Map<Destinos, Double> escolhas) {
        super(nome, sigla);
        this.promocao = promocao;
        this.estacao = estacao;
        this.escolhas = escolhas;
    }

    public Agencia(String nome, String sigla, ArrayList<Cliente> clientes, double promocao, Estacao estacao,
            Map<Destinos, Double> escolhas) {
        super(nome, sigla, clientes);
        this.promocao = promocao;
        this.estacao = estacao;
        this.escolhas = escolhas;
    }

    public double getPromocao() {
        return promocao;
    }

    public void setPromocao(double promocao) {
        this.promocao = promocao;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    public Map<Destinos, Double> getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(Map<Destinos, Double> escolhas) {
        this.escolhas = escolhas;
    }

    public void adicionaEscolha(Destinos escolha, double desconto) {
        this.escolhas.put(escolha, desconto);
    }
    
}
