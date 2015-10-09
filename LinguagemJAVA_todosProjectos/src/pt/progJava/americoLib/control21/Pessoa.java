package pt.progJava.americoLib.control21;

public class Pessoa implements Comparable<Pessoa>{

	/* attribtutes */
	private String nome;
	private Integer idade;

	/* constructor */
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	/* getters and setters */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/* toString */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", Idade=" + idade + "]";
	}

	/*implements Comparable*/
	@Override
	public int compareTo(Pessoa p) {
		return this.idade.compareTo(p.getIdade());
	}

}
