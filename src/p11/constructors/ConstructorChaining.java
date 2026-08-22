package p11.constructors;

public class ConstructorChaining {
    
    String name;
    double mock;
    int nod;
    
    ConstructorChaining(String name, double mock, int nod) {
        this(name, mock);
        this.nod = nod;
        System.out.println("This is 1st");
    }

    ConstructorChaining(String name, double mock) {
        this(name);
        this.mock = mock;
        System.out.println("This is 2nd");
    }

    ConstructorChaining(String name) {
        this.name = name;
        System.out.println("This is 3rd");
    }

    public static void main(String[] args) {
        ConstructorChaining cc = new ConstructorChaining("Deric", 7.5, 5);
    }
}