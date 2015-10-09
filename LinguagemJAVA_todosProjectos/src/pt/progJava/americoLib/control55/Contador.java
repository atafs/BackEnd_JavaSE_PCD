package pt.progJava.americoLib.control55;

public class Contador {

	// atributo
	private int valor = 0;

	// rotinas
	public synchronized void incrementa() {
		valor++;
		System.out.println("\n" + valor + " incrementado");
	}

	public synchronized void decrementa() {
		valor--;
	}

	// getters
	public int getValor() {
		return valor;
	}


}
