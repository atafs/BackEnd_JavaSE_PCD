package pt.progJava.americoLib.control55;

public class MyThread implements Runnable {

	// atributos
	private Contador contador;
	private String nome;
	private static final int MAX_COUNT = 5;

	// construtor
	public MyThread(Contador contador, String nome) {
		super();
		this.contador = contador;
		this.nome = nome;
	}
	//nunca sincronizar directamente o run() mas sim dentro
	public void run() {
	
		for (int i=0; i<MAX_COUNT; i++){
			synchronized (contador) {
				contador.incrementa();
				System.err.println(nome + ": " + contador.getValor());
				try {
					Thread.sleep(100);
					System.out.println("sleep...esperar 100; [ms]");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	//CONSULT NUMBER MAX
	public static int getMaxCount() {
		return MAX_COUNT;
	}
	
	
}

