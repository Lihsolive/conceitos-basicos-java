package AulasJava;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		//DoWhile executa e depois testa;
		//While teste e depois executa;
		
		int tabuada, x=1, res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEntre com a tabuada: ");
		tabuada = leia.nextInt();
		do {
			res = tabuada * x;
			System.out.println("\n" + tabuada + " X " + x + " = " + res);
			x++;
		}while(x <= 10);
	}
}
