package p18.interfaces;

public class Fan implements Switch{

	@Override
	public void on() {
		System.out.println("Fans on");	
	}

	@Override
	public void off() {
		System.out.println("Fans off");
	}

}
