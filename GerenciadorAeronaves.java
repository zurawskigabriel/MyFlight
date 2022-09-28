import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves = new ArrayList<>();

    public void addaeronaves(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    /*
     * public ArrayList<Aeronave> listarTodas() {
     * return;
     * }
     */

    public Aeronave buscarPorCodigo(String codigo) {

        for (int i = 0; i < aeronaves.size(); i++) {
            Aeronave aux = aeronaves.get(i);
            if (aux.getCodigo().equals(codigo)) {
                return aeronaves.get(i);
            }
        }

        return null;
    }
}