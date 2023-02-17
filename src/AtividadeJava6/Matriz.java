package AtividadeJava6;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		int soma = 0;
		int vetorSoma[] = new int[3]; // Cria um vetor de 4 posições
		int[][] matrizInteiros = new int[3][3]; // Cria uma Matriz 3X3

		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
		}
		for (int coluna = 0; coluna < 3; coluna++) {
			for (int linha = 0; linha < 3; linha++) {
				if (linha == coluna) {
					System.out.println("\nElementos da diaginal principal: " +  matrizInteiros[linha][coluna]);
					linha++;
				}
			}
		}

	}
}
