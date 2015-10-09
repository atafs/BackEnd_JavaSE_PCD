package pt.progJava.americoLib.control13;

public class Pessoa {

	/* atributes */
	private int idade;
	private static int contador;// quantas instancias de cada classe tenho

	/* getters and setters */
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Pessoa.contador = contador;
	}

	/*constructor*/
	public Pessoa() {
		Pessoa.contador++;
	}

}
