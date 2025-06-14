package packageOne;

public class ProtectionLevel {
	int data=30;//default modifier
	private int privdata=40;
	protected int prodata=50;
	public int pubdata=80;

	public ProtectionLevel() {
		System.out.println("Defualt data="+data);
		System.out.println("Private data="+privdata);
		System.out.println("Protected data="+prodata);
		System.out.println("public data="+pubdata);
	}//all types of data are accessible in same class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
