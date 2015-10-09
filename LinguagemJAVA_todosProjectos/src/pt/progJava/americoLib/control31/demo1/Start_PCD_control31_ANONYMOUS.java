package pt.progJava.americoLib.control31.demo1;

public class Start_PCD_control31_ANONYMOUS {
	
	public static void main(String[] args) {
		
		/*anonymous  class*/
		Thread t1 = new Thread(new Runnable() {

			@Override
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
		});
		
		t1.start();
		
	
	}

}
