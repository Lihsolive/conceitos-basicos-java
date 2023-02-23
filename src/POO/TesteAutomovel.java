package POO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// instanciando um objeto da classe automóvel

		Automovel auto1 = new Automovel("Bruna Cardoso", "Fox", "BCR6942", 2023);

		auto1.imprimirInfo();

		System.out.println("\nTranferência de proprietário:");
		auto1.setNomeProprietario("Liliam Oliveira");
		auto1.imprimirInfo();

		System.out.println("\nAlterando placa");
		auto1.setPlaca("BRA0S23");
		auto1.imprimirInfo();

		System.out.println("\nAlterando modelo");
		auto1.setModelo("Hilux");
		auto1.imprimirInfo();

	}
}
