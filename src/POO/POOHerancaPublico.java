package POO;

public class POOHerancaPublico extends POOHerancaTelefone {

	public POOHerancaPublico() {
		super("Telefone Publico");
	}
	
	@Override
	public void toca(int numToques) {
		for(int i=0; i<numToques; i++);{
			System.out.println("Piriririmmm Piriririmmm Piriririmmm");			
		}
	}
	public void disca(String numero) {
		
		if(numero.charAt(0) == '9' || numero.charAt(0)=='8') {
			System.out.println("Es");
			
		}
	}
}
