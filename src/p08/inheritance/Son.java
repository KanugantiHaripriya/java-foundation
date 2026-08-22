package p08.inheritance;

public class Son extends Father{

	public static void main(String[] args) {
		Son s = new Son();
		s.balance = 40000;
		s.height=5.4;
		//s.Gf='Saniya'; ERROR
		
		s.walk();
		//s.smoke(); ERROR
	}

}
