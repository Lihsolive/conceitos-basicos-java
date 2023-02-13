package AtividadeJava5;

import java.util.Scanner;

public class ExerciciosRepeticao {

	public static void main(String[] args) {

		// 1 - Informar todos os números de 1000 a 1999 que quando divididos por 11
		// obtemos
		// resto = 5. (FOR)
		/*
		 * int num; for (num = 1000; num <= 1999; num++) { if (num % 11 == 5) {
		 * System.out.println(num); } } /
		 * 
		 * // 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		 * (FOR) /* // num - números a serem recebidos pelo usuário; // x - quantas
		 * vezes o programa pedirá para o usuário digitar um número; // par - para fazer
		 * a contagem de números pares;
		 * 
		 * int num, x, par = 0;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * for(x = 1; x <= 10; x++) { System.out.println("\nDigite o " + x + "°" +
		 * " número: "); num = input.nextInt(); if(num % 2 == 0) { par++; } }
		 * System.out.print("\nTotal de números pares: " + par);
		 */

		// 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com
		// menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina
		// quando idade for = -99. (WHILE)
		/*
		 * Scanner entrada = new Scanner(System.in); int num, menor21 = 0, maior50 = 0;
		 * 
		 * System.out.println("Digite aqui a idade: "); num = entrada.nextInt();
		 * 
		 * while (num != -99) { System.out.println("\nDigite aqui a idade: "); num =
		 * entrada.nextInt(); System.out.println("\nDigite -99 para sair!!! "); if (num
		 * < 21) { menor21++; } if (num > 50) { maior50++; } }
		 * System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
		 * System.out.println("\nTotal de pessoas maiores de 50 anos: " + maior50);
		 */

		// Crie um programa que leia um número do teclado até que encontre um número
		// igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		/*
		 * int num, soma=0, contador=0;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * do { System.out.println("\nDigite um número: "); num = input.nextInt();
		 * if(num != 0) { contador++; soma += num; } }while(num > 0);
		 * 
		 * System.out.println("\nA soma dos números digitados é: " + soma);
		 */

		// Escrever um programa que receba vários números inteiros no teclado. E no
		// final imprimir a média dos números múltiplos de 3. Para sair digitar
		// 0(zero).(DO...WHILE)

		int num, soma = 0, contador = 0;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número: ");
			num = input.nextInt();
			if (num != 0) {
				contador++;
			} if(num % 3 == 0) {
				soma += num;				
			}
		} while (num > 0);

		System.out.println("\nA soma dos números digitados é: " + soma);

	}
}
