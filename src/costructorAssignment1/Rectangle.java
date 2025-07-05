package costructorAssignment1;

public class Rectangle {
	
//	Assignment 2:
//	Create a Java class named "Rectangle" with the following instance variables:
//		length (double)
//		width (double)
//	Create a default constructor for the Rectangle class that sets both the length and width to 0.0.
//	Create a constructor for the Rectangle class that takes in the length and width as parameters and 
//		initializes the instance variables.
//	Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).
//	Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.

//	Questions:
//	1. What is the purpose of a default constructor in Java?
//			Compiler will provide default constructor when no constructor is defined and it is mainly used to initialize 
//		the default values for the instance variables. We dont need to pass any values for default constructor  
//	2. How can you differentiate between a default constructor and a constructor that takes in parameters?
//		No need to define Default constructor if we are specifying we dont need to pass any required parameters     		
//	3. What is the access level of a constructor in Java?
//				Constructors can be access with in the class
//	4. Can a constructor be private? If so, why would you want to make a constructor private?
//			Yes, constructor can be private, to restrict or control the object creation of the classes 
//	5. Can a constructor call a method from another class?
//			Yes, A class constructor can b called in the B class main main method
	
	double length;
	double width;
	
	public Rectangle() {
		this.length = 0.0;
		this.width  = 0.0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea(Rectangle rect) {
		return this.length * this.width;
	}

	
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10.2, 12.09);
		
		double rectAreaResult=rect2.calculateArea(rect2);
		System.out.println("Area of a rectangle: "+rectAreaResult);
		
	}
}
