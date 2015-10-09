package pt.progJava.americoLib.control57;

public class SynchronizedBlocksMultiCounter {


	private int c1 = 0;
	private int c2 = 0;
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void incrementConter1() {
		synchronized (lock1) {
			c1++;
		}
	}
	
	public void decrementConter1() {
		synchronized (lock1) {
			c1--;
		}
	}

	public void decrementConter2() {
		synchronized (lock2) {
			c2--;
		}
	}
	
	public void printCounter1() {
		System.out.println("\n[COUNTER 1: " + c1);
	}
	
	public void printCounter2() {
		System.out.println("\n[COUNTER 1: " + c2);
	}
}

