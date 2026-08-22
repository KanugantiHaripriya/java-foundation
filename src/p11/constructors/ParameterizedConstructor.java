package p11.constructors;

public class ParameterizedConstructor {
	String name;
	int age;
	ParameterizedConstructor(String name,int age){
		this.name=name;
		this.age = age;
	}
	public static void main(String[] args) {
		
		ParameterizedConstructor pc = new ParameterizedConstructor("Hari",23);
		System.out.println(pc.name+pc.age);
		
		ParameterizedConstructor pc1 = new ParameterizedConstructor("priya",43);
		System.out.println(pc1.name+pc1.age);
	}

}

/*
SampleOutput:
Hari23
priya43
*/