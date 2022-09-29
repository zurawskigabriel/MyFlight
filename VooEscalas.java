import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {

    public VooEscalas(Duration duracao, Rota rota, Voo.Status status) {
        super(duracao, rota, status);
        this.rotafinal = rotafinal;
    }

    private Rota rotafinal;

    public Rota getRotaFianl() {
        return rotafinal;
    }

    // @Override
    // public String toString(){
    // String stg= "Status:"+ status;//+ " " + datahora + "("+duracao+"): " + rota +
    // " -> " + rotaFinal;
    // return stg;
    // }

    /*
     * 
     * 
     * 
     * Comentarios
     * 
     * 
     */
}
