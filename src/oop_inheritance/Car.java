package oop_inheritance;
// Final: 
// Final Variable - to provide constant values : 
// Final method to avoid method overriding but can be inherited 

// Final class -- can not be the a parent class: it is preventing inheritance:  
public class Car extends Vehicle{
		
	final int speed=100;

	public void start() {
		System.out.println("Car -- Level 2 -- Start ");
	}
	
	public void stop() {
		System.out.println("Car -- Level 2 -- Stop");
	}
	
	public void refule() {
		System.out.println("Car -- Level 2 -- refuel");
	}
	
	@Override
	public void engine() {
		System.out.println("Car -- Level 2 -- Engine ");
	}
	
	// Final method cannot be overridden but can be inherited: prevent method overriding 
	public final void restart() {
		System.out.println(" Car - Level 2 - restart[final]");
	}
	
	// static method:  can not be overridden instead method hiding 
	// static method can be overloaded but cannot be overridden 
	public static void billing() {
		System.out.println("Car -- Billing ");
	}
	
	// private method: can not be override 
	// scope of the private is with in the class.. inheritance is not possible. 
	// private properties cannot be inherited by the child class
	private void locking() {
		System.out.println("Car - locking ");
		
	}
	
	public void carLocking() { // Encapsualtion: 
		locking();
	}

	
	// Private, static and final cannot be override in inheritance. 
}
