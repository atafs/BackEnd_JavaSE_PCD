package pt.progJava.americoLib.control90;

import java.util.Random;

public class Withdraw extends Thread{
	
	//ATRIBUTES
	private Account account;
	private int fundsWithdrawn;
	
	//CONSTRUCTOR
	public Withdraw(Account account) {
		this.account = account;
		this.fundsWithdrawn = 0;
	}
	
	//RUN THE THREAD
	@Override
	public void run() {
		
		//CICLE
		while(!Thread.interrupted()) {
			int nextWithdrawer = new Random().nextInt(20) + 1;
			
			//CONDITION
			if(account.withdraw(nextWithdrawer)) {
				System.out.println("[SUCCEEDED in withdrawing the VALUE " + nextWithdrawer + "]");
				fundsWithdrawn += nextWithdrawer;
			} else {
				System.err.println("\n[FAILED to withdraw the VALUE: " + nextWithdrawer + ". NOT suficient value in account!!!]\n");
			}
			
			try {
				sleep(300);
			} catch (InterruptedException e) {
				System.err.println("THREAD Withdraw INTERRUPTED!!! ENDING Withdraws\n");
				break;
			}
		}
	}

	//GETTERS
	public int getFundsWithdrawn() {
		return fundsWithdrawn;
	}
	
	
	
	

}
