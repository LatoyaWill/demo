package demo.com.hcl.day3;

public class InheritanceEx {

	public static void main(String[] args) {
		Airline a1 = new Airline();
		a1.setBoardingName("John Doe");
		a1.setDestination("LAX");
		
		Southwest s = new Southwest();
		s.setBoardingName("John Doe");
		s.setDestination(" Los Angeles,CA LAX");
		s.setBoardingClass("First Class");
		
		s.getDetails();
		s.getBoardingClass();
	}

}
