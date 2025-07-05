package oop_inheritance;

// IS - A Relationship
// BMW [IS-A] Car
public class BMW extends Car{
	
	int speed=200;
	
	// method overriding : poly + morphism : dynamic (Runtime)
	//	when we have a method in the parent class and the same method in the child class
	// 1. with the same name
	// 2. with the same number of parameters
	// 3. with the same type of return is called Polymorphism
	// Use @Override annotation for overridden methods
	
	// same method name in parent and child compiler will decided overridden method will be called 
	// and it is called as Runtime Polymorphism.
	
	@Override
	public void start() {  // overridden method from parent class
		System.out.println("BMW - Level 1 -- Start ");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW - Level 1 -- Engine ");
	}
	
	public void autoParking() { // individual/own method of BMW class
		System.out.println("BMW - Level 1- Auto Parking");
	}	
	
	@Override
	public void wind() {
		System.out.println(" BMW - Level 1  - Wind ");
	}
	
	// Individual method - has a truck class loading 
	// Had - A  relationship - Composition: 
	public void myLoading() {
		System.out.println("BMW loading method ..... ");
		new Truck().loading();
		
	}	
	
	// static method: Individual method  
//	// same parent static method - & - same child static method  --> is called method hiding 
	public static void billing() { 
		System.out.println("BMW -- Billing ");
	}
	
	
//	@Override // The method locking() of type BMW must override or implement a supertype method
	// Private method cannot be overridden. and cannot apply @Override 
//	private void locking() {
//		System.out.println("BMW - locking ");
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}