package pt.progJava.americoLib.control39;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner39 {

	//
	private int count = 0;

	//
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	//
	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	//
	public void firstThread() throws InterruptedException {

		//
		lock.lock();
		cond.await();

		System.out.println("\nFIRST_THREAD: WOKEN UP!!!...");

		try {
			increment();
			System.out.println("[COUNT in FIRST_THREAD: " + count + "]");

		} finally {
			lock.unlock();
		}

	}

	//
	@SuppressWarnings("resource")
	public void secondThread() throws InterruptedException {

		//
		Thread.sleep(1000);
		lock.lock();

		//
		System.err.println("SECOND_THREAD: Press the RETURN Key...");
		new Scanner(System.in).nextLine();
		System.err.println("SECOND_THREAD: Got RETURN Key...");

		//
		cond.signal();
		System.out.println("\n[COUNT in SIGNAL: " + count + "]");

		try {
			increment();
			System.out.println("[COUNT in SECOND_THREAD: " + count + "]");

		} finally {
			lock.unlock();
		}

	}

	public void finished() {
		System.err.println("\nTOTAL COUNT is: " + count + "... from FINISH METHOD!!!");
	}

}
