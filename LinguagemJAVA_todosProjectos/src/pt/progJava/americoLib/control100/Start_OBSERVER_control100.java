package pt.progJava.americoLib.control100;

public class Start_OBSERVER_control100 {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Husky");
		Dog dog2 = new Dog("Tufa");
		
		Person person1 = new Person("Americo");
		Child child = new Child("Tomas");
		
		dog1.addDogListener(person1);
		dog1.addDogListener(child.getListener());

		dog2.addDogListener(person1);
		dog2.addDogListener(child.getListener());

	}

}
