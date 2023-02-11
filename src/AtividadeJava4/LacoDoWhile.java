package AtividadeJava4;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num, quantidade = 0, media = 0, parteMedia = 0;

		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		// o número zero seja digitado. Ao final, mostre na tela a média de todos os
		// números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:
		do {
			System.out.println("Digite um número:");
			num = entrada.nextInt();

			if (num % 3 == 0 && num != 0) {
				parteMedia += num;
				quantidade++;
			}
		} while (num != 0);
		media = parteMedia / quantidade;

		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
	}
}
