package interfacePack;
interface Employee{
	//int salary=50000;
	public static final int basesalary=50000;
}
interface Developer extends Employee{
	int basesalary=60000;
}
interface MobileDeveloper{
	
}
public class VariablesInInterface implements Employee, MobileDeveloper{
	

	public static void main(String[] args) {
		System.out.println("Base salary of"+basesalary);

	}

}
//class extends class 
//class implements interface
//interface extends interface

