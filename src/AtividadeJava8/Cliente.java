package AtividadeJava8;

public class Cliente {

	private String nome;
	private int idade;
	private String profissao;
	private String endereco;
	private String email;

	public Cliente(String nome, int idade, String profissao, String endereco, String email) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		this.endereco = endereco;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void visualizar() {
		System.out.println(nome + " tem " + idade + " trabalha como " + profissao + ", e mora na rua" + endereco
				+ ". Seu email para contato é o " + email);
	}
}
