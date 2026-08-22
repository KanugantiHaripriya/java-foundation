package p15.Strings;

public class TwoStringmethod {
	String brand;
	int ram;
	long battery;
	double price;
	
	public TwoStringmethod(String brand, int ram, long battery, double price) {
		this.brand = brand;
		this.ram = ram;
		this.battery = battery;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Brand:"+brand+" RAM:"+ram+" Battery:"+battery+" Price:"+price; 
	}
	
	public static void main(String[] args) {
		TwoStringmethod m = new TwoStringmethod("Nokia",1,1000,500);
		System.out.println(m);
	}
}


