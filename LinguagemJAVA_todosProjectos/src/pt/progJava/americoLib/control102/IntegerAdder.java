package pt.progJava.americoLib.control102;

import java.util.Iterator;

public class IntegerAdder implements ObserverPattern{

	private IntegerDataBag bag;
	
	public IntegerAdder(IntegerDataBag bag) {
		this.bag = bag;
		bag.addObserver(this);
	}

	@Override
	public void update(Subject o) {
		if(o == bag) {
			System.out.println("The contents of the IntegerDataBag has changed.");
			
			int counter = 0;
			@SuppressWarnings("rawtypes")
			Iterator i = bag.iterator();
			while(i.hasNext()) {
				Integer integer = (Integer) i.next();
				counter += integer.intValue();
			}
			System.out.println("The new sum of the integers is: " + counter);
		}
	}
	
	

}
