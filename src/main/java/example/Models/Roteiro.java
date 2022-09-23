package example.Models;

import java.util.ArrayList;

public class Roteiro {
    private ArrayList<Destinos> roteiro;

    public Roteiro(ArrayList<Destinos> roteiro) {
        this.roteiro = roteiro;
    }

    public Roteiro(Destinos destino) {
        this.roteiro.add(destino);
    }

    public ArrayList<Destinos> getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(ArrayList<Destinos> roteiro) {
        this.roteiro = roteiro;
    }

    public void adicionaAoRoteiro(Destinos destino) {
        this.roteiro.add(destino);
    }

    public void removerRoteiro(int position) {
        this.roteiro.remove(position);
    }
}
