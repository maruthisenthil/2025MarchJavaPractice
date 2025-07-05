package classConcept;

public class Employee {
	
	String name;
	String designation;
	int id;
	String dept;
	boolean isPermanent;

	public static void main(String[] args) {
		// Class is blueprint, template, category for all the objects
		// Human - name, age, height
		// Laptop - name, brand, price, color, RAM
		// Employee - name, designation, city, dept, manager
		
		// Create Object using new keyword 
		
		Employee obj = new Employee();
		
		// Employee - class
		// obj is the object reference variable; type of the obj: Employee[it is a class so it is non-primitive]
		// new Employee(); -- object is present in the RHS 
		System.out.println(obj.name); // Default value  - null
		System.out.println(obj.id); // Default value - 0
		System.out.println(obj.isPermanent); // Default value - false
		
		// Assigning value: 
		obj.name="Tom";
		obj.designation="Director";
		obj.id=100;
		obj.dept="Admin";
		obj.isPermanent=true;
		
		System.out.println(obj.name);
		System.out.println(obj.designation);
		System.out.println(obj.id);
		System.out.println(obj.dept);
		System.out.println(obj.isPermanent);
		System.out.println("======");

		// Another emp added to 
		Employee emp=new Employee();
		
		// Assigning value: 
		emp.name="Pooja";
		emp.designation="QA";
		emp.id=133;
		emp.dept="SDET";
		emp.isPermanent=true;		
		
		System.out.println(emp.name);
		System.out.println(emp.designation);
		System.out.println(emp.id);
		System.out.println(emp.dept);
		System.out.println(emp.isPermanent);
		
		System.out.println("======");

		// Object without reference	- we cannot access the object because there is no reference 
		new Employee().name="Peter"; // This is Anti pattern
		// Create Object with reference is recommended 
		
		Employee e2= new Employee();
		e2=null;
		
//		e2.name="Abhi"; // NullPointerException and this is called Anti patterns.
//		System.out.println(e2.name);
		
		
		Employee e3= new Employee();
		
		e3=null;
		
		e3=new Employee(); // After null the new Object is created so the e3 is referring to newly created Object
		
		e3.name="Senthil";
		System.out.println(e3.name);
		System.gc(); // Calling the GarbageCollector programmatically.
		// only role of GC is to clear no reference object in HEAP
		
		// Configure Heap in eclipse
		//-xmx = 1000
		//-xms = 500
		
		
		
		
		
		
		
		
		
		
		
	}

}
