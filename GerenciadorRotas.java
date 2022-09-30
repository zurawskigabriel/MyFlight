
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas = new ArrayList<>();

    public void addrotas(Rota rota) {
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodos() {
        return rotas;
    }

    public Rota buscarPorOrigem(Aeroporto origem) {

        for (int i = 0; i < rotas.size(); i++) {
            Rota aux = rotas.get(i);
            if (aux.getOrigem().equals(origem)) {
                return rotas.get(i);
            }
        }

        return null;
    }

}
