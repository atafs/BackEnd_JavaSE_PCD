package pt.progJava.americoLib.control67;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentAddress implements Serializable {
	
	//attributes
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	//constructor
	public StudentAddress(String name, String street, String city, String state, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	//getters
	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}
	
	

}
