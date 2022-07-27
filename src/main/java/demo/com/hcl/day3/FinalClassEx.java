package demo.com.hcl.day3;

class Restaurant {
	
	protected String restaurant = "Restaurant1";
	
	final void details() {
		
		System.out.println("Type: Fine Dining");
		System.out.println("Attire: Business Casual");		
	}
}

class Flemings extends Restaurant {
	
	
	void specialty() {
		super.details();
		System.out.println("Category: Steakhouse");
	}	
}

public class FinalClassEx {
	
	public static void main(String args[]) {
		
		Flemings m = new Flemings();
		m.specialty();
	}
}