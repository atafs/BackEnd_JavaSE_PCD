package pt.progJava.americoLib.control22;

public class Pessoa {

	/* attribtutes */
	private String nome;
	private Integer idade;
	private String cpf;

	/* constructor */
	public Pessoa(String nome, Integer idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/* toString */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf
				+ "] " + "[HashCode: " + this.hashCode() + "]";
	}

	/* hasCode */
	@Override
	public int hashCode() {
		Integer i = Integer.parseInt(cpf);
		return i * 7;
	}

	/* equals */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;
			if (this.cpf.equals(p.getCpf())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
