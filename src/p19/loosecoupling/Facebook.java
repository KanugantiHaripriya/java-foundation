package p19.loosecoupling;

public class Facebook {
	
	Server s;
	
	public Facebook(Server s) {
		this.s = s;
	}
	
	void display() {
		s.connect();
	}
}
