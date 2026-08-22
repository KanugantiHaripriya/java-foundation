package p11.constructors;

public class ZeroParameterConstructor {
	String name;
	int age;
	ZeroParameterConstructor(){
		this.name = "Hari";
		this.age = 21;
	}
	
	public static void main(String[] args) {
		ZeroParameterConstructor zp = new ZeroParameterConstructor();
		System.out.println(zp.name+zp.age);
	}
	
	

}
