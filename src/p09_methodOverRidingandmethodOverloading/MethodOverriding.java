package p09_methodOverRidingandmethodOverloading;

public class MethodOverriding {
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		
		Car c =new Car();
		c.start();
		c.stop();
		
	}
}

/*
SampleOutput:
Bike is self start
Car push button to start
Stopped
*/