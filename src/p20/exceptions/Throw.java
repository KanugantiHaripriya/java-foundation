package p20.exceptions;

public class Throw {
	static void m1() {
		int i= 10/0;
	}
	
	public static void main(String[] args) {
		try {
			Throw.m1();
		}
		catch(Exception e ) {
			System.out.println("Denominator cant be zero");
		}
	}
}
