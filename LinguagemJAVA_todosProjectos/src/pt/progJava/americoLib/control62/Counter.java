package pt.progJava.americoLib.control62;

public class Counter {
	private int c = 0;
	
	public synchronized void inc(){
		c++;
	}
	
	public int getC() {
		return c;
	}
}
