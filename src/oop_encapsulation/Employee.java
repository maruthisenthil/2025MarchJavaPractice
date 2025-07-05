package oop_encapsulation;


// POJO Class - Plain Old Java Object 
// the class follow the rules public class, private variables, public const.. and public getter & setter class 
// then it is called as POJO class.

// Encapsulation is secure the class member variables and methods via private access specifiers to avoid access from out side of the class for data security
// Assigning the value of the private variables via public constructors. 

public class Employee {

	// private vars or instance variables 
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	// public getter / setter
	
//	setter will will behave like UPDATE/ PATCH API when we have constructor  
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		// AC: Age >=18
		if(age>=18) {
			this.age = age;
		}else{
			System.out.println("Age Cannot be less than 18");
		}
		
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
// public const.. work like a setter for the initial values
	public Employee(String name, int age, double salary, boolean isActive) {
	
		this.name = name;
		if(age>=18) {
			this.age = age;
		}else{
			System.out.println("Age Cannot be less than 18");
		}
		this.salary = salary;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
	
//		Employee e1 = new Employee();
//		e1.name="Senthil";
	}

}
