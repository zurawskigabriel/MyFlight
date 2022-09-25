public class Main {
    public static void main(String[] args) {
        String nome = "Gol", codigo = "11111", descricao = "duas asas";
        int capacidade = 100;
        double latitude = 0.0, longitude = 0.0;

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Geo loc = new Geo(latitude, longitude);
        CiaAerea cia = new CiaAerea(nome, codigo);
        Aeroporto origem = new Aeroporto(codigo, nome, loc);
        Aeroporto destino = new Aeroporto(codigo, nome, loc);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Geo geo = new Geo(latitude, longitude);
        Aeronave aeronave = new Aeronave(codigo, descricao, capacidade);
        Aeroporto aeroporto = new Aeroporto(codigo, nome, loc);
        CiaAerea empresa = new CiaAerea(nome, codigo);
        Rota rota = new Rota(cia, origem, destino, aeronave);
        Voo voo = new Voo(datahora, duracao, rota, status);

    }
}