package p01.objectCreation;

public class Employee {
	int eid = 1001;
	String name = "Deric";
	
	void jobRole() {
		System.out.println("He is a Software Engineer");
	}
	
	public static void main(String[] args) {

		// Creating the first Employee object 'e'
		Employee e = new Employee();

		// Printing the default values of 'e' (name and eid)
		System.out.println(e.name + " " + e.eid);

		// Creating the second Employee object 'e1'
		Employee e1 = new Employee();

		// Updating the values of 'e1' object's eid and name
		e1.eid = 2001;
		e1.name = "Remo";

		// Printing the updated values of 'e1'
		System.out.println(e1.name + " " + e1.eid);

		// Calling the jobRole() method for 'e1'
		e1.jobRole();
		
	}
}

/* Sample Output
Deric 1001
Remo 2001
He is Software Engineer
*/
