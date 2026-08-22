package p20.exceptions;

public class Example1 {
	
	public static void main(String[] args) {
		try {
			int a =10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println("This is Arith Exception");
		}
		
		catch(Exception e) {
			System.out.println("This is exception class itself");
		}
	}
}
