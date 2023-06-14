package AtividadeJava8;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Maria Alessandra", 27, "publicitária", "Rua Carlos de Andrade",
				"mari-ale@email.com");
		
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Patrícia Souza", 25, "desenvolvedora", "Rua Domingues Cardoso",
				"mari-ale@email.com");
		cliente2.visualizar();

	}
}
