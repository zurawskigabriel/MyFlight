package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos = new ArrayList<>();

    public void addaeroportos(Aeroporto aeroporto) {
        aeroportos.add(aeroporto);
    }

    public ArrayList<Aeroporto> listarTodos() {
        return aeroportos;
    }

    public Aeroporto buscarPorCodigo(String codigo) {

        for (int i = 0; i < aeroportos.size(); i++) {
            Aeroporto aux = aeroportos.get(i);
            if (aux.getCodigo().equals(codigo)) {
                return aeroportos.get(i);
            }
        }

        return null;
    }
}
