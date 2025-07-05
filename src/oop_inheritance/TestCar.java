package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		System.out.println("BMW");
		b.start(); // overridden method Child class overridden method will be called
		b.stop(); // inherited method of parent class
		b.refule(); // inherited method but after overriden the child class method will be called
		b.autoParking(); // individual/own method of the BMW class
		System.out.println(b.speed); // 100
		b.engine(); // Overridden method of Grand Parent "Vehicle" class properties
		b.wind(); // overridden method from Grand parent 
		b.myLoading(); // Has A Relation - Composition [Truck class ]
		b.restart(); // Inherited final method from Car class  
		
		BMW.billing(); // parent class static method can be called using child class 
					  // but if the child has same static method then child class method will be called
		
		Car.billing();
		b.carLocking();
		b.speed = 400;
		System.out.println("---------------------------");
		// 
		Car c = new Car();
		System.out.println("Car");
		c.start();
		c.stop();
		c.refule();
//		c.speed=300; //The final field Car.speed cannot be assigned
		System.out.println(c.speed);// 100
		c.engine();
		c.wind();
		Car.billing();
//		c.locking() // Private behaviour cannot be access outside of the class
		c.carLocking();
		System.out.println("---------------------------");
		
		Audi au = new Audi();
		System.out.println("Audi");
		au.start(); // inherited method 
		au.stop(); // inherited method
		au.refule(); // inherited method
		au.theftSafety(); // individual/own method of the Audi class
		au.engine();
		au.wind();
		System.out.println(au.speed); // 100
	
		System.out.println("---------------------------");
		
		
		
		
		// Child class object can be referred by parent class reference variables - is called as Top/Uo casting
		// Topcast / up cast 

		
		Car c1=new BMW();
		
		c1.start(); //  overriddend - always called overriden method will be called - child class overridden method
		c1.stop(); // inherited methods  - from car
 		c1.refule(); // inherited methods - from car
 		c1.engine(); // inherited methods - from Grand parent Vehicle
 		c1.wind();

 		
// 		c1.autoParking(); 
 		// cannot access autoParking() - individual method of BMW - and parent class ref type check is failed
 	
		// java will check c1 is related to Car class then only we will get class ref access
//		c1.autoParking(); // Here java will do "reference type check" -  and refernce check is failed 
// 		with the top casting - indivudual method of class cannot be accessed with the parent class reference 

// 		// reference check will not be applicable to variables -- only parent class variable will go here 
 		System.out.println(c1.speed);  // car -reference check is not possible for variables 
		
//		down casting: 
// 		parent class object can be referred by child class ref variable?? 
 		
// 		BMW b1= new Car(); // Type mismatch: cannot convert from Car to BMW - CT [Compile time error]
 		
// 		BMW b1= (BMW) new Car(); // RT - Runtime Exception: 
 		// java.lang.ClassCastException: class oop_inheritance.Car cannot be cast to class oop_inheritance.BMW (oop_inheritance.Car and oop_inheritance.
 		// b1.start();
 		// b1.stop();
 		// b1.refule();
 		
		
		
		
		
		
		
		
	}
	
}
