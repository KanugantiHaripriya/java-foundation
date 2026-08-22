package p14.polymorphism.latebinding;

public class Pooja {
	void behave() {
		System.out.println("Pooja behaves normally");
	}
}

class Husband extends Pooja{
	void behave() {
		System.out.println("With care and fun");
	}
}

class Father extends Pooja{
	void behave() {
		System.out.println("with respectfully");
	}
}

class Brother extends Pooja{
	void behave() {
		System.out.println("with love, fun and fight");
	}
}
