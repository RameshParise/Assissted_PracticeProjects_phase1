class Outer1 {
	private String msg = "Iam a Developer";
	
	void display() {
		
		class Inner1 {
			void msg() {
				System.out.println(msg);
			}
		}
		
		Inner1 innerObj = new Inner1();
		innerObj.msg();
	}
}

public class LocalInnerClassExample {

	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.display();

		

	}

}

