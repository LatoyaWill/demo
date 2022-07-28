package demo.com.hcl.day7;

import java.util.Enumeration;
import java.util.Vector;

public class VectorAssignment {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("Louisiana");
		v.add("Texas");
		v.add("Michigan");
		
		for (String str : v) {
			
			System.out.println(str);
		}
		
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
