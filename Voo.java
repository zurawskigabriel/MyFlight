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

    public Voo(LocalDateTime datahora, Duration duracao, Rota rota, Status status) {
        this.datahora = datahora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    @Override
    public String toString() {
        String lista = "Horário:  " + datahora + "\nDuração: " + duracao + "\nRota: " + rota + "\nStatus: " + status;

        return lista;
    }

    //////////// sebrescrita /////////////

    public Voo(LocalDateTime datahora, Duration duracao) {
        this.datahora = datahora;
        this.duracao = duracao;
    }
}