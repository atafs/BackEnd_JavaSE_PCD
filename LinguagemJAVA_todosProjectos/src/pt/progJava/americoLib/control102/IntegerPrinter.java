package pt.progJava.americoLib.control102;

import java.util.Iterator;

public class IntegerPrinter implements ObserverPattern{

	private IntegerDataBag bag;
	
	public IntegerPrinter(IntegerDataBag bag) {
		this.bag = bag;
		bag.addObserver(this);
	}

	@SuppressWarnings("rawtypes")
	public void update(Subject o) {
		if(o == bag) {
			System.out.println("The contents of the IntegerDataBag has changed.");
			System.out.println("The new contents of the IntegerDataBag contains: ");
			Iterator i = bag.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
	}






}
