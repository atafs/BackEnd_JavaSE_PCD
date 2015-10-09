package pt.progJava.americoLib.control85;

public class Carro extends Thread {

	//ATTRIBUTES
	private Pista pista;
	private int id;
	
	//CONSTRUCTOR
	public Carro(Pista pista, int id) {
		super();
		this.pista = pista;
		this.id = id;
	}
	
	@Override
	public void run() {
		
		try {
			do {
				sleep( (int)(Math.random() * 500) );
			} while (!pista.move(id));
		} catch (Exception e) {
			System.out.println("ERROR: on the method Run of Carro!!!!");
		}
	}	
}
