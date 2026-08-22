package p19.loosecoupling;

public class User {
	
	public static void main(String[] args) {
		Meta m = new Meta();
		Oracle o = new Oracle();
		Facebook f = new Facebook(o);
		f.display();
		
	}
}
