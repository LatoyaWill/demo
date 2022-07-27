package demo.com.hcl.day4;


public class StringAssignment {

	public static void main(String[] args) {
		
		String str1 = "Assignment";
		String str2 = "Assignment";
		
		System.out.println(str1 == str2);
		
		String str3 = new String("Assignment");
		String str4 = new String("Assignment");
		
		System.out.println(str2 == str4);
		System.out.println(str3.equals(str4));
		
		

	}

}
