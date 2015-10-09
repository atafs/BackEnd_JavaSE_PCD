package OO_03Pessoa;

public class Pessoa {

	/* attributes */
	public String nome;
	public int idade;
	public double peso;

	/* constructors */
	public Pessoa() {
		nome = "";
		idade = 0;
		peso = 0.0;
	}

	public Pessoa(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
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
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso
				+ "]";
	}

}
