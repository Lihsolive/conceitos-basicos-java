package POO;

public interface Figuras {
	
	public String nameIterface = "Figuras";
	
	abstract public String getNome(); //o getNome é apenas o nome escolhido para o método
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();

}
