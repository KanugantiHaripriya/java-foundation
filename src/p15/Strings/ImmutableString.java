package p15.Strings;

public class ImmutableString {
	public static void main(String[] args) {
		
		String s1 = "Hari";
		String s2 = "Priya";
		String s3 = "Hari";
		String s4 = "Priya";
		
		if(s1==s2) {
			System.out.println("s1+s2 having same address");
		}
		else if(s1 == s3) {
			System.out.println("s1+s2 having same address");
		}
		else if(s2 == s4) {
			System.out.println("s1+S4 having same address");
		}
	}

}
