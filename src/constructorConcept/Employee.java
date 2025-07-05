package constructorConcept;

public class Employee {
	
	// Global variables/ Class variables
	String name;
	int age;
	double salary;
	String dob;
	boolean isActive;
	char gender;
	
	// constructor of the class;
	// 1. will help me to create the object on the basis of given requirement
	// 1.2 will help class to initialize the instance variable using this keyword
	// 2. const.. will be called when we create the object; depends on the passing values
	// 3. How to create - const.. will have the same name as the class name
	// 4. duplicate const ..are not allowed for the class
	// 5. We can overload the constructor with different params
	// 6. const ... will never return anything .... no return type, no void
	// 7. const.. is not a function 
	// 8. Const.. should not have business logic
	// 9. business logic should be written in the function.. and function will return something ... 
	// 10.create cons.. based on the template variables.... 
	
	// func vs constructor
	// func can have any name, but cont will have the same name of the class name... 
	// func may or may not return but the const will never return anything  
	// No business logic in const.. business logic only inside the function..
	// const... cannot be static ... func can be static and non-static
	// function will be called using obj reference or using the class if it is static .. const will be call when 
				// we create the object ... 
	// const.. and functions can be overloaded 
	// const .. is preventing to create unnecessary objects, functions will have the business object 
	// const .. used to init the instance variable using this keyword... and functions also possible... 
	// constructor will be stored in class loader during the execution - no cma/ meta space, no heap and no stack. 
	
//	public Employee() {
//		System.out.println("const ... 0 param");
//	}
//	
//	public Employee(int a ) { // 1 param constructor 
//		System.out.println("const ... 1 param : "+ a);
//	}
//	
//	public Employee(int a, String b ) { // 2 param constructor 
//		System.out.println("const ... 2 param : "+ a+b);
//	}
//	
	//AcceptanceCriteria: Employee Registration form:
	// name, age
	// name, age, dob
	// name, age, salary
	// name, age, salary, dob, isActive, gender.
	// no info --> no registration --> no need to create employee with blank info.
	
	public Employee(String name, int age) { // 2 param
		System.out.println("2 param : "+name+"-"+age);
		System.out.println("2 param : "+this.name+"-"+this.age);
		this.name = name;
		this.age=age;
		System.out.println("2 param : "+this.name+"-"+this.age);
		
	}
	
	public Employee(String name, int age, String dob) {
		this.name = name;
		this.age=age;
		this.dob=dob;
	}
    
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age, double salary, String dob, boolean isActive, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dob = dob;
		this.isActive = isActive;
		this.gender = gender;
	}

	public static void main(String[] args) {
//		Employee e1= new Employee();
//		Employee e2= new Employee(10);
//		Employee e3= new Employee(100,"Senthil");
		
		//CRUD:
		// Create - POST 
		Employee e1= new Employee("Senthil", 30);
		System.out.println(e1.name+"-"+e1.age+"-"+e1.salary+"-"+e1.isActive+"-"+e1.dob+"-"+e1.gender);
		// Update - PUT/Patch
		e1.salary=35.9;
		e1.isActive=true;
		//Read - GET
		System.out.println(e1.name+"-"+e1.age+"-"+e1.salary+"-"+e1.isActive+"-"+e1.dob+"-"+e1.gender);
		//Update - PUT/Patch
		e1.dob="01-02-3004";
		//Read - GET
		System.out.println(e1.name+"-"+e1.age+"-"+e1.salary+"-"+e1.isActive+"-"+e1.dob+"-"+e1.gender);	
		
		Employee e2=new Employee("Bairava", 25);
		
		Employee e3= new Employee("Naveen", 35, 66.90);
		
		Employee e4 = new Employee("Revathy", 30, 15.00, "1-02-2003", false, 'f'); // POST
		System.out.println(e4.name+"-"+e4.age+"-"+e4.salary+"-"+e4.isActive+"-"+e4.dob+"-"+e4.gender); // GET
		e4.salary=30.12;
		System.out.println(e4.name+"-"+e4.age+"-"+e4.salary+"-"+e4.isActive+"-"+e4.dob+"-"+e4.gender); // GET
	}

}
