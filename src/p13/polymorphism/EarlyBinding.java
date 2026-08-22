package p13.polymorphism;


public class EarlyBinding {
	
	void talk() {
		System.out.println("Pooja talks");
	}
	
	void talk(String topic) {
		System.out.println("Pooja talking about "+topic);
	}
	
	void talk(String topic, int time){
		System.out.println("Pooja talks about "+topic+" for "+time+" minutes");
	}

	public static void main(String[] args) {
		EarlyBinding eb = new EarlyBinding();
		eb.talk();
		eb.talk("Java");
		eb.talk("Python",20);
	}

}
