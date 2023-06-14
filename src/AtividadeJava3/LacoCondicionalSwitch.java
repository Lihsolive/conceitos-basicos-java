package AtividadeJava3;

import java.util.Scanner;

public class LacoCondicionalSwitch {

	public static void main(String[] args) {
		
		float num1, num2, soma, subtracao, multiplicacao, divisao;
		int calc, codigo, quantidade;
		float valor;

		Scanner entrada = new Scanner(System.in);
		// 5 - Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de
		// um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número
		// inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto
		// que foi comprado (feito com o instrutor)
		
		System.out.println("\nLanchonete Família60");
		System.out.println("\nCódigo 1 - Cachorro Quente - R$10,00");
		System.out.println("\nCódigo 2 - X-Salada - R$15,00");
		System.out.println("\n Código 3 - X-Bacon - R$18,00");
		System.out.println("\nLanchonete Família60");
		System.out.println("\nLanchonete Família60");
		System.out.println("\nLanchonete Família60");
		System.out.println("\nLanchonete Família60");
		codigo = entrada.nextInt();
		System.out.println("\nDigite a quantidade de produtos: ");
		quantidade = entrada.nextInt();
		
		switch(codigo) {
			case 1:
				valor = quantidade * 10;
				System.out.println("\nProduto: Cachorro Quente - Valor a pagar: " + valor);
			break;
			case 2:
				valor = quantidade * 18;
				System.out.println("\nProduto: X-Bacon - Valor a pagar: " + valor);
			break;
			case 3:
				valor = quantidade * 12;
				System.out.println("\nProduto: Bauru - Valor a pagar: " + valor);
			break;
			case 4:
				valor = quantidade * 10;
				System.out.println("\nProduto: Refrigerante- Valor a pagar: " + valor);
			break;
			case 5:
				valor = quantidade * 10;
				System.out.println("\nProduto: Cachorro Quente - Valor a pagar: " + valor);
			break;
			case 6:
				valor = quantidade * 10;
				System.out.println("\nProduto: Cachorro Quente - Valor a pagar: " + valor);
			break;
			default:
				System.out.println("\nEscolha uma opção válida!!!");
		}
		
		

		
		
		
		
		
		
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
