package demo.com.hcl.day6;

import lombok.Getter;
import lombok.Setter;

public class Synchronized {

	public static void main(String[] args) {
		// Synchronization example

		Thread1 obj1 = new Thread1();
		Thread t1 = new Thread(obj1);
		t1.start();
		
		Thread t2 = new Thread(obj1);
		t2.start();
		
	}

}

class Thread1 implements Runnable {

	WarehouseInventory wi = new WarehouseInventory();
	
	public void run() {
		wi.fulfillShipment(1500);
	}
	
}

class WarehouseInventory {
	
	Warehouse w = new Warehouse();
	
	public synchronized void fulfillShipment(int amount) {
		
		int inventory = w.getInventory();
		int updtdInventory = inventory - amount;
		System.out.println("Inventory amount deducted " +  amount);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		w.setInventory(updtdInventory);
		System.out.println("Updated inventory count " + w.getInventory());
		
	}
	
	
	
}

@Setter
@Getter

class Warehouse {
	
	private Long accNum;
	
	private int inventory = 5000;
	
	
}