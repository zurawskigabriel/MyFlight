
public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo loc;

    public Aeroporto(String codigo, String nome, Geo loc) {
        this.codigo = codigo;
        this.nome = nome;
        this.loc = loc;

    }

    @Override
    public String toString() {
        String lista = "Codigo: " + codigo + "\nNome: " + nome + "\nLocalização: " + loc;

        return lista;
    }
}