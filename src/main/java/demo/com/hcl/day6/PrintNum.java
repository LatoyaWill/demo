package demo.com.hcl.day6;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberThread obj = new NumberThread();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}

class NumberThread extends Thread {
	
	public void run() {
		
		for (int i = 0; i <= 50; i = i +2 ) {
			System.out.println(i);		}

		
	}
}
