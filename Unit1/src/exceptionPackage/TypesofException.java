package exceptionPackage;

public class TypesofException {
	public TypesofException() throws InterruptedException {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
//			try {
//				Thread.sleep(1000);//1000 milliseconds=1sec //checked exception
//			}
//			catch (InterruptedException ex) {
//				
//			}
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new TypesofException();
		// TODO Auto-generated method stub

	}

}
