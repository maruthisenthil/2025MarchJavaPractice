package mypractice;

public class Day3MathOperators {

	public static void main(String[] args) {
//	
		System.out.println(10/2); // 5
		System.out.println(9/2);  // 4
		
		System.out.println(9.0/2); // 4.5
		
		System.out.println(9/2.0); // 4.5
		
		System.out.println(9.0/2.0); // 4.5
		
//		System.out.println(9/0); // Divide by 0 - ArithmeticException 
//		System.out.println(0/0);  // 0 Divide by 0 - AE 
//		0 divide by any number will give zero
		System.out.println(0/9);  // 0
		
		System.out.println(9.0f/2);  // 4.5 
		// Infinity - any one float or int divide by zero or float will give infinity
		System.out.println(9.1/0); // Infinity 
		
		System.out.println(9/0.0); // Infinity
		
		System.out.println(9/0.0f); // Infinity
		
		System.out.println(9.2f/0); // Infinity 
		
		System.out.println(9.2d/0); // Infinity
		System.out.println(9.2/0.0); // Infinity
		
		// NaN 	-- Predefined in Java	- will not occupy any number 
		System.out.println(0.0/0); // NaN - not a number
		System.out.println(0/0.0); // NaN - not a number 
		System.out.println(0.0/0.0); // NaN - not a number
		System.out.println(0.0f/0.0f); // NaN - not a number
		
		//		% - Modulus Remainder operator
		System.out.println(9%2);  // 1
		System.out.println(8%2);  // 0 
		System.out.println(27%4); // 3

//		System.out.println((byte) 10/0); // AE 
//		System.out.println( 10l/0); // AE
		
		
		
		

	}

}
