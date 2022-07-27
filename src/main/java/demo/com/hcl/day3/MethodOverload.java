package demo.com.hcl.day3;

public class MethodOverload {

	public static void main(String[] args) {
		
	Train ob = new Train();
	ob.travel();
	ob.travel("train");
	

	}

}


class transport {
	public void travel() {
		
		System.out.println("Travel by boat");
	}
}

class Train extends transport {
	public void travel(String name) {
		System.out.println("Travel by " + name);
	}
}

