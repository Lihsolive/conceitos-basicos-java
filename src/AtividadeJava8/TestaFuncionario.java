package AtividadeJava8;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario[] lista = new Funcionario[3];

		lista[0] = new Funcionario("Arthur Domingues", "casado", 32, "superior completo", "desenvolvedor junior", 5000);
		lista[1] = new Funcionario("Gabriel Martins", "solteiro", 24, "superior em andamento", "estagiário", 2000);
		lista[2] = new Funcionario("Daniela Marques", "solteira", 27, "superior completo", "desenvolvedor junior", 5000);
		
		for(Funcionario roda:lista ) {
			roda.visualizar();
		}
		
		System.out.println("\n\n");
		for(Funcionario roda:lista ) {
			roda.aumentarSalario(15); //15 significa que aumentará 15%, de acordo com a fórmula da classe Funcionário
			roda.visualizar();
		}
		
	}
}
