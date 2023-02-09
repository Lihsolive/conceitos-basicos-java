package AtividadeJava3;

import java.util.Scanner;

public class LacoCondicionalSwitch {

	public static void main(String[] args) {
		
		float num1, num2, soma, subtracao, multiplicacao, divisao;
		int calc;

		Scanner entrada = new Scanner(System.in);
		// 7 - Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma
		// Calculadora simples. O programa deverá ler dois números float: numero1 e
		// numero2, e na sequência ler o Código da operação matemática (número inteiro
		// de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2
		// números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem
		// Operação Inválida!
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = entrada.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		num2 = entrada.nextFloat();
		
		System.out.println("\n\t\tEscolha a operação: ");
		System.out.println("\n1- Soma");
		System.out.println("\n2- Subtração");
		System.out.println("\n3- Multiplicação");
		System.out.println("\n4- Divisão");
		calc = entrada.nextInt();
		
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
		
		switch(calc) {
		case 1:
			System.out.println("\n " + num1 + " + " + num2 + " = " + soma);
		break;
		case 2:
			System.out.println("\n " + num1 + " - " + num2 + " = " + subtracao);
		break;
		case 3:
			System.out.println("\n " + num1 + " * " + num2 + " = " + multiplicacao);
		break;
		case 4:
			System.out.println("\n " + num1 + " / " + num2 + " = " + divisao);
		break;
		default:
			System.out.println("\nOperação inválida!!!");
		}	
	}
}
