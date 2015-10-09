package OO_08Interface;

public class Mulher extends Pessoa implements Casamento{

	public void casar(Pessoa p) {
		System.out.println(this.getNome()+" esta casada com "+p.getNome());
	}

	
}
