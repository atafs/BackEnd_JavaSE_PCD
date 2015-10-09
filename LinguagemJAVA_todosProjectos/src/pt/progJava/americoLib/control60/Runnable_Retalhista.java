package pt.progJava.americoLib.control60;

import java.util.Random;

public class Runnable_Retalhista implements Runnable {

	// atributos
	private Interface_Distribuidor ponte;
	private Random random = new Random();// variavel aleatoria

	// construtor
	public Runnable_Retalhista(Interface_Distribuidor ponte) {
		this.ponte = ponte;
	}

	@Override
	public void run() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(random.nextInt(3000));// 1seg

				// ponte.get(): ler informacoes da ponte
				total += ponte.get();// variavel de controle; ler da ponte
				System.err.println("[Total: " + total + "]\n");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
