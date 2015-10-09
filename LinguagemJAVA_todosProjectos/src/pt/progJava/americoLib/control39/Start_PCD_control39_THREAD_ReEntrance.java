package pt.progJava.americoLib.control39;

public class Start_PCD_control39_THREAD_ReEntrance {
	
	public static void main(String[] args) throws InterruptedException {
		
		//
		final Runner39 runner = new Runner39();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					runner.secondThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		runner.finished();
		
	}

}
