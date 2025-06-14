package finalPack;

class A {
	final void method() {
		
	}
}
class B extends A{
	
}
public class FinalProperties {
	final float pi;
	static final float g;
	public FinalProperties() {
		pi=3.14f;
	}
	
	static {
		g=9.8f;
	}
	

	public static void main(String[] args) {
		B b = new B();
		b.method();

	}

}
