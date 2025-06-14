package inheritancePack;

class Room{
	int length, breadth;
	public Room (int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	int area () {
		return length*breadth;
	}
}
class DiningRoom extends Room{
	int height;
	
	public DiningRoom (int length, int breadth, int height) {
	super(length, breadth);
	this.height=height;
	}
	int volume() {
		return length*breadth*height;
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		DiningRoom room = new DiningRoom(4,5,6);
		System.out.println("Area="+room.area());
		System.out.println("Volume="+room.volume());

	}

}
