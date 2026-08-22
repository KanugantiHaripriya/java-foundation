package p05.typesOfVariables;

public class LocalVariables {
	//  A method with local variables
	void Sum() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		LocalVariables lv = new LocalVariables();
		lv.Sum();
	}
}
