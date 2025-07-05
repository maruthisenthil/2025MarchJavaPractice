package costructorAssignment1;

public class Car {
	
//	Assignment 4: AC
//
//		Create a Java class named "Car" with the following instance variables:
//		make (String)
//		model (String)
//		year (int)
//		Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
//		Create a default constructor for the Car class that sets the make, model, and year to "Unknown". [are you mentioning the unknown as defaul value for the class variables?]
//		Create a main method that creates three instances of the Car class using both constructors and prints out their information.
//
//		Questions:
//		What is the purpose of a default constructor in Java?
//		 	purpose of the default constructor will initiate the default of the instance variables of the class
//		Can a default constructor take in parameters?
//			default constructor by Java Compiler during the runtime dont have parameters in the constructors 
//		Can a constructor be overloaded in Java? If so, what does it mean to overload a constructor?
//			Constructors can be overloaded in Java. Via overloaded constructors we can avoid unnecessary object creation combination
//			when there is the need to initialize the instance variables of the class  
//		Can you create an object of a Java class without calling a constructor?
//			No, when we create an object of class by defalut Java compiler will provide default constructor 
//			to initialize default values for the instance variables of the class
//		How are instance variables accessed and modified outside of the class they are defined in?
//			instance varaibles of the calss can be accessed by the getter methods of the class using the object reference of the class.
	
	
	String make; 
	String model;
	int year;
	
	
	public Car() {
//		this.make = "";
//		this.model = "";
//		this.year = 0;
	}
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c2 = new Car();
		System.out.println(c2.make+" - "+c2.model+" - "+c2.year);
		Car c1 = new Car("Audi", "25AUDA+", 2026);
		System.out.println(c1.make+" - "+c1.model+" - "+c1.year);

	}

}
