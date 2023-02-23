package AtividadeJava8;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private String estadoCivil;
	private int idade;
	private String grauDeInstrucao;
	private String funcao;
	private double salario;

	public Funcionario(String nome, String estadoCivil, int idade, String grauDeInstrucao, String funcao,
			double salario) {
		this.nome = nome;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
		this.grauDeInstrucao = grauDeInstrucao;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGrauDeInstrucao() {
		return grauDeInstrucao;
	}

	public void setGrauDeInstrucao(String grauDeInstrucao) {
		this.grauDeInstrucao = grauDeInstrucao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1+ percentual /100; 
	}
	

	public String FormatarMoeda() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}

	public void visualizar() {
		System.out.println("\nNome: "+nome+"\t\tSalário: "+this.FormatarMoeda());
		System.out.println("\nIdade: "+idade+"\t\tEstado Civil: "+estadoCivil);
		System.out.println("\nGrau de Instrução: "+grauDeInstrucao+"\t\tFunção: "+funcao);
		System.out.println("\n");
		
	}

}
