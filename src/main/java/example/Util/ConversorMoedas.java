package example.Util;

public class ConversorMoedas {

    public double dolar;
    public double euro;
    public double libra;

    public double quantia;

    /**
     * Construtor do conversor de moedas
     * @param dolar
     * @param euro
     * @param libra
     * @param quantia
     */
    public ConversorMoedas(double dolar, double euro, double libra, double quantia) {
        this.dolar = dolar;
        this.euro = euro;
        this.libra = libra;
        this.quantia = quantia;
    }

    
    /**
     * Construtor do conversor de moeadas
     * @param euro
     * @param quantia
     */
    public ConversorMoedas(double euro, double quantia) {
        this.euro = euro;
        this.quantia = quantia;
    }


    /**
     * Retorna a cotação do dólar
     * @return
     */
    public double getDolar() {
        return dolar;
    }

    /**
     * define a cotação do dólar
     * @param dolar
     */
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    /**
     * Busca a cotação do Euro
     * @return
     */
    public double getEuro() {
        return euro;
    }

    /**
     * Define a cotação do Euro
     * @param euro
     */
    public void setEuro(double euro) {
        this.euro = euro;
    }

    /**
     * Busca a cotação da libra
     * @return
     */
    public double getLibra() {
        return libra;
    }

    /**
     * Define a cotação da libra
     * @param libra
     */
    public void setLibra(double libra) {
        this.libra = libra;
    }

    /**
     * Retorna a quantia total
     * @return
     */
    public double getQuantia() {
        return quantia;
    }

    /**
     * Define a quantia total
     * @param quantia
     */
    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    /**
     * 
     * @param quantia
     * @return
     */
    public double converteQuantiaParaDolar(double quantia) {
        return this.quantia * this.dolar;
    }

    /**
     * 
     * @param quantia
     * @return
     */
    public double converteQuantiaParaLibra(double quantia) {
        return quantia * this.dolar;
    }
}