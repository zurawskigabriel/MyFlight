
public class CiaAerea {
    private String codigo;
    private String nome;

    public CiaAerea(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        String lista = "Nome:" + nome + "\nCódigo: " + codigo;

        return lista;
    }
}