package AulasJava;

import java.util.Scanner;

public class LacoDecisao {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		int op;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leitura.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leitura.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leitura.nextDouble();
		
		media = (n1 + n2 + n3)/3;
		System.out.printf("\nA média é: %.1f", media);
		
		if(media >= 7 && media <= 10) {
			System.out.println("\nParabés! Você foi APROVADE!!!");
		} else if (media >= 5 && media < 7) {
			System.out.println("\nAtenção! Você está de EXAME!!!");
		} else if (media >= 0 && media < 5) {
			System.out.println("\nInfelizamente você foi REPROVADE!!!");
		} else {
			System.out.println("\nVerifique as notas, MÉDIA INVÁLIDA!!!");
		}
		
		System.out.println("\n\t\tMenu de elogios");
		System.out.println("\n1 - Sensacional");
		System.out.println("\n2 - Incrível");
		System.out.println("\n3 - Maravilhosa");
		System.out.println("\n4 - Legal");
		System.out.println("\nDigite sua opção: ");
		op = leitura.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nSensacional!");
		break;
		case 2:
			System.out.println("\nIncrível!");
		break;
		case 3:
			System.out.println("\nMaravilhosa!");
		break;
		case 4:
			System.out.println("\nLegal!");
		break;
		default :
			System.out.println("\nOpção inválida!!!");
		
		}
	}
}
