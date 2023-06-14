package AtividadeJava6;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[][] matriz = new int [3][3];
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("\n" + matriz[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("\nDiagonal principal: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i]);
		}
		System.out.println("\nDiagonal secundária: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i].length - 1 -i);
		}	

	}

}
