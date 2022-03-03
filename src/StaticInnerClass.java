class Outer2 {
	private static String msg = "Example of Static Inner Class";
	
	static class Inner2 {
		void msg() {
			System.out.println(msg);
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
Outer2.Inner2 inner = new Outer2.Inner2(); 
		
		inner.msg();
		

	}

}
