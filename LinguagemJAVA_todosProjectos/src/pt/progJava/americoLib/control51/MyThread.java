package pt.progJava.americoLib.control51;

public class MyThread extends Thread {
	
	//atributos
	private static final int NUM = 10;
	private int id;
	
	//construtor
	public MyThread(int id) {
		super();
		this.id = id;
	}
	
	//run
	public void run() {
		
		try {
			
			for(int i = 0; i < NUM; i++) {
				System.out.println(id + " -> " + i);
				sleep ((long)(Math.random() * 2000));
			}
			
		} catch (InterruptedException e) {
			System.out.println(id + " done");
		}
	}
	

	

}
