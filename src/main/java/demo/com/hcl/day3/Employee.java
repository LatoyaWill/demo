package demo.com.hcl.day3;

public class Employee {
	
	private String name = null;
	
	private String jobTitle = null;	
	
	private int age = 0;
	
	private int salary = 0;
	
	
	Employee() {
		System.out.println("Default Constructor");
		name = "Jane Doe";
		age = 25;
		jobTitle = " Developer ";
		salary = 60000;
		
	}
	
	Employee(String name, int age, int salary) {
		System.out.println("Param constructor");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	Employee(String name, String jobTitle) {
		System.out.println("Param constructor");
		this.name = name;
		this.jobTitle = jobTitle;
	}	
	
	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println("\nPrinting Employee Info:");
		System.out.println("\nName: " + e.name + "\nTitle:" + e.jobTitle + "\nAge: " +e.age + " \nSalary: " + e.salary );
	
	}

}
