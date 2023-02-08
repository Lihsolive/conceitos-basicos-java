package AtividadeJava1;

import java.util.Scanner;

public class EntradaSaidaOperadores {

	public static void main(String[] args) {
		
		//Calcular novo salário
		double salario, abono, novoSalario, nota1, nota2, nota3, nota4, media, salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		int num1, num2, num3, num4, produtoDiferenca;
		
		
		Scanner entrada = new Scanner (System.in);
		/*
		System.out.println("\nInforme o salário: ");
		salario = entrada.nextDouble();
		System.out.println("\nInforme o valor do abono: ");
		abono = entrada.nextDouble();
		
		novoSalario = salario + abono;
		
		System.out.println("\nO novo salário será " + novoSalario);
		*/
		
		//Calcular notas 
		/*
		System.out.println("\nDigite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = entrada.nextDouble();
		System.out.println("\nDigite a quarta nota: ");
		nota4 = entrada.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nA média de notas é %.1f", media);
		*/
		
		//Calcular salário líquido
		/*
		System.out.println("\nDigite o salário bruto: ");
		salarioBruto = entrada.nextDouble();
		System.out.println("\nDigite o valor do adicional noturno");
		adicionalNoturno = entrada.nextDouble();
		System.out.println("\nDigite as horas extras ");
		horasExtras = entrada.nextDouble();
		System.out.println("\nDigite o valor dos descontos: ");
		descontos = entrada.nextDouble();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO salário líquido é %.2f" , salarioLiquido);
		*/
		
		//Calcular produto e diferença entre produtos
		
		System.out.println("\nDigite o primeiro valor: ");
		num1 = entrada.nextInt();
		System.out.println("\nDigite o segundo valor: ");
		num2 = entrada.nextInt();
		System.out.println("\nDigite o terceiro valor: ");
		num3 = entrada.nextInt();
		System.out.println("\nDigite o último valor: ");
		num4 = entrada.nextInt();
		
		produtoDiferenca = (num1 * num2) - (num3 * num4);
		
		
		System.out.println("\nO resultado da expressão: (" + num1 + " * " + num2 + ") - " + "(" + num3 + " * " + num4 + ") é " + produtoDiferenca);
				
	}

}
