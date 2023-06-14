package ada;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		
		//formas de criação de Array
		
		/*String [] letras = new String [5];
		letras[0] = "A";
		letras[1] = "B";
		letras[2] = "C";
		letras[3] = "J";
		letras[4] = "X";
		*/
			
		String[] letras = {"A", "B", "C", "J", "X"};
		for (int i=0; i < letras.length; i++) {
			System.out.println(letras[i]);}
			//nesse caso, a saída será: 
			//A
			//B
			//C
			//J
			//X
		
		System.out.println(Arrays.toString(letras));
		//nesse caso, a saída será: [A, B, C, J, X]
		
		
		//Para descobrir o maior e menor elemento de um Array e a média entre eles:
		int[] numeros = {9, 10, 12, 25, 2};
		int maior = numeros[0];
		int menor = numeros[0];
		int media =0;
	
		for (int i=0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			media += numeros[i];
			//isso é o mesmo que dizer: media = media + numeros[i];
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Media: " + media/numeros.length);
	}

}
