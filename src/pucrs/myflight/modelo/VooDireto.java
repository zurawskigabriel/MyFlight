package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {

    private Rota rota;

    public VooDireto(LocalDateTime dh, Rota rota) {
        super(dh);
        this.rota = rota;
    }

    @Override
    public Duration getDuracao() {
        int distancia = Geo.distancia(Aeroporto.getLoc(), Aeroporto.getLoc());
        Duration duracao = Duration.ofMinutes(distancia / 805);
        return duracao;
    }

    @Override
    public Rota getRota() {
        return rota;
    }

    @Override
    public String toString() {
        return super.toString() + " " + rota;
    }
}