package p05.typesOfVariables;

public class InstanceVariables {
	String name;// Non-static (instance) variable
	int b;// Non-static (instance) variable
	
	// Non-static method can directly access instance variables
	void m() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		InstanceVariables iv = new InstanceVariables();
		iv.name="Hari";
		iv.m();
		System.out.println(iv.b); // will take default values of datatype
	}
}

/* 
SampleOutput:
Hari
0
*/

