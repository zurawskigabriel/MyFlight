
public class Aeronave implements Imprimivel, Contavel {
    public static int totalAeronaves = 0;
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String codigo, String descricao, int capacidade) {
        totalAeronaves++;
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    ///////////// Interfaces (Exercício 3) ////////////

    public int getTotalAeronaves() {
        return totalAeronaves;
    }

    public void imprimir() {
        System.out.println(codigo + " - " + descricao);
    }

}