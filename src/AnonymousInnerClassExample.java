abstract class A {
	public abstract void hello() ;
}

public class AnonymousInnerClassExample {

	public static void main(String[] args) {
A a = new A() {
			
			@Override
			public void hello() {
				System.out.println("Example of Anonymous Inner Class");
				
			}
		};
		
		a.hello();
		

	}

}

