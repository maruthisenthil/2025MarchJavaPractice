package methodCalling;

public class Employee {
	
	String name;
	int age;
	public void sendMail() {
		System.out.println("send mail method ");
	}
	
	public static void getMail(Employee e2) {
		System.out.println("get mail method ");
		System.out.println(e2.name);
		System.out.println(e2.age);
		e2.sendMail(); // e2=e1
		e2.name="Balarajendiran";
		e2.age=73;
	}
	
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.age=30;
		e1.name="Senthil";
		Employee.getMail(e1);
		
		System.out.println("----------");
		System.out.println(e1.name);
		System.out.println(e1.age);
	}
}

// Cheat Sheet
// Static calling Static - CMA to CMA  - No object creation : call it using class name/directly
// Non-Static calling Non-static - direct calling
// Non-static calling Static : - no object creation - call it using class name/ directly
// Static calling Non-static : - Create the Object/ use call by reference