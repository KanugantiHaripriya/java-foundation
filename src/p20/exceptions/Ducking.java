package p20.exceptions;

public class Ducking {
	static void m1() {
		try {
			int i = 10/0;
		}catch(ArithmeticException e) {
			System.out.println("Exception Handle");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			Ducking.m1();
		}catch(Exception e) {
			System.out.println("Handled in main method");
		}
	}
}
