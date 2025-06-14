package multithreadingPackage;

class Thread1 extends Thread{//by extending thread class
	@Override
	public void run() {
		System.out.println("I am property of Thread class");
		
	}
	
}
class Thread2 implements Runnable{// runnable is an interface containing only one method 
	@Override
	public void run() {
		System.out.println("I am property of runnable interface method");
		
	}
	
}

public class WaysofCreatingThread {

	public static void main(String[] args) {
		Thread2 t2= new Thread2();
		Thread th2= new Thread(t2); // Thread constructor take runnable interface 
		// as an argument i.e. new Thread(Runnable obj);
		th2.start();
		

	}

}
