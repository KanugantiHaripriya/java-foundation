package p11.constructors;

public class ConstructorOverloading {
	
	String name;
	double mock;
	int nod;
	
	ConstructorOverloading(String name, double mock, int nod){
		this.name=name;
		this.mock=mock;
		this.nod=nod;
	}
	
	ConstructorOverloading(String name, double mock){
		this.name=name;
		this.mock=mock;
	}
	
	ConstructorOverloading(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {		
		ConstructorOverloading obj1 = new ConstructorOverloading("Ravi", 85.5, 10);
		ConstructorOverloading obj2 = new ConstructorOverloading("Ravi", 90.0);
		ConstructorOverloading obj3 = new ConstructorOverloading("Ravi");
		
		System.out.println(obj1.name + " " + obj1.mock + " " + obj1.nod);
		System.out.println(obj2.name + " " + obj2.mock);
		System.out.println(obj3.name);
	}
}
