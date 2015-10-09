package pt.progJava.americoLib.control52;

public class Start_THREAD_control52_sleepMessagesConsola extends Thread{
	
	/* ******************************************************************** */
	// TREAD
	/* ******************************************************************** */
	
	public void run() {
		
		//array the String
		String[] inf = {"Americo", "Tomas", "ISCTE", "Casa"};

		//ciclo (repeticao da String)
		for(int i=0; i < inf.length; i++) {
			
			//dentro do ciclo quero apanhar as excepcoes
			try {
		
				//dentro do try, quero usar o sleep()
				System.out.println(currentThread() + "Sleep for 2 segundos");
				sleep(2000);
				
				//apos dormir, quero imprimir uma mensagem
				System.out.println("\t" + inf[i]);

			} catch (InterruptedException e) {
				System.out.println("\t" + inf[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new Start_THREAD_control52_sleepMessagesConsola().start();
	}

}
