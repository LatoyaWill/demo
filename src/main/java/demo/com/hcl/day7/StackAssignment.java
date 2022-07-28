package demo.com.hcl.day7;

import java.util.Stack;

public class StackAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> states = new Stack<>();
		
		states.push("Louisiana");
		states.push("Texas");
		states.push("Michigan");
		
			
			System.out.println(states);
			
			System.out.println(states.peek());
			System.out.println(states.peek());

			System.out.println(states.pop());
			System.out.println(states.pop());

			System.out.println(states);

			
	}

}
