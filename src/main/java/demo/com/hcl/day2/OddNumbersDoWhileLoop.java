package demo.com.hcl.day2;

public class OddNumbersDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 50;
		
		do {
			if (i%2 != 0) {
				
				System.out.println(i);	
			}
			
			i++;
		}
		
		while (i < 100); 	
	}

}
