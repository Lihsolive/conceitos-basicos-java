package POO;

public class Automovel {
	// declaração dos atributos da classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	// construtor
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		super();
		this.nomeProprietario = nomeProprietario; // inicialização dos atributos
		this.modelo = modelo; // coloca-se o this para que o programa entenda que está
		this.placa = placa; // referenciando o atributo
		this.ano = ano;
	}

	public Automovel(int ano) {
		super();
		this.ano = ano;
	}

	// Criação de Gets e Sets

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void imprimirInfo() {
		System.out.println(nomeProprietario + " possui um(a) " + modelo + " com placa " + placa + " e ano " + ano);
	}

}
