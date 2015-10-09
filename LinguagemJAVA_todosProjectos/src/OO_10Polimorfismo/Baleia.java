package OO_10Polimorfismo;

import OO_10Polimorfismo.interfaces10.Nadador;

public class Baleia extends Mamifero implements Nadador{

	public void amamenta() {
		System.out.println("baleia a ser amamentada...");
	}

}
