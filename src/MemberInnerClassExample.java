class Outer {
	private String msg = "Hello Everyone";

	class Inner {
		void hello() {
			System.out.println(msg);
		}
	}
}

public class MemberInnerClassExample {
	

	public static void main(String[] args) {
Outer outer = new Outer();
		
		Outer.Inner inner = outer.new Inner();
		inner.hello();
		

	}

}

