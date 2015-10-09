package pt.progJava.americoLib.control16;

import pt.progJava.americoLib.control16.interface16.Amamentador;

public class TesteAnimal {
	
	public void testa(Amamentador a) {
		System.out.println("a testar o animal... a amamentar");
	}
	
	public void verificaIdade(Animal a) throws AnimalException {
		if(a.getIdade() >= 100) {
			throw new AnimalException();
		}else {
			System.out.println("a verificar a idade do animal..." + a.getIdade() + " inferior a cem anos...\n");

		}
		
	}

}
