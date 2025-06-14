package innerPack;
class First{
	public void LocalMethod() {
		int data =20;
		class Second {
			public void print() {
				System.out.println("Data="+data);
			}
		}
		Second s= new Second();
		s.print();
	}
}

public class LocalInnerClass {


	public static void main(String[] args) {
		First f =new First();
		f.LocalMethod();
		

	}

}
