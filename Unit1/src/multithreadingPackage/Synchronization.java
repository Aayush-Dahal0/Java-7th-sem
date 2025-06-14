package multithreadingPackage;

class BookingSystem {
	int csitseats = 48;

	public synchronized void book(int seats) {// method is declared as synchronized
		if (seats <= csitseats) {
			System.out.println(seats + "seats are booked successfully");
			csitseats = csitseats - seats;
			System.out.println(csitseats + "seats are remaining.");
		} else {
			System.out.println(seats + "seats are not available");
			System.out.println(csitseats + "seats are available");
		}
	}
}

public class Synchronization extends Thread {
	static BookingSystem bs;
	int seats;

	@Override
	public void run() {
		bs.book(seats);	
	}

	public static void main(String[] args) {
		bs=new BookingSystem();
		Synchronization Karun=new Synchronization();//request 1
		Karun.seats=10;
		Karun.start();
		Synchronization dipin=new Synchronization();
		dipin.seats=14;
		dipin.start();
		Synchronization anubhav=new Synchronization();
		anubhav.seats=20;
		anubhav.start();
		Synchronization diwas=new Synchronization();
		diwas.seats=8;
		diwas.start();
	}

}
// synchronization is a processs to resolve the data inconsistency occurred when multiple 
//threads try to access the shared resource.