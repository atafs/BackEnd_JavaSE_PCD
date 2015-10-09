package OO_10Polimorfismo;

import OO_10Polimorfismo.interfaces10.Nadador;
import OO_10Polimorfismo.interfaces10.Vivo;

public class Pessoa10 extends Mamifero implements Vivo, Nadador{

	public void amamenta() {
		System.out.println("pessoa a ser amamentada...");

	}

}
