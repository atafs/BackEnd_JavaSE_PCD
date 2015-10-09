package pt.progJava.americoLib.control15;

public class Pessoa {

	/* attributes */
	private String nome;
	private Integer idade;

	/* getters and setters */
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

	/* constructor */
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	/* toString */
	@Override
	public String toString() {
		return "[" + this.nome + ", " + this.idade + "]";
	}

	/* equals */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;
			//if (this.idade == p.getIdade() && this.nome == p.getNome()) {
			if(this.idade.equals(p.getIdade()) && this.nome.equals(p.getNome()) ) {	
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/*hashCode*/
	@Override
	public int hashCode() {
		return this.idade*7;
	}

}
