package pt.progJava.americoLib.control75_aula1_2;

public class Militante {
	
	//attributes
	private int numero;//numero
	private String nome;//nome
	private int anoInscricao;//anoInscricao
	private String cidadeRecenseamento;//cidadeResenceamento
	
	//constructor
	public Militante(String nome, int anoInscricao, String cidadeRecenseamento) {
		this.nome = nome;
		this.anoInscricao = anoInscricao;
		this.cidadeRecenseamento = cidadeRecenseamento;
	}

	//getters and setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoInscricao() {
		return anoInscricao;
	}

	public String getCidadeRecenseamento() {
		return cidadeRecenseamento;
	}
	
	@Override
	public String toString() {
		return "[Militante: " + getNumero() + ", " + getNome() + ", " + getAnoInscricao() + ", " + getCidadeRecenseamento() + "]" ;
	}
}
