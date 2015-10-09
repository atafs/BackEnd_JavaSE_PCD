package pt.progJava.americoLib.control54;

public class MyThread extends Thread{

	private static final int NUM = 1000000;
	private CounterSynchronized c;

	public MyThread(CounterSynchronized c) {
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
