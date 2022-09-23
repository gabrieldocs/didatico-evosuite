package example.Controllers;

import example.Models.Carteira;
import example.Util.ConversorMoedas;

public class CarteiraController {
    private Carteira carteira;
    private ConversorMoedas conversor;

    private CarteiraController(Carteira carteira, ConversorMoedas conversor) {
        this.carteira = carteira;
        this.conversor = conversor;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public ConversorMoedas getConversor() {
        return conversor;
    }

    public void setConversor(ConversorMoedas conversor) {
        this.conversor = conversor;
    }    

    public double converteQuantiaParaDolar() {
        return this.carteira.getQuantia() / this.conversor.getDolar();
    }

    public double converteQuantiaParaEuro() {
        return this.carteira.getQuantia() / this.conversor.getEuro();
    }

    public double converteQuantiaParaLibra() {
        return this.carteira.getQuantia() / this.conversor.getLibra();
    }

    public double converteQuantiaDeDolar(double quantia) {
        return quantia * this.conversor.dolar;
    }

    public double converteQuantiaQuantiaDeEuro(double quantia) {
        return quantia * this.conversor.euro;
    }

    public double converteQuantiaDeLibra(double quantia) {
        return quantia * this.conversor.libra;
    }
}
