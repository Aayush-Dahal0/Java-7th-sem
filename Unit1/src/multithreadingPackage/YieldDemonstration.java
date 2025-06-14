package multithreadingPackage;

public class YieldDemonstration extends Thread{
	@Override
	public void run() { //thread 0, thread 1, etc
		Thread.yield();//wait 
		for (int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"is running");
		}
	}


	public static void main(String[] args) {
		YieldDemonstration thread=new YieldDemonstration();
		thread.start();//run execution //this is object thread form YieldDemonstration
		for (int i=0;i<2;i++) {
			System.out.println(Thread.currentThread().getName()+ " is running");
		}
	

	}

}
