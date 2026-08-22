package p16.staticmethods;

public class StaticDemo {
	static int a;
	
	public StaticDemo() {
		System.out.println("I am a constructor");
	}
	
	static {
		a=10;
		System.out.println("I am a static block");
	}
	
	{
		System.out.println("I am a non static block");
	}
	
	void nsm() {
		System.out.println("I am a non static method");
	}
	
	static void sm1() {
		System.out.println("I am a static method");
	}
}
