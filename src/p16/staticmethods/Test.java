package p16.staticmethods;

public class Test {

	public static void main(String[] args) {

        System.out.println("Main method started");

        StaticDemo.sm1();   // static method call

        StaticDemo obj = new StaticDemo();   // object creation

        obj.nsm();   // non static method call

        System.out.println("Main method ended");
    }

}
