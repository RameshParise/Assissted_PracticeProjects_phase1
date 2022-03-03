//Defalut Constructor
class EmpInfo {
	int id;
	String name;

	public void display() {
		System.out.println(id + " " + name);
	}
}


//parameterized constructor
class Std {
	int id;
	String name;

	public Std(int i, String n) {
		id = i;
		name = n;
	}

	public void display() {
		System.out.println(id + " " + name);
	}
}

public class paramConstr {
	public static void main(String[] args) {
		
		EmpInfo emp1 = new EmpInfo();
		emp1.display();
		emp1.display();
		Std std1=new Std(2,"Alex");
		Std std2=new Std(10,"Annie");
		std1.display();
		std2.display();
	}
}


