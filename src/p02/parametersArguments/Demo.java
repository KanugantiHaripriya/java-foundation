package p02.parametersArguments;

public class Demo {
	void add(int a , int b) { // parameters 
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(2, 5); // arguments
	}
}
