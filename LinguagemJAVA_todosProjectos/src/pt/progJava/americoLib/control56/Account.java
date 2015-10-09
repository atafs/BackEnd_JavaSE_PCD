package pt.progJava.americoLib.control56;

import javax.swing.JOptionPane;

public class Account implements AccountInterface {

	// atributos
	private int saldo;
	
	//construtor
	public Account(int saldo) {
		this.saldo = saldo;
	}
	

	@Override
	public synchronized void deposit(int amount, String cliente) {
		// variaveis
		int saldoOriginal = saldo;// guardar o saldo original (pode ser util)
		
		// levantamento de informacao leva algum tempo (1 a 3 segundos)
		try {// lanca uma excessao o metodo sleep();
			System.out.println(" :Esperando... ");
			Thread.sleep(1000);// 1 seg de espera
		} catch (InterruptedException e) {
		}
		
		saldo += amount;
		String msg = cliente + " :DEPOSITOU " + amount + " [Saldo original= "
				+ saldoOriginal + ", Saldo final=" + saldo + "] ";
		System.out.println(msg);
	}

	@Override
	public synchronized int getBalance() {
		return saldo;
	}

	@Override
	public synchronized boolean withdraw(int amount, String cliente) {
		// variaveis
		int saldoOriginal = saldo;// guardar o saldo original (pode ser util)

		if (amount > saldo) {
			/* imprimir noutra janela de Dialogo */
			JOptionPane.showMessageDialog(null,
					"ATENCAO: NAO PODE LEVANTAR ESSA QUANTIA!!");
			return false;
		} else {
		
			System.out.println(" :Esperando... ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 1 seg de espera

			saldo -= amount;
			String msg = cliente + " :SACOU " + amount + " [Saldo original= "
					+ saldoOriginal + ", Saldo final=" + saldo + "] ";
			System.out.println(msg);

			return true;
		}
	}

//	public static void main(String[] args) {
//		//cliente actual, busco o nome e guardo numa String
//		String cliente = Thread.currentThread().getName();
//		Account a = new Account();
//		// testar rotinas:
//		a.deposit(20,cliente);
//		a.withdraw(1300,cliente);
//		a.withdraw(1020,cliente);
//		a.deposit(300,cliente);
//		a.withdraw(200,cliente);
//	
//
//	}
}
