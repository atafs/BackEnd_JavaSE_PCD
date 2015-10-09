package pt.progJava.americoLib.control31.demo1;


class Runner1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Start_PCD_control31_THREAD {

	public static void main(String[] args) {
		Runner1 runner1 = new Runner1();
		runner1.start();
		
		Runner1 runner2 = new Runner1();
		runner2.start();
	}
}
