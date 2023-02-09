package AulasJava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		String nome = "Liliam Oliveira";
		int idade = 25;
		double altura = 1.65,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSeu nome é: " + nome);
		System.out.println("\nSua idade é: " + idade);
		System.out.println("\nSua altura é: " + altura);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nA média do aluno " + nome + "foi de: " + media);
		System.out.printf("\nA média do aluno %s foi de: %.2f  e a nota 1 foi de: %.2f", nome, media, nota1);		
	}
}