
public class Rota {
    private CiaAerea cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
        this.cia = cia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    @Override
    public String toString() {
        String lista = "Cia: " + cia + "\nAeroporto de Origem: " + origem + "\nAeroporto de Destino: " + destino
                + "\nAeronave: " + aeronave;

        return lista;
    }
}