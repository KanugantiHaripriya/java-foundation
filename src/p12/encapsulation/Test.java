package p12.encapsulation;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setName("Haripriya");
		s1.setAge(20);
		s1.setGender("Female");

		System.out.println("Name is : "+s1.getName()+"\nAge is : "+s1.getAge()+"\nGender is : "+s1.getGender());
	}

}
