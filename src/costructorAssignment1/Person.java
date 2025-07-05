package costructorAssignment1;

public class Person {
	
//	Assignment 1:
//	AC: 
//	Create a Java class named "Person" with the following instance variables:
//	name (String)
//	age (int)
//	gender (char)
//	height (double)
//	Create a constructor for the Person class that takes in the name, age, gender, 
//		and height as parameters and initializes the instance variables.
//	Create a main method that creates two instances of the Person class using 
//		the constructor and prints out their information.
//
//	Questions:
//	1. What is the purpose of a constructor in Java?
//     		- Initialize the object and its instance variable using this keyword
			
//	2. How does a constructor differ from a regular method in Java?
//			- function can have any name but constructor only have same name of the class name
//			- functions may or may not return any value based on the requirement but constructor will never return 
//			- fun.. will have business logic, const.. no business logic only 
//			- fun.. can be static, const.. cannot be static because static stores in CMA/ MetaSpace
//			- fun.. will be stored in heap memory, const.. will goes to class loader. 
//	3. Can a Java class have multiple constructors? If so, how are they differentiated?
//			- Yes, multiple constructors are possible by overloading the constructor with different parameters 
//	4. What happens if a constructor is not defined in a Java class?
//			- Java Compiler will provide the default constructor.
//		Explanation from Naveen: If you don’t implement any constructor in your class, the Java compiler inserts 
//		default constructor into your code on your behalf. You will not see the default constructor 
//		in your source code (the .java file) as it is inserted during compilation and present in the bytecode (.class file).
//	5. Can a constructor call other methods or constructors within the same class?	
//			yes 
	
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("2 param_Constructor - Person Class"+ this.name+" == "+this.age);
	}

	public Person(String name, int age, char gender, double height) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	    this.height = height;
	    test();
	}
	
	public void test() {
		System.out.println("Test- method calling from Constructor");
	}
	
	public static void main(String[] args) {
		
		Person p=new Person("Senthil", 30, 'M', 5.11);
		
		System.out.println(p.name+"-"+p.age+"-"+p.gender+"-"+p.height);
				
	}

}
