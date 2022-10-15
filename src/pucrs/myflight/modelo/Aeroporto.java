package pucrs.myflight.modelo;

public class Aeroporto implements Comparable<Aeroporto> {
    private String codigo;
    private String nome;
    private Geo loc;

    //////////// Criação do construtor ////////////

    public Aeroporto(String codigo, String nome, Geo loc) {
        this.codigo = codigo;
        this.nome = nome;
        this.loc = loc;
    }

    //////////// Criação dos gets ////////////

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Geo getLoc() {
        return loc;
    }

    //////////// Criação do toString ////////////

    @Override
    public String toString() {
        String lista = "Codigo: " + codigo + "\nNome: " + nome + "\nLocalização: " + loc + "\n\n";

        return lista;
    }

    //////////// Ordenação com Comparable (Exercicio) ////////////

    public int compareTo(Aeroporto outra) {
        return nome.compareTo(outra.getNome());
    }
}