package demo.com.hcl.day5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class CustomException {

	public static void main(String[] args) throws ShipUnavailableExeception {
		// TODO Auto-generated method stub
		
		CruiseService cs = new CruiseService();
		cs.getShipDetails("Royal Carribean");

	}

}


class CruiseService{
	
		CruiseLine c1 = new CruiseLine(5, "Norweigan");
		CruiseLine c2 = new CruiseLine(7, "Carnival");
		
		CruiseLine cruiseArr[] = {c1, c2};
		
		public void getShipDetails(String shipName) throws ShipUnavailableExeception {
			if (shipName == "Norweigan" || shipName == "Valor") {
				if ( shipName == "Norweigan") {
					System.out.println(cruiseArr[0]);
				}
			} else {
				throw new ShipUnavailableExeception("Ship is unavailble for cruising ");
			}
		}
	
}

class ShipUnavailableExeception extends Exception {
	
	ShipUnavailableExeception(String message) {
		super(message);
	}
}

@Setter
@Getter
class CruiseLine	{
	
	CruiseLine(int cruiseDuration, String shipName) {
		
		this.cruiseDuration = cruiseDuration;
		this.shipName = shipName;
		
	} 
	
	private int cruiseDuration;
	private String shipName;
}