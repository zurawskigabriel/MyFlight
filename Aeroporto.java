
public class Aeroporto {
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
        String lista = "Codigo: " + codigo + "\nNome: " + nome + "\nLocalização: " + loc;

        return lista;
    }
}