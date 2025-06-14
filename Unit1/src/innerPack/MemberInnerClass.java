package innerPack;

class Outer {
	private int data = 1000;

	class Inner {
		public void display() {
			System.out.println(data);
		}
	}
}

public class MemberInnerClass {

	public MemberInnerClass() {
	}

	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner in =out.new Inner();
		in.display();
		

	}

}
