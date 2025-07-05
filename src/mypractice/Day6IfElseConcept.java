package mypractice;

public class Day6IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println(a<b);
		
		if(a>b) { // condition is depends on the a and b variables - value can change at anytime
			System.out.println("hey");
		}else {
			System.out.println("Helo");
		}
		
		// Directly writing the value is not a good practice.
		// No Dependency on any variable - 
		// else part is dead code because the true value is decided already and not dependent on any value
		if(true) { 
			System.out.println("True always");
		}else {
			System.out.println("Never be false");
		}
		
		boolean flag=true;
		if(flag) {
			System.out.println("True always- Java ");
		}else {
			System.out.println("Never be false - as default");
		}
		
		//if block is dead code
		if(false) {
			System.out.println("Go");
		}else{
			System.out.println("Always Java");
		}
		// dead code -  shows the value is false by default 
		if(100>20) // condition is defined directly with value - 
		{
			System.out.println("Condition true");
		}else {
			System.out.println("Condition false");
		}
		
		boolean flagq= false;
		
		if(flagq) {
			System.out.println("Cypress");
		} else {
			System.out.println("Bye !!! ");
		}
		
		System.out.println("------------------");
		// nested if:
		int num = 85; // Condition is dependent on Varaible num variable so no dead code. 
		if(num>=90) {
			System.out.println("Grade A");
			if(num>=95) {
				System.out.println("Eligible for scolership");
					if(num == 100) {
						System.out.println("Grade A++");
					}
			}
		}
		else {
			System.out.println("Not eligible for scolorship");
			if(num<=80) {
				System.out.println("grade B");
				if(num<=60) {
					System.out.println("Grade c");
					if(num<=30) {
						System.out.println("FAIL !!");
					}
				}
			}else {
				System.out.println("you are eligible for the scolorship with 50%");
			}
		}
		System.out.println("------------------");
		
		int x= 10;
		int y =20;
		System.out.println(x==y); // Primitives can only be compared with '=='
		
		
		// Below is not the right way
		
		String browser = "chrome";
		
//		if(browser.equals("chrome")) { // true
//			System.out.println("Launch Chrome Browser");
////			break; //break cannot be used outside of a loop or a switch
//		}
//		if(browser.equals("firefox")) { //F
//			System.out.println("Launch Firefox Browser");
//		}
//		if(browser.equals("safari")) { //F
//			System.out.println("Launch safari Browser");
//		}
//		if(browser.equals("edge")) { // F
//			System.out.println("Launch edge Browser");
//		}else {
//			System.out.println("Plz pass the right browser... ");
//		}
// break; //break cannot be used outside of a loop or a switch
		System.out.println("----------------------");
		
		browser = "edge";
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome Browser");
		}
		else if(browser.equals("firefox")) {
			System.out.println("Launch Firefox Browser");
		}
		else if(browser.equals("edge")) {
			System.out.println("Launch Edge Browser");
		}
		else if(browser.equals("safari")) {
			System.out.println("Launch Safari Browser");
		}else {
			System.out.println("Plz pass the right browser... ");
		}
		
	
	}

}
