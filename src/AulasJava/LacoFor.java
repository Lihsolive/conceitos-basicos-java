package AulasJava;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		float n1,n2,n3, media, somaMedia=0,mediaGeral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 1; x <= 4; x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			media = (n1+n2+n3)/3;
			System.out.printf("\nA média do alune " + x + " foi de: " + media);
			somaMedia += media;
		}
		
		mediaGeral = somaMedia / 4;
		
		System.out.printf("\nMédia geral: %.1f", mediaGeral);
		

	}

}
