package pt.progJava.americoLib.control58;

public class SharedResourse {

	//ATTRIBUTES
	private int contents;
	private static final int MAX = 25;
	private final int MAX_CONSUMER_PRODUCER = 10;
	private Consumer[] consumers = new Consumer[MAX];
	private Producer[] producers = new Producer[MAX];
	
	
	//SYNCHRONIZED
	public synchronized int get() {
		return contents;
	}

	public synchronized void put(int value) {
		contents = value;
	}

	//GETTERS
	public Consumer[] getConsumers() {
		return consumers;
	}

	public void setConsumers(Consumer[] consumers) {
		this.consumers = consumers;
	}

	public Producer[] getProducers() {
		return producers;
	}

	public void setProducers(Producer[] producers) {
		this.producers = producers;
	}

	public int getMax() {
		return MAX;
	}

	public int getMaxConsumerProducer() {
		return MAX_CONSUMER_PRODUCER;
	}
	
	
	

}