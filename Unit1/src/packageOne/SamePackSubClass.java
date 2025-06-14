package packageOne;

public class SamePackSubClass extends ProtectionLevel {
	public SamePackSubClass(){
	System.out.println("Defualt data="+data);
	//System.out.println("Private data="+privdata);
	System.out.println("Protected data="+prodata);
	System.out.println("public data="+pubdata);
}//Except private data, other are accessible
}
