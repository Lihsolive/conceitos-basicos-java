package AtividadeJava4;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num, somaIdadeMenor = 0, somaIdadeMaior = 0;

		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		// inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		// menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		// leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o
		// exemplo abaixo:

		System.out.println("Digite aqui a idade: ");
		num = entrada.nextInt();
		while (num >= 0) {
			if (num < 21) {
				somaIdadeMenor++;
			}
			if (num > 50) {
				somaIdadeMaior++;
			}		
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + somaIdadeMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + somaIdadeMaior);
	}
}