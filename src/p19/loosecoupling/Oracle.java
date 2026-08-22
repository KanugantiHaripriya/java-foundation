package p19.loosecoupling;

public class Oracle implements Server{

	@Override
	public void connect() {
		System.out.println("Server connected to Oracle");
	}

}
