
public class Aeronave implements Imprimivel, Comparable<Aeronave> {
    public static int totalAeronaves = 0;
    private String codigo;
    private String descricao;
    private int capacidade;

    //////////// Criação do construtor ////////////

    public Aeronave(String codigo, String descricao, int capacidade) {
        totalAeronaves++;
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    //////////// Criação dos gets ////////////

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    //////////// Criação do toString ////////////

    @Override
    public String toString() {
        String lista = "\nCodigo: " + codigo + "\nDescrição: " + descricao + "\nCapacidade: " + capacidade + "\n\n";

        return lista;
    }

    ///////////// Interfaces (Exercício 3) ////////////

    public int getTotalAeronaves() {
        return totalAeronaves;
    }

    public void imprimir() {
        System.out.println(codigo + " - " + descricao);
    }

    public Aeronave compareTo(Aeronave outra) {
        return descricao.compareTo(outra.descricao);

    }

}