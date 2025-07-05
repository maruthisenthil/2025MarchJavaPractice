package oop_interface;

public interface USMedical extends WHO, UN{
	
	// Interface methods cannot have any method body - this is called Abstract Method
	// only method declaration - method prototype
	// no business logic in interface methods 
	// can not create the object of Interface
	// Interface cannot have parent class - Interface can only have parent interface
	// Abstract method - no method body is called abstraction 
	// ABstraction is called hiding the implementation
	
	// interface variables are: by default static & final.
	// [naming convention for final variable is CapitalLetter with '_']
	int MIN_FEE=10;
	
	
	// Interfaces methods are 100% abstraction before 1.7 but after Java 1.8 it is not..
	// if no requirement avoid 1.8 features 
	
	
//	In interface all the methods are abstract in nature
	public void physioServices(); //
	public void oncologyServices();
	public void dentalServices();
	public void emergencyServices();


	// After JDK 1.8 two major changes: 
	// 1. we can have a static method with body: this is not abstract method
	// but non-static method in interface cannot have method body
	// Static method will be called using the interface name.
	// static cannot be called by Child class Object:
	// interface can have static method with method body.
	// we can have n number of static methods
	// static method cannot be overridden
	public static void printBilling() {
		System.out.println("USMedical Building");
	}
	
	//2. we can have a default method with method body (business logic) Non-static 
	// default keyword - only for interface 
	// can be overridden -- using public keyword in the child class
	// default can be overloaded with public methods
	default void medicalRecords() {
		System.out.println(" US -- Medical Records ");
	}
	
	// default overridden
	default void medicalRecords(int a ) {
		System.out.println(" US -- Medical Records -- Overloaded with integer value as a parameter : "+10);
	}
	
}
