package pt.progJava.americoLib.control38;

public class Start_PCD_control38_THREAD_WaitNotify_LIST {
	
	public static void main(String[] args) throws InterruptedException {
		
		//
		final Processor38 processor = new Processor38();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}

}
