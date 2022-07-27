package demo.com.hcl.day3;

public class Airline {
	
		private String boardingName;
		private String destination;

		public void getDetails() {
		
			System.out.println(boardingName + " " + destination);
		}

		public String getBoardingName() {
			return boardingName;
		}

		public void setBoardingName(String boardingName) {
			this.boardingName = boardingName;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		
}
