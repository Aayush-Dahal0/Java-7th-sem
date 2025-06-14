package filePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Files\\Student.txt");
		FileInputStream fi=new FileInputStream(f);
		ObjectInputStream oi= new ObjectInputStream(fi);
		Student st1= (Student) oi.readObject();
		Student st2=(Student) oi.readObject();
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		oi.close();

	}

}
