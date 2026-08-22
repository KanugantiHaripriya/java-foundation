package p14.polymorphism.latebinding;

public class Test {

	public static void main(String[] args) {
		
		Pooja p = new Husband();
		p.behave();
		
		Pooja p1 = new Father();
		p1.behave();
		
		Pooja p2 = new Brother();
		p2.behave();
	}
}
