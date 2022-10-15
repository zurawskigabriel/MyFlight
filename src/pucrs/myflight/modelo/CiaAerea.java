package pucrs.myflight.modelo;

public class CiaAerea {
    private String codigo;
    private String nome;

    //////////// Criação do construtor ////////////

    public CiaAerea(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    //////////// Criação dos gets ////////////

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    //////////// Criação do toString ////////////

    @Override
    public String toString() {
        String lista = "Nome:" + nome + "\nCódigo: " + codigo + "\n\n";

        return lista;
    }

}