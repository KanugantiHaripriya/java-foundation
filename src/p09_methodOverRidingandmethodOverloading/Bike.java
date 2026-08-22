package p09_methodOverRidingandmethodOverloading;

public class Bike extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Bike is self start");
	}

}
