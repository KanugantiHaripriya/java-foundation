package p07.variableClashing;

public class Horse {
	String name="Kalyani";
	double height=90;
	
	void jump() {
		double height=20;
		System.out.println("Horse height is "+this.height);
		System.out.println("Horse jump height is "+height);
	}
	public static void main(String[] args) {
		Horse h = new Horse();
		h.jump();
		Horse h1=new Horse();
		h1.height=100;
		h1.jump();
	}
}

/*
SampleOutput:
Horse height is 90.0
Horse jump height is 20.0
Horse height is 100.0
Horse jump height is 20.0
*/
