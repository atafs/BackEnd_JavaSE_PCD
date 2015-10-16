package control_3CD.Start_PCD_week04._4_2_CorridaDeCavalosSimulada.thread;

import java.awt.HeadlessException;

import javax.swing.JTextField;

import control_3CD.Start_PCD_week04._4_2_CorridaDeCavalosSimulada.gui.GUI_RACE03_HORSES_control84;


public class MyThread extends Thread {

	/* ******************** atributos ***************************** */
	private static final int REPETICAO_THREAD = 30; //constantes
	private static int winner = 0;
	
	private String nomeThread; //identificacao da Thread
	private int idThread;
	private int counterThread = 1; //contador de vezes executadas pela Thread
	
	@SuppressWarnings("unused")
	private JTextField field;
	private GUI_RACE03_HORSES_control84 guiTread; //classes associadas a Thread

	//CONSTRUCTOR
	public MyThread(int idThread, String nomeThread, GUI_RACE03_HORSES_control84 guiTread) throws HeadlessException {
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

	public static int getRepeticaoThread() {
		return REPETICAO_THREAD;
	}

	public JTextField getField() {
		return field;
	}

	public void setField(JTextField field) {
		this.field = field;
	}

	/* *********************** run ******************************** */
	public void run() {

		winner = 0;
		for (int i = 1; i < REPETICAO_THREAD; i++) {
			try {		
				System.out.println("[ID: " + idThread + "]; [Nome: " + nomeThread + "}; [Movimentos percorridos: " + i + "]");
				counterThread++;
				
				if(counterThread >= 30) {
					System.err.println("\n[WINNER " + winner + " with name " + nomeThread + " acabou a CORRIDA!!!" + "]\n");
					winner++;
				}
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
