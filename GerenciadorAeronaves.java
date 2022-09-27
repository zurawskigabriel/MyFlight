import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves = new ArrayList<>();

    public void addaeronaves(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    public int size() {
        return aeronaves.size();
    }

    public ArrayList<Aeronave> listarTodas() {
        return aeronaves;
    }

    /// public Aeronave buscarPorCodigo(String codigo) {
    /// return ;
    /// }
}