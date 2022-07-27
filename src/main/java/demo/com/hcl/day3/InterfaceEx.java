package demo.com.hcl.day3;

public class InterfaceEx {

	public static void main(String[] args) {
		
		Food food = new Steak();
		food.cook();
		food.serve();
		food = new Lobster();
		food.cook();
		food.serve();

	}

}

interface Food {
	
	void cook();
	
	void serve();
}


class Steak implements Food {
	
	
	public void cook() {
		System.out.println("Cooking Steak");
	}
	
	
	public void serve() {
		System.out.println("Serving Steak ");
	}
}
	
class Lobster implements Food {
	
	
	public void cook() {
		System.out.println("Cooking Lobster");
	}
	
	
	public void serve() {
		System.out.println("Serving Lobster" );
	}

}	
