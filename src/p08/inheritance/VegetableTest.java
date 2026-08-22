package p08.inheritance;

class VegetableTest{
	public static void main(String[] args) {
		Vegetable v= new Vegetable();
		v.name="Beetroot";
		v.price=30;
		v.qty=20;
		v.wash();
		v.chop();
		//v.prepareHalwa(); ERROR
		
		Carrot c = new Carrot();
		c.wash();
		c.chop();
		c.prepareHalwa();
	}

}
