package pt.progJava.americoLib.control62;

public class MyThread extends Thread{

	private static final int NUM = 1000000;
	private Counter c;

	public MyThread(Counter c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		for(int i =0; i < NUM; i++){
			c.inc();
		}
	}
}
