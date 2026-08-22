package p18.interfaces;

public class Light implements Switch{

	@Override
	public void on() {
		System.out.println("Lights On");	
	}

	@Override
	public void off() {
		System.out.println("Lights Off");	
	}

}
