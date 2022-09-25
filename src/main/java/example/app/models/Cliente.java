package example.app.models;

public class Cliente extends Pessoa {

    protected String email;
    protected String fone;
    protected Carteira carteira;

    public Cliente(String nome, int idade, String email, String fone) {
        super(nome, idade);
        this.email = email;
        this.fone = fone;
    }

    
    public Cliente(String nome, int idade, String email, String fone, Carteira carteira) {
        super(nome, idade);
        this.email = email;
        this.fone = fone;
        this.carteira = carteira;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }


}
