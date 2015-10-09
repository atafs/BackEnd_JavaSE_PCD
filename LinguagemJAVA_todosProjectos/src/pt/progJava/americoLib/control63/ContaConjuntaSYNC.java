package pt.progJava.americoLib.control63;

public class ContaConjuntaSYNC {

	// atributos
	private int saldo = 100;

	// getters
	public int getSaldo() {
		return saldo;
	}

	// parametros: valor a sacar e nome da pessoa a realizar o saque
	//modificador: synchronized entre as Thread: bloqueado quando e iniciado uma Thread
	public synchronized void sacar(int valor, String cliente) {

		if (saldo >= valor) {// se o saldo for maior ou igual ao valor a ser
			int saldoOriginal = saldo; // inicio do processamento
			System.out.println(cliente + " vai sacar");

			// levantamento de informacao leva algum tempo (1 a 3 segundos)
			try {// lanca uma excessao o metodo sleep();
				System.out.println(cliente + " esperando...");
				Thread.sleep(1000);// 1 seg de espera
			} catch (InterruptedException e) {
			}
			saldo -= valor;// subtrair do saldo o valor a ser sacado
			String msg = cliente + " SACOU " + valor + "[Saldo original="
					+ saldoOriginal + ", Saldo final=" + saldo + "] ";
			System.out.println(msg);

		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}
	}

}
