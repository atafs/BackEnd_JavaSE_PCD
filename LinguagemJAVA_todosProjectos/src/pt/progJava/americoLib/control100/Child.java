package pt.progJava.americoLib.control100;

public class Child{

	private String name;
	
	private DogAdapter listener = new DogAdapter() {
		public void dogSleeps(DogEvent e) {
			System.err.println("\t\t " + name + " pounces on and frightens " + e.getSource().getName() + "\n");
		}
	};

	public Child(String name) {
		this.name = name;
	}
	
	public DogAdapter getListener() {
		return listener;
	}
	
}
