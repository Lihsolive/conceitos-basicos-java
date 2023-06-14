package POO;

public class PooHerancaCelular extends POOHerancaTelefone {
	
	public PooHerancaCelular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("tanananã tarararã");
			break;
		case 2:
			System.out.println("Blim blim blim");
			break;
			default:
				System.out.println("Pararã Pararã Pararã");
		}
	}
		@Override
		public void disca(String numero) {
			System.out.println("O número: " +numero+ " é um celular...");
			
		
	}
	

}
