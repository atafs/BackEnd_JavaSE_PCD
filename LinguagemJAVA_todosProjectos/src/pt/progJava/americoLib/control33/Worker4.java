package pt.progJava.americoLib.control33;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker4 {
	
	//
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	
	
	//SYNCHRONIZED CODE BLOCKS
	public void stageOne() {
		
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		list1.add(random.nextInt(100));
	}
	
	//SYNCHRONIZED CODE BLOCKS
	public synchronized void stageTwo() {
		
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		list2.add(random.nextInt(100));
	}
	
	public void process() {
		
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	
	public void main() {
		System.out.println("Starting... SYNCHRONIZED CODE BLOCKS, TWO_LOCK");
		
		//
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable () {@Override
			public void run() {
				process();
			}
		});
		
		Thread t2 = new Thread(new Runnable () {@Override
			public void run() {
				process();
			}
		});
		
		//
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		//
		long end = System.currentTimeMillis();
		
		//
		System.out.println("Time take: " + (end - start) + "; [ms]");
		System.out.println("List1: " + list1.size() + "; list2: " + list2.size() + "\n");
		
	}
}
