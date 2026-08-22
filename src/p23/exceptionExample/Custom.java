package p23.exceptionExample;

import java.util.Scanner;

public class Custom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int a = sc.nextInt();

        System.out.println("Enter b value");
        int b = sc.nextInt();

        try {
            if(a > b) {
                System.out.println(a - b);
            }
            else {
                throw new ALessThanBException("value A less than B");
            }
        }
        catch(Exception e) {
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
        }
    }
}