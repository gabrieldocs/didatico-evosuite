package example.app.models;

public class Carteira {
    
    /** Saldo armazenado na carteira */
    private double saldo;
    /** Limte total de crédito da carteira */
    private double limiteCredito;
    /** Limte total de débito da carteira */
    private double limiteDebito;
    
    /**
     * Método construtor da classe Carteira
     * @param saldo, valor total armazenado na carteira
     * @param limiteCredito, valor total de crédito do usuário
     * @param limiteDebito, valor total de débito do usuário
     */
    public Carteira(double saldo, double limiteCredito, double limiteDebito) {
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
        this.limiteDebito = limiteDebito;
    }

    /**
     * Busca saldo da carteira
     * @return saldo da carteira
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Seta o saldo na carteira
     * @param saldo, valor a ser definido como saldo da carteira
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Busca limite de crédito na carteira
     * @return, limite de crédito na carteira
     */
    public double getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * Seta o limite de crédito na carteira
     * @param limiteCredito, valor a ser definido como limite de crédito da carteira
     */
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    /**
     * Busca limite de crédito na carteira
     * @return, limite de crédito na carteira
     */
    public double getLimiteDebito() {
        return limiteDebito;
    }

    /**
     * Seta limite de débito da carteira
     * @param limiteDebito, valor a ser adicionado como limite de débito
     */
    public void setLimiteDebito(double limiteDebito) {
        this.limiteDebito = limiteDebito;
    }

    /**
     * Saldo completo da carteira, somando tudo o que o usuário possui
     * @return double
     */
    public double saldoTotal() {
        return this.saldo + this.limiteCredito + this.limiteDebito;
    }

    /**
     * Incrementa o saldo do usuário em algum valor
     * @param valor a ser incrementado na carteira
     */
    public void adicionaSaldo(double valor) {
        this.saldo += valor;
    }

    /**
     * Transações devem ser feitas prioritariamente com este valor
     * @param valor a ser debitado na carteira
     */
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

    /**
     * Transações podem ser feitas com o cartão de crédito
     * @param valor a ser reduzido do crédito
     */
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

    /**
     * Transações podem ser feitas com o cartão de débito
     * @param valor a ser debitado
     */
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

    /**
     * Comprar maiores podem requerer que o usuário utilize mais que um cartão,
     * deste modo ele pode combinar os saldos com crédito e débito.
     */
    public void combinaSaldo() {
        this.saldo = this.saldo + this.limiteCredito + this.limiteDebito;
        this.setLimiteCredito(0.0);
        this.setLimiteDebito(0.0);
    }
}

