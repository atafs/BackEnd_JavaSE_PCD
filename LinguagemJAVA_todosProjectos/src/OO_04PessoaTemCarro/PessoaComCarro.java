package OO_04PessoaTemCarro;

public class PessoaComCarro {

	/* attributes */
	String nome;
	int idade;
	Carro carro;

	/* constructors */
	public PessoaComCarro() {
		nome = "";
		idade = 0;

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

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public PessoaComCarro(String nome, int idade, Carro carro) {
		this.nome = nome;
		this.idade = idade;
		this.carro = carro;
	}

	/* methods */
	public void andar() {
		System.out.println(this.nome + " esta a andar!!\n");
	}

	public void verificarIdade() {
		System.out.println(this.nome + " tem " + this.idade + "\n");
	}

	/* toString */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
