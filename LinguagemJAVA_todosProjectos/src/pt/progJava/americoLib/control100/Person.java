package pt.progJava.americoLib.control100;

public class Person implements DogListener{

	private String name;
	
	
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void dogHungry(DogEvent e) {
		System.err.println("\t\t " + name + " feels " + e.getSource().getName() + "\n");
	}

	@Override
	public void dogThirsty(DogEvent e) {
		System.err.println("\t\t " + name + " lays down a bowl of water for " + e.getSource().getName() + "\n");
		
	}

	@Override
	public void dogLonely(DogEvent e) {
		System.err.println("\t\t " + name + " plays with " + e.getSource().getName() + " for a while.\n");
		
	}

	@Override
	public void dogSleeps(DogEvent e) {
		System.err.println("\t\t " + name + " pets " + e.getSource().getName() + " on the head.\n");
		
	}

}
