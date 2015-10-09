package pt.progJava.americoLib.control54;

public class CounterSynchronized {
	private int c = 0;
	
	public synchronized void inc(){
		c++;
	}
	
	public int getC() {
		return c;
	}
}
