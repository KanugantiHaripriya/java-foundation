package p06.thisKeyword;

public class Horse {
	String name="Chethak";
	double height= 11.5;
	
	void display() {
		System.out.println("Horse name is "+this.name);
	}

	public static void main(String[] args) {
		Horse h1= new Horse();
		h1.display(); // Horse name is Chethak
		h1.name="Kalyani";
		h1.display();// Horse name is Kalyani
		
		Horse h2= new Horse();
		h2.display(); // Horse name is Chethak
		h2.name="Breego";
		h2.display(); // Horse name is Breego
	}
}

/*
SampleOutput:
Horse name is Chethak
Horse name is Kalyani
Horse name is Chethak
Horse name is Breego
*/