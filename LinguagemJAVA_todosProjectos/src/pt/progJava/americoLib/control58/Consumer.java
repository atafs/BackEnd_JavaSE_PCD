package pt.progJava.americoLib.control58;

public class Consumer extends Thread {
	
	private SharedResourse numberContainer;
	private int id;

	public Consumer(SharedResourse nc, int id) {
		numberContainer = nc;
		this.id = id;
	}

	public void run() {
		int value = 0;

		for (int i = 0; i != numberContainer.getMaxConsumerProducer(); i++) {
			value = numberContainer.get();
			System.out.println("\t\t\t\tConsumer #" +
					this.id + " got: " + value);
		}
	}
}
