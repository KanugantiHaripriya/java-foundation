package p20.exceptions;

public class CheckedException {
	public static void main(String[] args) {
		try {
			Class.forName("Excep.Employee");
		}
		catch(ClassNotFoundException  e){
			e.printStackTrace();
		}
	}
}
