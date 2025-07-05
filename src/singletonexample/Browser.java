package singletonexample;

public class Browser {
	
//	Singleton : Only one object will be created and not more than once
//	Objective is to create object ONLY ONCE
	
//	Steps:

//	1. Private static instance of the class
	private volatile static Browser browser; // Default is null
// The volatile keyword in Java ensures that a variable's value is always read from and written to main memory, 
//	rather than the thread's local cache.This guarantees visibility of changes across multiple threads. 

//	When a variable is declared volatile, any modifications made by one thread are immediately 
//	visible to other threads. This prevents inconsistencies
//	and data races that can occur when multiple threads access the same variable concurrently.
	
//	2. private constructor to prevent/avoid instantiation/object
	private Browser() {}
//  3. public static method to provide access to the instance/Object
	public static Browser getInstance() { 
		if(browser == null) {
			synchronized (Browser.class) { // synchronized for thread safe
				if(browser == null) {
					browser=new Browser();
				}
			}
		}
		
		return browser;
	}
	
//	4. Individual public method of the class
	public void dispMsg() {
		System.out.println("Browser Info");
	}
}
