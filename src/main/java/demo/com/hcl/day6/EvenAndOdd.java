package demo.com.hcl.day6;

public class EvenAndOdd {

	public static void main(String[] args) {
		// one thread prints even numbers
		// one thread prints odd numbers
		
		EvenNumThread2 obj = new EvenNumThread2();
		Thread t1 = new Thread(obj);
		t1.start();
		
		OddThread22 obj2 = new OddThread22();
		Thread t2 = new Thread(obj2);
		t2.start();

	}

}

class EvenNumThread2 implements Runnable {
	
	public void run() {
		for (int i = 0; i <= 15; i = i + 2) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

class OddThread22 implements Runnable {
	
	public void run() {
		for (int j = 1; j <= 15; j = j + 2) {
			System.out.println(j);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}