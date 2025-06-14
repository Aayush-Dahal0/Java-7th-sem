package multithreadingPackage;

class Calculation extends Thread {
	int salary = 0;
	@Override
	public void run() {
		synchronized (this) {
		for (int i = 0; i < 12; i++) {
			salary += 50000;
		}
		notify (); //release the lock

	}

}
}


public class WaitandNotify {

	public static void main(String[] args) throws InterruptedException {
		Calculation cal=new Calculation();
		cal.start();
		synchronized(cal) {
			cal.wait();//wit for lock
		System.out.println("Total Salary="+cal.salary);
	}

}
}


