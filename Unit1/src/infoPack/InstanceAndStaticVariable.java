package infoPack;

public class InstanceAndStaticVariable {
	int ivar1, ivar2;//instance variables 
	static int svar;

	public void display() {
		System.out.println("var1="+ivar1+"var2="+ivar2);
		}

	public static void main(String[] args) {
		InstanceAndStaticVariable ob=new InstanceAndStaticVariable();
		ob.ivar1=24;
		ob.ivar2=44;
		svar=35;
		ob.display();

	}

}
