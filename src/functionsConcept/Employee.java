package functionsConcept;

public class Employee {

	//methods/ functions
	
	// Cannot create a fucntion/ method inside a function/method
	// create method within the class
	
	//1. no input & no return:
	// name: test - Void cannot return anything 
	public void test() {
		System.out.println("test method");
		return; // Blank return is right syntax and equalent to void. 
	}
	
	//2. no input but some return:
	// return type: String
	public String getTrainerName() {
		System.out.println("getting trainer name ");
		return "Senthil";
	}
	
	// no input but return valu
	// return type is Int
	public int getMarks() {
		System.out.println("Getting final Marks");
		int a =10;
		int b =20;
		int c=-5;
		int finalMarks=a+b+c;
		return finalMarks;
	}
	
	public boolean isElementExist() {
		System.out.println("Check element exists");
		return true;
	}
	
	
	// 3. some input and some return
	// parameters = 2, 
	// return type : int
	public int add(int a, int b) { // Parameters 
		System.out.println("Adding two numbers ");
		int sum=a+b;
		return sum;
	}
	
	
	
	
	// caller method - object is created and calling all the methods.. 
	public static void main(String[] args) {
		System.out.println("main method");
		// create the object of this class:
		Employee e1 = new Employee();
		e1.test();
		String name = e1.getTrainerName();
		System.out.println(name);
		System.out.println(e1.getTrainerName());
		
		if(name.equals("Senthil")) {
			System.out.println("Lets open SAL");
		}
		
		boolean flag=e1.isElementExist();
		if(flag) {
			System.out.println("Element found ");
		}else {
			System.out.println("Element Not found");
		}
		//when we are passing value means then wen called as
		int result = e1.add(10, 20);// arguments/values - call by value 
		
		
		System.out.println("result: "+ result);
		
		int result2 = e1.add(-100, -100);
		System.out.println("result2: "+result2); 
		
		
		
			
	}	
}
