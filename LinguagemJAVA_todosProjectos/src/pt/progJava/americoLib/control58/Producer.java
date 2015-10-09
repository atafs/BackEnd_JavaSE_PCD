package pt.progJava.americoLib.control58;

public class Producer extends Thread{
	
	private SharedResourse numberContainer;
	private int id;

	
	public Producer(SharedResourse nc, int id) {
		numberContainer = nc;
		this.id = id;
	}
		
	public void run() {
		for (int i = 0; i < numberContainer.getMaxConsumerProducer(); i++) {
			numberContainer.put(i);
			System.out.println("Producer #" +
					this.id + " put: " + i);
		}
	}
}


