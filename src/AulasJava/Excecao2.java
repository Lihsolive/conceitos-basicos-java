package AulasJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

	// exemplo exececao quando ocorre uma divisão por zero
	// throws significa
	public static int quociente(int numerador, int denominador) throws ArithmeticException { // para verificar erros
																								// aritméticos

		return numerador / denominador; //
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean continuaLoop = true;

		do {
			try {
				System.out.println("\nEntre com o numerador: ");
				int numerador = scanner.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = scanner.nextInt();
				int resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				continuaLoop = false;
											// inputMismatchException - aqui foi o nome dado para o erro. Geralmente
											// utiliza-se o mesmo nome da excecao.
			} catch (InputMismatchException inputMismatchException) {
				System.err.printf("\nTipo de Exception: %s\n", inputMismatchException);
				scanner.next();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro. Por favor, tente novamente.");
			} catch (ArithmeticException arithmeticException) {
				System.out.printf("\nTipo de Exception: %s\n", arithmeticException);
				System.out.println("\nZero é um denominador inválido. Por favor, digite outro número!!!");
			}
		} while (continuaLoop);
		{
		}
	}

}
