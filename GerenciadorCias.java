
import java.util.ArrayList;

public class GerenciadorCias {
    public ArrayList<CiaAerea> empresas = new ArrayList<>();

    public void addcias(CiaAerea empresa) {
        empresas.add(empresa);
    }

    public ArrayList<CiaAerea> listarTodos() {
        return empresas;
    }

    public CiaAerea buscarPorCodigo(String codigo) {

        for (int i = 0; i < empresas.size(); i++) {
            CiaAerea aux = empresas.get(i);
            if (aux.getCodigo().equals(codigo)) {
                return empresas.get(i);
            }
        }

        return null;
    }

    public CiaAerea buscarPorNome(String nome) {

        for (int i = 0; i < empresas.size(); i++) {
            CiaAerea aux = empresas.get(i);
            if (aux.getNome().equals(nome)) {
                return empresas.get(i);
            }
        }

        return null;
    }

}
