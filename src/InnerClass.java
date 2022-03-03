public class InnerClass {
	   private String msg="Welcome to Java";
	class Inner{
	  void hello()
	 {
          System.out.println(msg+"Start Learning Inner Class");
					
        }
	}

	public static void main(String[] args) {
	InnerClass obj = new InnerClass();
				        InnerClass.Inner in=obj.new Inner();
	in.hello();
				
	  }

	}

