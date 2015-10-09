package OO_08Interface;

public class Homem extends Pessoa implements Casamento{

	public void casar(Pessoa p) {
		System.out.println("GAME OVER"+this.getNome()+" esta casada com "+p.getNome());
		
	}
	

}
