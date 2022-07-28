package demo.com.hcl.day7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> vegetables = new LinkedList< >();
		
		vegetables.add("Brocolli");
		vegetables.add("Cabbage");
		vegetables.add("Spinach");
		
		for (String vegetable : vegetables) {
			System.out.println(vegetable);
		}
		
		//animals.remove(1);
		
		for (int i = 0; i < vegetables.size(); i++) {
			
			System.out.println(vegetables.get(i));
		}
		
		Iterator<String> itr = vegetables.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
