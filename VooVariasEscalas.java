
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo {
    private ArrayList<Rota> escalas = new ArrayList<>();

    public VooEscalas(Rota rotaFinal, LocalDateTime datahora, Duration duracao, Rota rota, Status status) {
        super(datahora, duracao, rota, status);
        this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal() {
        return rotaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }
}
