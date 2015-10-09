package pt.progJava.americoLib.control16;

import pt.progJava.americoLib.control16.interface16.Nadador;

public class Baleia extends Mamifero implements Nadador {

	public void amamentar() {
		System.out.println("baleia amamenta...");
	}

	public void nadar() {
		System.out.println("baleia esta a nadar...");

	}

}
