package AtividadeJava7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDados {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		Scanner input = new Scanner(System.in);

		int opcao;
		String nome;
		

		while (true) {
			System.out.println("**********************************************************");
			System.out.println("                                                          ");
			System.out.println("             1 - Adicionar Cliente na Fila                ");
			System.out.println("             2 - Listar todos os Clientes                 ");
			System.out.println("             3 - Retirar Cliente da Fila                  ");
			System.out.println("             0 - Sair                                     ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("               Entre com a opção desejada!                ");
			System.out.println("                                                          ");

			opcao = input.nextInt();

			if (opcao == 0) {
				System.out.println("\nSaindo do Menu!");
				input.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Adicionar Cliente na Fila\n\n");
				break;
			case 2:
				System.out.println("Listar todos os Clientes\n\n");
				break;
			case 3:
				System.out.println("Retirar Cliente da Fila\n\n");
				break;
			case 4:
				System.out.println("Sair\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
			
			if(opcao == 1) {
			}
		}
	}
}
