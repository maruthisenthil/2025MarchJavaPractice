package mypractice;

public class Day7ANDOROperators {

	public static void main(String[] args) {

		// AND: &(normal operator),  &&(short circuit Operator) 
		// OR: | ||
		
		boolean c1= true;
		boolean c2= false;
		boolean c3= false;
		boolean c4= true;
		
		if(c1 & c2 & c3 & c4) { //t & f & f & t => f - it checks for all the condition
			System.out.println("Hii Selenium");
		}else {
			System.out.println("Bye selenium");
		}
		
		System.out.println("-----------------");
		
		if(c1 && c2 && c3 && c4) { //t & f & f & t => f - 
		// here short circuit will happen when the compiler see first false it will execute else
			System.out.println("Hii Java");
		}else {
			System.out.println("Bye Java");
		}
		System.out.println("-----------------");
		
		if(c1 | c2 | c3 | c4) { //t | f | f | t => t  
			//it checks for all the condition if any one is true will goes to if block
			System.out.println("Hii python - Single | OR");
		}else {
			System.out.println("Bye python- Single | OR");
		}
		
		System.out.println("-----------------");
		
		if(c1 || c2 || c3 || c4) { //t || f || f || t =>  ['||' will be fast] 
		// here short circuit will happen when the compiler see first true it will execute true block
			System.out.println("Hii python - Double || ");
		}else {
			System.out.println("Bye python - Double || ");
		}
		
		
		System.out.println("-----------------");

		c1= false;
		c2= true;
		c3= true;
		c4= true;
		
		if(c1 | c2 | c3 | c4) { //t | f | f | t => t  
			//it checks for all the condition if any one is true will goes to if block
			System.out.println("Hii python - Single | OR");
		}else {
			System.out.println("Bye python- Single | OR");
		}
		
		System.out.println("-----------------");
		
		if(c1 || c2 || c3 || c4) { //t || f || f || t =>  ['||' will be fast] 
		// here short circuit will happen when the compiler see first true it will execute true block
			System.out.println("Hii python - Double || ");
		}else {
			System.out.println("Bye python - Double || ");
		}
		
//		System.out.println("-----------------");
//		if(c1 & c2 & c3 & c4) {
//			System.out.println("Hii Selenium");
//		}else {
//			System.out.println("Bye selenium");
//		}
//		
//		System.out.println("-----------------");
//		
//		if(c1 && c2 && c3 && c4) {
//			System.out.println("Hii Java");
//		}else {
//			System.out.println("Bye Java");
//		}
		
		// 3 variables with diff values 
		
		int a=100;
		int b=200;
		int c=300;
		
		if(a>b && a>c) { // f
			System.out.println("a is greatest");
		}
		else if(b>c) { // f
			System.out.println("b is greatest");
		}
		else { // t
			System.out.println("c is greatest");
		}
		
		System.out.println("-------------------");
		
		a=500;
		b=400;
		c=600;
		
		if(a>b && a>c) { // f
			System.out.println("a is greatest");
		}
		else if(b>c) { // f
			System.out.println("b is greatest");
		}
		else { // t
			System.out.println("c is greatest");
		}
		
		
		
	}

}
