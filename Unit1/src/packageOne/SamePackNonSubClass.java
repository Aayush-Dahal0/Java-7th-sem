package packageOne;

public class SamePackNonSubClass {
	ProtectionLevel p1= new ProtectionLevel();

	public SamePackNonSubClass() {
		System.out.println("Defualt data="+p1.data);
		//System.out.println("Private data="+privdata);
		System.out.println("Protected data="+p1.prodata);
		System.out.println("public data="+p1.pubdata);
	}
	}
