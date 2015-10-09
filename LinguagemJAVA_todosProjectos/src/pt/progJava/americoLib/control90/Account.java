package pt.progJava.americoLib.control90;

public class Account {
	
	//ATRIBUTES
	private int balance;

	//CONSTRUCTOR
	public Account(int balance) {
		this.balance = balance;
	}
	
	//METHODS SYNCHRONIZED
	public synchronized void deposit(int amount) {
		balance += amount;
	}

	public synchronized boolean withdraw (int amount) {
		
		//CONDITION
		if(amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	public synchronized int getBalance() {
		return balance;
	}
}
