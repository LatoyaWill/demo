package demo.com.hcl.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Strawberry");
		fruits.add("Apple");
		fruits.add("Banana");
		
		for (String fruit : fruits) {
			
			System.out.println(fruit);
		}
		
		//animals.remove(1);
		
		for (int i = 0; i < fruits.size(); i++) {
			
			//System.out.println(fruit.get(i));
		}
		
		Iterator<String> itr = fruits.iterator();
		
		while(itr.hasNext()) {
			itr.remove();
			System.out.println(itr.next());
		}
	}

}
	
		
		
	
