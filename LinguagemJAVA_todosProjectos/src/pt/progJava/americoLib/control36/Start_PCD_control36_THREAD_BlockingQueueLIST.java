package pt.progJava.americoLib.control36;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Start_PCD_control36_THREAD_BlockingQueueLIST {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		//
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	
	private static void producer() throws InterruptedException {
		Random random = new Random();
		
		while(true) {
			queue.put(random.nextInt(100));
			System.err.println("PRODUCER: Placed value " + queue.element() + ";");
		}
	}
	
	private static void consumer() throws InterruptedException {
		Random random = new Random();
		
		while(true) {
			
			Thread.sleep(100);
			
			if(random.nextInt(10) == 0) {
				Integer value = queue.take();
				
				System.out.println("CONSUMER: Taken value " + value + "; Queue size is: " + queue.size());
			}
		}
	}
	
}
