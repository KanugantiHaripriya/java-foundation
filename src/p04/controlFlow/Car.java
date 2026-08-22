package p04.controlFlow;

public class Car {
	void start() {
		System.out.println("Car started");
	}
	void move() {
		System.out.println("Car moves");
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.move();
	}

}

/*
Sample output:
Car started
Car moves
*/