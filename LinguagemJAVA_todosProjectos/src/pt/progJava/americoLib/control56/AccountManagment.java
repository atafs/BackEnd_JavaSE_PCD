package pt.progJava.americoLib.control56;

import java.util.Random;

public class AccountManagment implements Runnable {

	/**
	 ** @author americo 54149 --------------------------------------------
	 ********************************************************************* */

	// atributos
	private Account conta = new Account(1000);
	private Random random = new Random();

	// main
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		// abrir varias Threads ao mesmo tempo
		AccountManagment irAsCompras = new AccountManagment();
		Thread depositor = new Thread(irAsCompras, "Depositor");
		Thread withdrawer = new Thread(irAsCompras, "Withdrawer");
		
		withdrawer.start();
		depositor.start();
		System.out.println("WITHDRAWER E DEPOSITOR JA COMECARAM...");
		
		withdrawer.interrupt();
		depositor.interrupt();
		System.out.println("WITHDRAWER E DEPOSITOR FORAM INTERROMPIDOS");
		
		try {
			withdrawer.sleep(5000);
			depositor.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
	
		// cliente actual, busco o nome e guardo numa String
		String cliente = Thread.currentThread().getName();

		// pelo menos 5 compras por cliente
		for (int i = 0; i < 5; i++) {
			conta.deposit(random.nextInt(1000), cliente);
			conta.withdraw(random.nextInt(1000), cliente);

			// conta sem saldo (excepcao)
			if (conta.getBalance() < 0) {
				throw new IllegalStateException(
						"ESTOUROU O SALDO... VAI GANHAR MAIS DINHEIRO!!!");
			}
		}

	}

}
