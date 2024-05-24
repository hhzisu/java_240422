package practice08;

public class Person {
	 String lastName;
	 String firstName;
	 
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getLength() {
		return lastName.length()+firstName.length();
	}

}
