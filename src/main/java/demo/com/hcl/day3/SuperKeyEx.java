package demo.com.hcl.day3;

class Vehicle {
	
	Vehicle() {
		System.out.println("Super class constructor");
	}
	
	protected String vehicle = "Vehicle1";
	
	void details() {
		
		System.out.println("Type: Motorcycle");
		System.out.println("Axels: 2");		
	}
}

class Motorcycle extends Vehicle {
	
	Motorcycle() {
		super();
		System.out.println("Subclass constructor");
		
	}
	
	void specs() {
		super.details();
		System.out.println("Fuel type: Gas");
	}	
}

public class SuperKeyEx {
	
	public static void main(String args[]) {
		
		Motorcycle m = new Motorcycle();
		m.specs();
	}
}