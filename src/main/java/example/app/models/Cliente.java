package example.app.models;

public class Cliente extends Pessoa {
    protected String email;
    protected String fone;

    public Cliente(String nome, Integer idade, String email, String fone) {
        super(nome, idade);
        this.email = email;
        this.fone = fone;
    }

}
