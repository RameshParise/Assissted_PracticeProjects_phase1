public class StringBuffers {
	public static void main(String[] args) {
		String str = "String to StringBuilder StringBuffer";

		StringBuilder sbl = new StringBuilder(str);
		System.out.println("StringBuilder contents: " + sbl);

		StringBuffer sbf = new StringBuffer(str);
		System.out.println("StringBuffer contents: " + sbf);
	}

}

