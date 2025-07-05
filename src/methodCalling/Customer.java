package methodCalling;

public class Customer {

	String name;
	int age;
	
	public void sendMail() {
		System.out.println("send mail ");
		System.out.println("Name: "+name+" - age: "+age);
	}
	
	public static void getMail() {
		System.out.println("get mail ");
		
		Customer obj= new Customer();
		
		obj.name="tom";
		obj.age=20;
		
		obj.sendMail();
	}
	
	public static void main(String[] args) {
		// 
	Customer.getMail();
	
	}
}

// Cheat Sheet
// Static calling Static - CMA to CMA  - No object creation : call it using class name/directly
// Non-Static calling Non-static - direct calling
// Non-static calling Static : - no object creation - call it using class name/ directly
// Static calling Non-static : - Create the Object/ use call by reference