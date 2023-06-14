package AulasJava;

public class Excecao {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}catch(NullPointerException e) { //captura de uma possível exceção. O 'e' seria um apelido para "exception"
			
			//tratamento da exceção
			System.out.println("\nA frase inicial está nula, para solucionar o problema, foi atribuido um valor defaul.");
			frase = "Liliam Oliveira";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: " +frase);
		System.out.println("\nFrase nova: " +novaFrase);
	}

}
