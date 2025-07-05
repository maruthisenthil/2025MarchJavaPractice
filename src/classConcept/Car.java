package classConcept;

public class Car {
	
	// Class variables or Global variables [1. static and 2. non-static]

	// non-static variable or instance variables 
	String name;
	int price;
	String licenseNumber;
	String model;
	
	
	// also called class variables, static variables
	final static int wheels=4;  // Object will never hold any static variable
	// 1. Final is for constant variables - ADV to avoid manipulation or change the value of the static variable. 
	// 2. Final is used to avoid method overriding and  prevent inheritance. 
	
	// Static variables are not part of the object memory location: 
	// Common properties can move to Static variables - Advantages is to save memory
	// Static will goes to CMA - Common Memory Allocation
	// also called as permanent generation and now it is called as MetaSpace
	// CMA - > Permanent Generation -> Metaspace

	public static void main(String[] args) {
		
		int i = 10; // local variable - cannot be static in nature 
		

		// Local Variables cannot be static
		
		Car c1=new Car(); // Object creation or instantiation both are same 
		c1.name="BMW";
		c1.price=40;
		c1.licenseNumber="BSK3789";
		c1.model="Z+";
//		c1.wheels=4;
		
		Car c2=new Car();
		c2.name="Audi";
		c2.price=50;
		c2.licenseNumber="BSMO89";
		c2.model="Q+";
//		c2.wheels=4;
		
		Car c3=new Car();
		c3.name="Honda";
		c3.price=30;
		c3.licenseNumber="BHONDA789";
		c3.model="Civic+";
//		c3.wheels=4;
		
		// how to access static variable? 
		// 1. access directly 
		System.out.println(wheels); // 4
		
		// 2. using the class name:
		System.out.println(Car.wheels); //4 -  BestPractice to use with "ClassName.StaticVariableName"
		
		// 3. using the object reference name ??-Yes with warning as 
		//"The static field Car.wheels should be accessed in a static way"
		//3 is not recommended 
		System.out.println(c1.wheels);
		
		
//		Car.wheels=6; //  The final field Car.wheels cannot be assigned
		// 
		System.out.println(c1.name+"-"+c1.price+" "+c1.licenseNumber+" - "+c1.model+" - "+Car.wheels);
		System.out.println(c2.name+"-"+c2.price+" "+c2.licenseNumber+" - "+c2.model+" - "+Car.wheels);
		System.out.println(c3.name+"-"+c3.price+" "+c3.licenseNumber+" - "+c3.model+" - "+Car.wheels);
		
		
				
				

	}

}
