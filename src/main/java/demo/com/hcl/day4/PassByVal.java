package demo.com.hcl.day4;

public class PassByVal {

	public static void main(String[] args) {
		
		// Pass By Value Example
		VehicleMsrp vm = new VehicleMsrp();
		String vMake = "BMW";
		vm.getVehicleDet(vMake);
		System.out.println(vMake);
		
		
		//Pass by reference
		Vehicle p = new Vehicle();
		
		VehicleMsrp v = new VehicleMsrp();
		v.calDoorPrice(p);
		
		System.out.println(p.getPrice());
	}

}

class Vehicle {
	private int price;
	
	private String make;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
}

class VehicleMsrp {
	public void calDoorPrice(Vehicle p) {
		
		p.setPrice(65000);
		
	}
	
	public void getVehicleDet(String vMake) {
		
		vMake = "Mercedes";
		
	}
}