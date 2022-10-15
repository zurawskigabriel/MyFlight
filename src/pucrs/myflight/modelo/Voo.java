package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.Duration;

public abstract class Voo
{
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO }; 

    private LocalDateTime datahora;
    private Status status;

    public Voo(LocalDateTime dh) {
       this.datahora = dh;
       this.status = Status.CONFIRMADO;
    }

    public LocalDateTime getDataHora() { 
        return datahora; 
    }

    public abstract Rota getRota();

    public abstract Duracao getDuracao(); 
    
    @Override
    public String toString() {
       return status + " " + datahora;
    }
}

    //////////// sobrecarga (Exercicio) ////////////

    /*public Voo(Duration duracao, Rota rota, Status status) {
        LocalDateTime dh = new LocalDateTime.of(2016, 8, 12, 12, 00);
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }*/
}