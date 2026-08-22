package p18.interfaces;

public class Test {
	
	public static void main(String[] args) {
		Switch s = new Light();
		Switch s1 = new Fan();
		s.on();
		s.off();
		s1.on();
		s1.off();
	}
}
 