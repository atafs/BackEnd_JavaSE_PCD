package pt.progJava.americoLib.control56;

public interface AccountInterface {

	void deposit(int amount, String Cliente);// put money into the account

	boolean withdraw(int amount, String Cliente);// returns true if the withdrawal was
									// successful otherwise returns false.

	int getBalance();// get the current balance of the account



}
