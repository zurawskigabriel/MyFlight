package pucrs.myflight.modelo;

public class Rota {
    private CiaAerea cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    //////////// Criação do construtor ////////////

    public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
        this.cia = cia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    //////////// Criação dos gets ////////////

    public CiaAerea getcia() {
        return cia;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    //////////// Criação do toString ////////////

    @Override
    public String toString() {
        String lista = "Cia: " + cia + "\nAeroporto de Origem: " + origem + "\nAeroporto de Destino: " + destino
                + "\nAeronave: " + aeronave + "\n\n";

        return lista;
    }

    //////////// Uso so compareTo (Exercicio) ////////////

}