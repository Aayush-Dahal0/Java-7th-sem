package inheritancePack;

	abstract class MobileDevelop{
		int salary;
		public MobileDevelop() {
			salary = 60000;
		}
		public abstract void displaySalary();
		
	}
	class AndroidDevelop extends MobileDevelop{
	public AndroidDevelop() {
			salary+=10000;
		}
@Override
	public void displaySalary() {
		System.out.println("Android dev's salary="+salary);
		}
		
	}
	class IOSDeveloper extends MobileDevelop{
		public IOSDeveloper() {
			salary+=20000;
		}
		@Override
		public void displaySalary() {
			System.out.println("Andriod dev's slary="+salary);
			
		}
		
	}
public class HierarchicalInheritance {

	public HierarchicalInheritance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AndroidDevelop ad=new AndroidDevelop();
		IOSDeveloper id= new IOSDeveloper();
		ad.displaySalary();
		id.displaySalary();
		

	}

}
