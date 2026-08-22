package p10.instanceInitialisationBlock;

public class Demo {
	
	String name;
	int rollNo;
	
	{
		name= "Deric";
		rollNo= 112;
		System.out.println("Instance Initialisation Block - 1");
	}
	
	{
		System.out.println("Instance Initialisation Block - 2");
	}
	{
		System.out.println("Instance Initialisation Block - 3");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.name+" "+d.rollNo);
		
		Demo d1 = new Demo();
		System.out.println(d1.name+" "+d1.rollNo);
	}
}

/*
SampleOutput:
Instance Initialisation Block - 1
Instance Initialisation Block - 2
Instance Initialisation Block - 3
Deric 112
Instance Initialisation Block - 1
Instance Initialisation Block - 2
Instance Initialisation Block - 3
Deric 112
*/