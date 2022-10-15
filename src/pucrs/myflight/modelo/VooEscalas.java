package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {
    private ArrayList<Rota> listarotas = new ArrayList<>();

    public VooEscalas(LocalDateTime dh) {
        super(dh);
    }

    public void addEscala(Rota rota) {
        listarotas.add(rota);
    }

    public ArrayList<Rota> getListaRotas() {
        return listarotas;
    }

    @Override
    public Duracao getDuracao() {
        return null;
    }

    @Override
    public Rota getRota() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + " " + listarotas;
    }
}
