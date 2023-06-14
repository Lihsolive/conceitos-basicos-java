package AulasJava;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		float [] media = new float[4];
		float n1, n2, n3, somaMedia=0, mediaGeral;
		int x; //representa o índice do array. No caso, haverão 4 posições: 0, 1, 2 e 3) 
		
		Scanner leia = new Scanner(System.in);
		
		
		//.length - pega o tamanho do array
		for(x=0; x<media.length; x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
				
			media[x] = (n1+n2+n3)/3;
			System.out.println("\nMédia: " + media[x]);
			somaMedia += media[x];
		}
		mediaGeral = somaMedia / 4;
		System.out.printf("\nMédia geral da turma foi de: %.2f", mediaGeral);
		
		for(x=0; x<4; x++) {
			System.out.println("\nMédia do alune"+(x+1)+" foi de: " +media[x]);
		}

	}

}
