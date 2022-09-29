import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos = new ArrayList<>();

    public void addvoos(Voo voo) {
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        return voos;
    }

    public Voo buscarPorData(LocalDateTime datahora) {

        for (int i = 0; i < voos.size(); i++) {
            Voo aux = voos.get(i);
            if (aux.getDataHora().equals(datahora)) {
                return voos.get(i);
            }
        }

        return null;
    }

}