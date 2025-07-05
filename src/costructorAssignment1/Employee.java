package costructorAssignment1;

public class Employee {


//	AC: Assignment 3:
//		Create a Java class named "Employee" with the following instance variables:
//			id (int)
//			name (String)
//			salary (double)
//		Create a constructor for the Employee class that takes in the id, name, and salary as 
//			parameters and initializes the instance variables.
//		Create getter methods for each of the instance variables.
//		Create a main method that creates an instance of the Employee class using the constructor,
//			prints out the employee's information using the getter methods, 
//			and gives the employee a 10% raise using the setter method for the salary instance variable.
//
//		Questions:
//		What is the purpose of a getter method in Java?
//			Getter method is to get the value of the Instance variable of the class... 
//		Can a getter method return void?
//			no getter method cannot be void, the purpose of the method is to get the value of the instance variable so it cannot be avoid
//		What is the access level of a getter method in Java?
//			- Any class having object reference can have the access of getting method when the getter methods are public.
//		What is the purpose of a setter method in Java?
//		 	- setter methods is used to set/ initialize the value of the instances variables of the class. 
//		Can a setter method return a value other than void?
//			- No, setter method can be void in nature because the purpose of setter is to set the value of the instance variables.   
	
	
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println(this.id+" --- "+this.name+" --- "+this.salary);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double tenPercent) {
		double tenPercentActual=tenPercent/100;
		System.out.println("tenPercent: "+ tenPercentActual);
		this.salary = this.salary + (this.salary * tenPercentActual);
	}


	public static void main(String[] args) {
		Employee e1= new Employee(1234,"Senthil", 35.40);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		e1.setSalary(10);
		System.out.println(e1.getSalary());

	}

}
