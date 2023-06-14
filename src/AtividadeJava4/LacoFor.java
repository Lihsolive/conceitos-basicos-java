package AtividadeJava4;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		int x, num, par=0, impar=0;
		
		Scanner input = new Scanner(System.in);
     
		// 2- Algoritmo em Java, que lê 10 números inteiros via teclado e
		// mostra na tela quantos números são pares e quantos número são ímpares. Veja o
		// exemplo abaixo:

	        for(x = 1; x <= 10; x++){
	            System.out.println("Digite o " + x + "º número: ");
	            num = input.nextInt();
	            
	            if(num % 2 == 0){
	                par++;
	            } else {
	                impar++;
	            }
	        }  
	        System.out.println("\nTotal de números pares: " + par);
	        System.out.println("\nTotal de números ímpares: " + impar);
	}
}
