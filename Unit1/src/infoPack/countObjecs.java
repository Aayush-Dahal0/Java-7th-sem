package infoPack;

public class countObjecs {
	static int counter=0;

	public countObjecs() {
		counter++;
	}
	public static int getCount() {
		return counter;
	}
	
	public static void main(String[] args) {
		countObjecs obj1=new countObjecs();
		countObjecs obj2=new countObjecs();
		countObjecs obj3=new countObjecs();
		countObjecs obj4=new countObjecs();
		System.out.println(getCount());
	}

}
