package interfacePack;
interface Student{
	// all the methods in interface are by default public abstract
	void score();// public abstract void score//prototype or signature 
	void display();
	
}

public class InterfaceProperties implements Student {// 2. implements is used to inherit

	public InterfaceProperties() {

	}

	public static void main(String[] args) {
		//Student st=new Student; //1. we cannot create objects of an interface

	}

	@Override
	public void score() { // class implementing interface must include function definition 
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() { 

		
	}

}
