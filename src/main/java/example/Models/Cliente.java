package example.Models;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    private String _id;
    private String voucher;
    private ArrayList<Carteira> carteiras;
    private Roteiro roteiro;

    

    public Cliente(String nome, String _id, String voucher, ArrayList<Carteira> carteiras, Roteiro roteiro) {
        super(nome);
        this._id = _id;
        this.voucher = voucher;
        this.carteiras = carteiras;
        this.roteiro = roteiro;
    }

    public Cliente(String nome, String email, String _id, String voucher, ArrayList<Carteira> carteiras,
            Roteiro roteiro) {
        super(nome, email);
        this._id = _id;
        this.voucher = voucher;
        this.carteiras = carteiras;
        this.roteiro = roteiro;
    }

    public Cliente(String nome, String email, String id, String _id, String voucher, ArrayList<Carteira> carteiras,
            Roteiro roteiro) {
        super(nome, email, id);
        this._id = _id;
        this.voucher = voucher;
        this.carteiras = carteiras;
        this.roteiro = roteiro;
    }

    public Cliente(String nome) {
        super(nome);
    }

    public Cliente(String nome, String email) {
        super(nome, email);
    }

    public Cliente(String nome, String email, String id) {
        super(nome, email, id);
    }

    public Cliente(String nome, String _id, String voucher, ArrayList<Carteira> carteiras) {
        super(nome);
        this._id = _id;
        this.voucher = voucher;
        this.carteiras = carteiras;
    }

    public Cliente(String nome, String email, String _id, String voucher, ArrayList<Carteira> carteiras) {
        super(nome, email);
        this._id = _id;
        this.voucher = voucher;
        this.carteiras = carteiras;
    }

    public Cliente(String nome, String email, String id, String _id, String voucher, ArrayList<Carteira> carteiras) {
        super(nome, email, id);
        this._id = _id;
        this.voucher = voucher;
        this.carteiras = carteiras;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public ArrayList<Carteira> getCarteiras() {
        return carteiras;
    }

    public void setCarteiras(ArrayList<Carteira> carteiras) {
        this.carteiras = carteiras;
    }

    public void adicionaCarteira(Carteira carteira) {
        this.carteiras.add(carteira);
    }

    public Roteiro getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(Roteiro roteiro) {
        this.roteiro = roteiro;
    }

    @Override
    public String toString() {
        return "Cliente [_id=" + _id + ", carteiras=" + carteiras + ", roteiro=" + roteiro + ", voucher=" + voucher
                + "]";
    }

    public void setCarteiras(boolean add) {
    }   
    
}
