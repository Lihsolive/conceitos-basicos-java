package POO;

public abstract class POOHerancaTelefone {
	
	private String tipo;
	
	abstract public void disca(String numero); //
	abstract public void toca(int numToques);
	
	
	public POOHerancaTelefone(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
}
