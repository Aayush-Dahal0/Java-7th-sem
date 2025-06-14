package inheritancePack;

class Employee {
	int basesalary = 50000;

	void display() {
		System.out.println("Salary =" + basesalary);
	}
}

class Developer extends Employee { // level 1
	int allowance;
	public Developer() {
		allowance = 10000;
	}
	@Override
	void display() {// method overriding
		System.out.println("Salary=" + (basesalary + allowance));

	}

}

class MobileDeveloper extends Developer {// level 2
	@Override
	void display() {
		allowance += 70000;
		System.out.println("Salary=" + (basesalary + allowance));

	}

}

class AndriodDeveloper extends MobileDeveloper {// level 3
	@Override
	void display() {
		allowance += 20000;
		System.out.println("Salary=" + (basesalary + allowance));

	}
}

	public class MultiLevelInheritance {

		public MultiLevelInheritance() {
			// TODO Auto-generated constructor stub
		}

	public static void main(String[] args) {
		AndriodDeveloper ad=new AndriodDeveloper();
		ad.display();
	}

	}

