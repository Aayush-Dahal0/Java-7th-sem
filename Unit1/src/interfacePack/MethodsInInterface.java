package interfacePack;

interface First{
	int x=40;
	//void method();
}
interface Second{
	int x=30;
	void method();
}

public class MethodsInInterface implements First, Second{

	public MethodsInInterface() {
		System.out.println("x="+First.x);
		System.out.println("x="+Second.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method() {
		
	}

}
