package demo.com.hcl.day7;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Set<String> states = new LinkedHashSet<>();
		
		states.add("Louisiana");
		states.add("Texas");
		states.add("Michigan");
		
		for (String state : states) {
			
			System.out.println(state);
		}
		
		states.remove("Texas");
		
		Iterator<String> itr = states.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
