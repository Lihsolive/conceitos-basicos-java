package AtividadeJava2;

import java.util.Scanner;

public class ProgramacaoSequencial {

	public static void main(String[] args) {

		int diasAno = 365, diasMes = 30, anos, meses, dias, idadeDias;
		double numA, numB, numC, numD, numS, numR;
		float a, b, c, d, e, f, x, y;

		Scanner entrada = new Scanner(System.in);

		// Faça um programa que leia a idade de uma pessoa expressa em anos, meses e
		// dias e mostre-a expressa apenas em dias.
		/*
		 * System.out.println("\nInforme a sua idade em: ");
		 * 
		 * System.out.println("\nAnos: "); anos = entrada.nextInt();
		 * System.out.println("\nMeses: "); meses = entrada.nextInt();
		 * System.out.println("\nDias: "); dias = entrada.nextInt();
		 * 
		 * 
		 * idadeDias = (anos * diasAno) + (meses * diasMes) + dias;
		 * 
		 * System.out.println("\nA sua idade em dias é: " + idadeDias);
		 */

		// Escreva um programa que leia três números inteiros e positivos (A, B, C) e
		// calcule a seguinte expressão:
		//D = (R + S)/2, onde:
		//R = (A + B)²   e S = (B + C)² 
		
		/*
		System.out.println("\nInsira o primeiro valor: ");
		numA = entrada.nextDouble();
		System.out.println("\nInsira o segundo valor: ");
		numB = entrada.nextDouble();
		System.out.println("\nInsira o terceiro valor: ");
		numC = entrada.nextDouble();
		
		numR = Math.pow(numA, 2) + Math.pow(numB, 2);
		numS = Math.pow(numB, 2) + Math.pow(numC, 2);
		numD = (numR + numS)/2;
		
		System.out.println("\nO valor de R foi de: " + numR);
		System.out.println("\nO resultado da operação: " + numD + " = (" + numR + " + " + numS + ") é: " + numD);
		*/
		
		
		//7
		System.out.println("\nEntre com o valor de A: ");
		a = entrada.nextFloat();
		System.out.println("\nEntre com o valor de B: ");
		b = entrada.nextFloat();
		System.out.println("\nEntre com o valor de C: ");
		c = entrada.nextFloat();
		System.out.println("\nEntre com o valor de D: ");
		d = entrada.nextFloat();
		System.out.println("\nEntre com o valor de E: ");
		e = entrada.nextFloat();
		System.out.println("\nEntre com o valor de F: ");
		f = entrada.nextFloat();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
				
		System.out.printf("\nO valor de x é: %.1f e o valor de y é: %.1f", x, y);
		

	}

}
