package inheritancePack;

class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

class Student {
	String name;
	int roll;
	Address address;

	public Student(String name, int roll, Address address) {
		this.name = name;
		this.roll = roll;
		this.address = address;
	}

	public String information() {
		return "Roll: "+roll+".\nMy name is"+name +".I live in "+ address.country+","+address.city+"," + address.state;
	}

}

class Lecturer {// composition
String name;
String subject;
Address address= new Address("Butwal", "Lumbini"," Nepal");
public Lecturer(String name, String subject) {
	this.name=name;
	this.subject=subject;
}
public String information() {
	return "My name is " + name +".I live in"+address.country+"," +address.city+ ","+ address.state + "I teach"+subject+".";
}
}

public class Aggregation {


	public static void main(String[] args) {
		Address add=new Address("Kathmandu","Bagmati","Nepal");
		Student st=new Student ("Ram", 101, add);
		System.out.println(st.information());
		Lecturer l = new Lecturer("Karun","Java");
		System.out.println(l.information());
		
		

	}

}
