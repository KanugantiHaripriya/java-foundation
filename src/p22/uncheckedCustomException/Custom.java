package p22.uncheckedCustomException;

import java.util.Scanner;

import p21.customException.ALessThanBException;

public class Custom {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		try {
			if(a>b) {
				System.out.println(a-b);
			}
			else {
				throw new ALessThanBException();
			}
		}
		catch(ALessThanBException e) {
            System.out.println("Exception handled");
        }
	}
	
	
}
