package demo.com.hcl.day4;

public class IntArray {

	public static void main(String[] args) {
		
		int oddSum = 0;
		int evenSum = 0;
		int i; 
	
		int Arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		for (i=0; i<10 ;i++) {
			
			if (Arr[i]%2==0) {
				
				evenSum= evenSum+Arr[i];
			}
				
			else {
				oddSum = oddSum+Arr[i];
			}
				
		}	
		
		System.out.println("The sum of even numbers are: " + evenSum);
		System.out.println("The sum of odd numbers are: " + oddSum);
		
	}

}
