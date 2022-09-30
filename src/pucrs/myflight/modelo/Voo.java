package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.Duration;

public class Voo {
    enum Status {
        CONFIRMADO, ATRASADO, CANCELADO
    }

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;

    //////////// Criação do construtor ////////////

    public Voo(LocalDateTime datahora, Duration duracao, Rota rota, Status status) {
        this.datahora = datahora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    //////////// Criação dos gets ////////////

    public LocalDateTime getDataHora() {
        return datahora;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rota;
    }

    public Status getStatus() {
        return status;
    }

    //////////// Criação do toString ////////////

    @Override
    public String toString() {
        String lista = "Horário:  " + datahora + "\nDuração: " + duracao + "\nRota: " + rota + "\nStatus: " + status
                + "\n\n";

        return lista;
    }

    //////////// sobrecarga (Exercicio) ////////////

    public Voo(Duration duracao, Rota rota, Status status) {
        // LocalDateTime datahora = new LocalDateTime.of(2022, 4, 12, 16, 30);
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }
}