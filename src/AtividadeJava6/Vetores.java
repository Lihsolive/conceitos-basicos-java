package AtividadeJava6;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

		int num, i;

		System.out.println("Digite um valor para procurar no vetor");
		num = input.nextInt();

		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				System.out.println("O número digitado encontra-se no índice " + i + ".");
			}else {
				System.out.println("Número não encontrado no vetor.");
			}
		}
	}
}
