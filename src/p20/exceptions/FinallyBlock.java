package p20.exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int a = 10/0;
			System.out.println(a);
			
		}catch(ArithmeticException e ) {
			e.printStackTrace();
			
		}finally {
			System.out.println("Hi welcome to java session");
		}
	}
}
