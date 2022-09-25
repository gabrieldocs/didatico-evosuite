package example.app.models;

public class Carteira {
    
    private double saldo;
    private double limiteCredito;
    private double limiteDebito;
    
    public Carteira(double saldo, double limiteCredito, double limiteDebito) {
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
        this.limiteDebito = limiteDebito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteDebito() {
        return limiteDebito;
    }

    public void setLimiteDebito(double limiteDebito) {
        this.limiteDebito = limiteDebito;
    }

    public double saldoTotal() {
        return this.saldo + this.limiteCredito + this.limiteDebito;
    }

    public void adicionaSaldo(double valor) {
        this.saldo += valor;
    }


    public void compraSaldo(double valor) {
        try {
            if(this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                throw new Error("Saldo insuficiente");
            }
        } catch(Error e) {
            System.out.println(e.getMessage());
        }
    }

    public void compraNoCredito(double valor) {
        try {
            if(this.limiteCredito >= valor) {
                this.limiteCredito -= valor;
            } else {
                throw new Error("Saldo insuficiente");
            }
        } catch(Error e) {
            System.out.println(e.getMessage());
        }
    }

    public void compraNoDebito(double valor) {
        try {
            if(this.limiteDebito >= valor) {
                this.limiteDebito -= valor;
            } else {
                throw new Error("Saldo insuficiente");
            }
        } catch(Error e) {
            System.out.println(e.getMessage());
        }
    }

    public void combinaSaldo() {
        this.saldo = this.saldo + this.limiteCredito + this.limiteDebito;
        this.setLimiteCredito(0.0);
        this.setLimiteDebito(0.0);
    }
}

