package pt.progJava.americoLib.control65;

import java.awt.HeadlessException;


public class MyThread extends Thread {

	/* ******************** atributos ***************************** */

	// constantes
	private static final int REPETICAO_THREAD = 30;
	// identificacao da Thread
	private String nomeThread;
	private int idThread;
	// contador de vezes executadas pela Thread
	private int counterThread = 0;
	// classes associadas a Thread
	@SuppressWarnings("unused")
	private ThreadGUI guiTread;

	/* ********************** construtor *************************** */
	public MyThread(int idThread, String nomeThread, ThreadGUI guiTread)
			throws HeadlessException {
		super();
		this.idThread = idThread;
		this.nomeThread = nomeThread;
		this.guiTread = guiTread;

	}

	/* *********************** run ******************************** */
	public void run() {

		try {
			for (int i = 1; i < REPETICAO_THREAD; i++) {
				System.out
						.println("[ID: " + idThread + "]; [Nome: " + nomeThread
								+ "}; [Movimentos percorridos: " + i + "]");
				counterThread += i;
				sleep((long) (Math.random() * 100));
			}
		} catch (InterruptedException e) {
			System.err.println("ACIDENTE: CAVALO " + idThread
					+ "FOI INTERROMPIDO!!!");
			// e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MyThread [nomeThread=" + nomeThread + ", idThread=" + idThread
				+ ", counterThread=" + counterThread + "]";
	}

	
	
	
	
	

}
