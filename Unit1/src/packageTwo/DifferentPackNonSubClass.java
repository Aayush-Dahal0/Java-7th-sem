package packageTwo;
import packageOne.ProtectionLevel;;

public class DifferentPackNonSubClass {
	ProtectionLevel p1= new ProtectionLevel();

	public DifferentPackNonSubClass() {
		//System.out.println("Defualt data="+p1.data);
		//System.out.println("Private data="+privdata);
		//	System.out.println("Protected data="+p1.prodata);
		System.out.println("public data="+p1.pubdata);
	}
}

	