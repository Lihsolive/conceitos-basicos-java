package AulasJava;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {

		//somaPar precisa de um valor inicial para que seja possível realizar a soma.
		int num, somaPar=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		while(num != 99) {
			if(num % 2 == 0) {
				somaPar += num;
			}
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
		}
		System.out.println("\nSomatório dos números pares: " + somaPar);
		
	}
}
