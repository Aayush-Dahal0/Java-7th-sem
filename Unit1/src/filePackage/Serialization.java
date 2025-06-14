package filePackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable { //objects converted in to byte streams
	int id;
	String name;
	String address;
	public Student (int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public String toString() {//used to read objects
		return " Id= " +id+ " name= " + name + " address= " + address;
	}
	
}

public class Serialization {

	public static void main(String[] args) throws IOException {
		Student st1=new Student (1,"Karun","Dhapakhel");
		Student st2=new Student (2,"Ram","Ayodhya");
		//write objects to files
		File f=new File("D:\\AdvancedJava\\Student.txt");
		FileOutputStream fo=new FileOutputStream(f);
		ObjectOutputStream oo= new ObjectOutputStream(fo);
		oo.writeObject(st1);
		oo.writeObject(st2);
		fo.close();
		oo.close();

	}

}
