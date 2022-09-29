import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {

    /////////////// Criação dos objetos ///////////////

    Geo loc = new Geo(111, 222);
    Geo loc1 = new Geo(333, 444);
    Geo geo = new Geo(555, 666);

    CiaAerea cia = new CiaAerea("Gol", "Gol123");
    CiaAerea cia1 = new CiaAerea("TAM", "TAM123");
    CiaAerea cia2 = new CiaAerea("Azul", "Azul123");

    Aeroporto aeroporto = new Aeroporto("Guarulhos123", "Guarulhos", loc);
    Aeroporto aeroporto1 = new Aeroporto("SalgadoFilho123", "Salgado Filho", loc1);
    Aeroporto aeroporto2 = new Aeroporto("Congonhas123", "Congonhas", geo);

    Aeronave aeronave = new Aeronave("Boing 767", "tem fetiche por gemeas", 100);
    Aeronave aeronave1 = new Aeronave("Boing 777", "o fuscão preto é mais rápido", 200);

    Rota rota = new Rota(cia, aeroporto1, aeroporto2, aeronave);
    Rota rota1 = new Rota(cia2, aeroporto, aeroporto2, aeronave1);

    LocalDateTime datahora = LocalDateTime.of(2022, 9, 10, 17, 30);
    LocalDateTime datahora1 = LocalDateTime.of(2022, 8, 14, 07, 40);

    Duration duracao = Duration.ofMinutes(120);
    Duration duracao1 = Duration.ofMinutes(180);

    Voo voo = new Voo(datahora, duracao, rota, Voo.Status.CONFIRMADO);
    Voo voo1 = new Voo(datahora1, duracao1, rota1, Voo.Status.ATRASADO);

    /////////////// Armazenando com os métodos add ///////////////

    GerenciadorAeronaves gerenciadoraeronaves = new GerenciadorAeronaves();
    gerenciadoraeronaves.addaeronaves(aeronave);
    gerenciadoraeronaves.addaeronaves(aeronave1);

    GerenciadorAeroportos gerenciadoraeroportos = new GerenciadorAeroportos();
    gerenciadoraeroportos.addaeroportos(aeroporto);
    gerenciadoraeroportos.addaeroportos(aeroporto1);
    gerenciadoraeroportos.addaeroportos(aeroporto2);

    GerenciadorCias gerenciadorcias = new GerenciadorCias();
    gerenciadorcias.addcias(cia);
    gerenciadorcias.addcias(cia1);
    gerenciadorcias.addcias(cia2);

    GerenciadorRotas gerenciarrotas = new GerenciadorRotas();
    gerenciarrotas.addrotas(rota);
    gerenciarrotas.addrotas(rota1);

    GerenciadorVoos gerenciadorvoos = new GerenciadorVoos();
    gerenciadorvoos.addvoos(voo);
    gerenciadorvoos.addvoos(voo1);

    /////////////// Printando todos com os métodos listar ///////////////

    System.out.println("Aeronaves////////////////////////////////////////////////////////////\n");

    System.out.println(gerenciadoraeronaves.listarTodos().toString());

    System.out.println("Aeroportos////////////////////////////////////////////////////////////");

    System.out.println(gerenciadoraeroportos.listarTodos().toString());

    System.out.println("Cias////////////////////////////////////////////////////////////");

    System.out.println(gerenciadorcias.listarTodos().toString());

    System.out.println("Rotas////////////////////////////////////////////////////////////");

    System.out.println(gerenciarrotas.listarTodos().toString());

    System.out.println("Voos////////////////////////////////////////////////////////////");

    System.out.println(gerenciadorvoos.listarTodos().toString());

    /////////////// Realizando pesquisas e printando ///////////////

    /*
     * System.out
     * .println("Aeronave de código Boing 777: \n" +
     * gerenciadoraeronaves.buscarPorCodigo("Boing 777").toString());
     * 
     * System.out.println("Aeroporto de código SalgadoFilho123: \n\n"
     * + gerenciadoraeroportos.buscarPorCodigo("SalgadoFilho123").toString() +
     * "\n\n");
     * 
     * System.out
     * .println("Empresa de código Azul123: \n\n" +
     * gerenciadorcias.buscarPorCodigo("Azul123").toString() + "\n\n");
     * 
     * System.out.println("Empresa de nome Azul: \n\n" +
     * gerenciadorcias.buscarPorNome("Azul").toString() + "\n");
     * 
     * // System.out.println(
     * // "Rota de origem Congonhas (aeroporto2): \n\n" +
     * // gerenciarrotas.buscarPorOrigem(aeroporto).toString() + "\n\n");
     * 
     * // System.out
     * // .println("Voo das 07:40 (datahora1): \n\n" +
     * // gerenciadorvoos.buscarPorData(datahora1).toString() + "\n\n");
     */

  }
}