package pt.progJava.americoLib.control37;

import java.util.Scanner;

public class Processor37 {

	public void produce() throws InterruptedException {
		
		synchronized (this) {
			//
			System.err.println("PRODUCER thread running...");
			wait();
			
			System.err.println("RESUMED PRODUCER...");
		}
	}

	public void consume() throws InterruptedException {
		//
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		
		//
		synchronized (this) {
			System.out.println("Waitting for RETURN key to be ENTERED... in CONSUMER");
			scanner.nextLine();
			
			System.out.println("RETURN Enter Key... in CONSUMER");
			notify();
			Thread.sleep(3000);
		}
	}

}
