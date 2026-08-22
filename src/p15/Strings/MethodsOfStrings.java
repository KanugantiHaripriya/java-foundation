package p15.Strings;


public class MethodsOfStrings {

	public static void main(String[] args) {
		String s1 = "Raju";
		String s2 = "Raju";
		String s3 = "Raju";
		System.out.println(s1==s2);
		System.out.println(s3.toLowerCase());
		System.out.println(s1.toUpperCase());
		s1=s1+"Programming";
		System.out.println(s1);
		String s5 = "java Programming";
		System.out.println(s5.trim());
		String s6 = "Raja ram mohan rai";
		System.out.println(s6.substring(3));
		System.out.println(s6.substring(3,6));
		System.out.println(s6.charAt(7));
	}

}
