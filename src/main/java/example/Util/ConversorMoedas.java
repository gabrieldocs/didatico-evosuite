package example.Util;

public class ConversorMoedas {

    public double dolar;
    public double euro;
    public double libra;

    public double quantia;

    public ConversorMoedas(double dolar, double euro, double libra, double quantia) {
        this.dolar = dolar;
        this.euro = euro;
        this.libra = libra;
        this.quantia = quantia;
    }

    

    public ConversorMoedas(double euro, double quantia) {
        this.euro = euro;
        this.quantia = quantia;
    }


    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getLibra() {
        return libra;
    }

    public void setLibra(double libra) {
        this.libra = libra;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

}