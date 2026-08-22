package p03.scanner;
import  java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		// Create Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);
		
		// Prompting user to enter their name
		System.out.println("Enter your name:");
		String name = sc.nextLine();  // Reads full name including spaces
		// If you use sc.next() instead, it will read only the first word

		// Prompting user to enter their age
		System.out.println("Enter your age:");
		int age = sc.nextInt();  // Reads an integer value

		// Prompting user to enter their phone number
		System.out.println("Enter your phone number: ");
		long ph_no = sc.nextLong();  // Reads a long value

		// Prompting user to enter their salary
		System.out.println("Enter your salary: ");
		double sal = sc.nextDouble();  // Reads a double value

		// Displaying the collected details
		System.out.println("-------Details-------------");
		System.out.println("Name of the person: " + name);
		System.out.println("Age of the person: " + age);
		System.out.println("Phone number of the person: " + ph_no);
		System.out.println("Salary of the person: " + sal);
	}


}

/* Sample output:
 
Enter your name:
Deric
Enter your age:
35
Enter ypur phone number: 
9876543210
Enter your salary: 
50000
-------Details-------------
Name of the person: Deric
Age of the person: 35
Phone number of the person: 9876543210
Salary of the person: 50000.0

*/