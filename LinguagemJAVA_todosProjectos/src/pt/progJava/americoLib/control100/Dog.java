package pt.progJava.americoLib.control100;

import java.util.HashSet;
import java.util.Set;

public class Dog {

	private Thread life = new Thread() {
		public void run() {
			while(true) {
				int roll = (int) (Math.random() * 4.0);
				switch(roll) {
				case 0: fireDogHungryEvent(); break;
				case 1: fireDogLonelyEvent(); break;
				case 2: fireDogThirstyEvent(); break;
				case 3: fireDogSleepsEvent(); break;
				}
				
				try {
					sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Set<DogListener> listeners;
	private String name;
	
	public Dog(String name) {
		this.name = name;
		listeners = new HashSet<DogListener>();
		life.start();
		
	}

	public String getName() {
		return name;
	}
	
	//SYNCHRONIZED
	public synchronized void addDogListener(DogListener listener) {
		listeners.add(listener);
	}
	
	public synchronized void removeDogListener(DogListener listener) {
		listeners.remove(listener);
	}
	
	protected synchronized void fireDogHungryEvent() {
		System.out.println(name + " is hungry." + "\n");
		DogEvent e = new DogEvent(this);
		for (DogListener listener : listeners) {
			listener.dogHungry(e);
		}
	}
	
	protected synchronized void fireDogThirstyEvent() {
		System.out.println(name + " feels thirsty." + "\n");
		DogEvent e = new DogEvent(this);
		for (DogListener listener : listeners) {
			listener.dogThirsty(e);
		}
	}
	
	protected synchronized void fireDogLonelyEvent() {
		System.out.println(name + " fells lonely." + "\n");
		DogEvent e = new DogEvent(this);
		for (DogListener listener : listeners) {
			listener.dogLonely(e);
		}
	}
	
	protected synchronized void fireDogSleepsEvent() {
		System.out.println(name + " is hungry." + "\n");
		DogEvent e = new DogEvent(this);
		for (DogListener listener : listeners) {
			listener.dogSleeps(e);
		}
	}
	
}
