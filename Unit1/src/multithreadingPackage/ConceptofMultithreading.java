package multithreadingPackage;
class Hello extends Thread{//it contains run method 
	@Override
	public void run()  {
		
		for (int i=0;i<10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}
class Namaste extends Thread{
		@Override
		public void run()  {
			
			for (int i=0;i<10;i++) {
				System.out.println("Namaste");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
		}
	}
	

public class ConceptofMultithreading {

	public static void main(String[] args) throws InterruptedException {
		Hello h=new Hello();// h is a thread
		Namaste n=new Namaste(); // n is a thread
		//run method is only invoked when the thread is started 
		h.start();// run method is invoked
		n.start();// run method is invoked
	}

}
// Multi-threading is the feature of java which helps to operate and control 
//multiple subprograms (know as thread) in a single program
