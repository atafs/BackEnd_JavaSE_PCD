package pt.progJava.americoLib.control84;

import java.awt.HeadlessException;


public class MyThread extends Thread {

	/* ******************** atributos ***************************** */
	private static final int REPETICAO_THREAD = 30; //constantes
	
	private String nomeThread; //identificacao da Thread
	private int idThread;
	private int counterThread = 1; //contador de vezes executadas pela Thread
	
	@SuppressWarnings("unused")
	private GUI_RACE03_HORSES_control84 guiTread; //classes associadas a Thread

	//CONSTRUCTOR
	public MyThread(int idThread, String nomeThread, GUI_RACE03_HORSES_control84 guiTread)
			throws HeadlessException {
		this.idThread = idThread;
		this.nomeThread = nomeThread;
		this.guiTread = guiTread;

	}
	
	
	
	//GETTERS
	public String getNomeThread() {
		return nomeThread;
	}
	
	public String getCounterThreadString() {
		return "Position: " + counterThread;
	}
	
	public int getCounterThread() {
		return counterThread;
	}



	/* *********************** run ******************************** */
	public void run() {

		
		for (int i = 1; i < REPETICAO_THREAD; i++) {
			try {
				
				System.out.println("[ID: " + idThread + "]; [Nome: " + nomeThread + "}; [Movimentos percorridos: " + i + "]");
				counterThread++;
				
				if(counterThread >= 30) System.out.println("\n[" + nomeThread + " acabou a CORRIDA!!!" + "]\n");
				sleep( (long)(Math.random() * 1000) );
				
			} catch (InterruptedException e) {
				System.err.println("ACIDENTE: CAVALO " + idThread + "FOI INTERROMPIDO!!!");
				
			}
		}
	}

	@Override
	public String toString() {
		return "MyThread [nomeThread=" + nomeThread + ", idThread=" + idThread + ", counterThread=" + counterThread + "]";
	}
}
