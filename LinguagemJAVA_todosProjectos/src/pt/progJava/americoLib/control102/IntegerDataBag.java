package pt.progJava.americoLib.control102;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerDataBag  implements Subject{

	@SuppressWarnings("rawtypes")
	private ArrayList list = new ArrayList();
	@SuppressWarnings("rawtypes")
	private ArrayList observers = new ArrayList();

	
	@SuppressWarnings("unchecked")
	public void add(Integer i) {
		list.add(i);
		notifyObservers();
	}
	
	@SuppressWarnings("rawtypes")
	public Iterator iterator() {
		return list.iterator();
	}
	
	public Integer remove(int index) {
		if(index < list.size()) {
			Integer i = (Integer) list.remove(index);
			notifyObservers();
			return i;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void addObserver(ObserverPattern o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(ObserverPattern o) {
		observers.remove(o);
	}
	
	@SuppressWarnings("rawtypes")
	private void notifyObservers() {
		Iterator i = observers.iterator();
		while(i.hasNext()) {
			ObserverPattern o = (ObserverPattern) i.next();
			o.update(this);
		}
	}
	
	
	
	

	
	

}
