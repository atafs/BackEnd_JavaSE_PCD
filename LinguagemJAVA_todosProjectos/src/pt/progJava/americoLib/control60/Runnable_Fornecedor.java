package pt.progJava.americoLib.control60;

import java.util.Random;

public class Runnable_Fornecedor implements Runnable {

	// atributos
	private Interface_Distribuidor ponte;
	private Random random = new Random();// variavel aleatoria

	// construtor
	public Runnable_Fornecedor(Interface_Distribuidor ponte) {
		this.ponte = ponte;
	}

	@Override
	public void run() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(random.nextInt(1000));// 1seg

				// ponte.set(): escrever informacoes da ponte
				total += i;// variavel de controle
				ponte.set(i);
				System.out.println("[Total: " + total + "]\n");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
