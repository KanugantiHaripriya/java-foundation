package p09_methodOverRidingandmethodOverloading;

public class MethodOverloading {
	
	void add(int a) {
		System.out.println(a+10);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add(1);
		mo.add(3,4);
		mo.add(3,4,5);
	}
}

/*
SampleOutput:
11
7
12
*/
