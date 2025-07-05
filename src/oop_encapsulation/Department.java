package oop_encapsulation;

public class Department {

	public static void main(String[] args) {
		
//		Employee e2 = new Employee();
//		e2.setName("Senthil");
//		e2.setAge(10);
//		e2.setSalary(34.45);
//		e2.setActive(true);
//		
//		System.out.println(e2.getName()+" - "+e2.getAge()+" - "+e2.getSalary()+" - "+e2.isActive());
		
		// POST call - Initial values
		Employee e1 = new Employee("Senthil", 30, 34.34, true);
		
		// GET - Read 
		System.out.println(e1.getName()+" - "+e1.getAge()+" - "+e1.getSalary()+" - "+e1.isActive());
		
		// PUT/ PATCH -- Update
		e1.setAge(32);
		e1.setSalary(36);
		
		// GET - Read
		System.out.println(e1.getName()+" - "+e1.getAge()+" - "+e1.getSalary()+" - "+e1.isActive());
	}

}