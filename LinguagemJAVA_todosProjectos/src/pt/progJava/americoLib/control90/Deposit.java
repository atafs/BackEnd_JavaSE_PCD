package pt.progJava.americoLib.control90;

import java.util.Random;

public class Deposit extends Thread{
	
	//ATRIBUTES
	private Account account;
	private int fundsDeposited;
	
	//CONSTRUCTOR
	public Deposit(Account account) {
		this.account = account;
		this.fundsDeposited = 0;
	}
	
	//RUN THE THREAD
	@Override
	public void run() {
		
		//CICLE
		while(!Thread.interrupted()) {
			
			int nextDeposit = new Random().nextInt(10) + 1;
			System.out.println("[Deposite the VALUE: " + nextDeposit + "]");
			account.deposit(nextDeposit);
			fundsDeposited += nextDeposit;
			
			try {
				sleep(300);
			} catch (InterruptedException e) {
				System.err.println("THREAD Deposit INTERRUPTED!!! ENDING Deposits\n");
				break;

			}
		}
	}

	//GETTERS
	public int getFundsDeposited() {
		return fundsDeposited;
	}

}
