package demo.com.hcl.day3;

public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accounts a = new Accounts();
		Accounts a2 = new Account2();
		Accounts a3 = new Account3();
		
		System.out.println(a.getAvailableBalance());
		System.out.println(a2.getAvailableBalance());
		System.out.println(a3.getAvailableBalance());
	}

}
