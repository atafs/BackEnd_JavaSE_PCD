package OO_10Polimorfismo;

import OO_10Polimorfismo.interfaces10.Nadador;
import OO_10Polimorfismo.interfaces10.Vivo;
import OO_10Polimorfismo.interfaces10.Voador;

public class Veterinario {

	public void medeTamanhoAsa(Voador v) {
		System.out.println("mede tamanho");
	}
	
	public void verificarSaudeMamifero(Mamifero m) {
		System.out.println("verifica saude mamifero");
		m.amamenta();
	}
	
	public void desempenhoNaAgua(Nadador n) {
		System.out.println("esta nadando...");
	}
	
	public void verficarSeEstaVivo(Vivo a) {
		System.out.println("Esta vivo");
	}
}
