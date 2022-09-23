package example.Models;

public class Carteira {
    private String nome;
    private double quantia;
    private double credito;
    private double debito;
    
    public Carteira(String nome, double quantia, double credito, double debito) {
        this.nome = nome;
        this.quantia = quantia;
        this.credito = credito;
        this.debito = debito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    
    public void adicionarCredito(double valor) {
        this.credito += valor;
    }
    
    public void compraCredito(double valor) {
        this.adicionarCredito(-1 * valor);
    }
    
    public void adicionarDebito(double valor) {
        this.debito += valor;
    }

    public void compraDebito(double valor) {
        this.adicionarDebito(-1 * valor);
    }

    public void retirada(double valor) {
        this.quantia -= valor;
    }

    public void deposito(double valor) {
        this.quantia += valor;
    }
}
