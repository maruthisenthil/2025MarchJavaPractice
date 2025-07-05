package staticMethod;

public class Employee {

	// memory - non-static method goes to Heap
	public void getEmail() {
		System.out.println("Get Email - Non-Static");
	}
	
	public static void sendMail() {
		System.out.println("send mail - static method");
	}
	
	public static void sendMail(int a) {
		System.out.println("send mail - static method "+ a);
	}
	
	// user method/ caller method
	// memory - static method goes to metaspace 
	// no business logic:
	// void: no return because of no business logic
	// static
	// psvm: String[]
	public static void main(String[] a) {
		
		System.out.println(a[0]); // AIOB

		// access non-static method - create object for the class
		Employee e1 = new Employee();
		e1.getEmail();
//		e1.sendMail();  // The static method sendMail() from the type Employee should be accessed in a static way
		
		//2. how to access static method: 
		// a. calling it directly
		sendMail();

		//b. using the class name: 
		Employee.sendMail();
		
	}
}
