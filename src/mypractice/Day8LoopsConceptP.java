package mypractice;

import java.util.Iterator;

public class Day8LoopsConceptP {

	public static void main(String[] args) {
		// Loops 
		// 1. while
		int i =1;
		while(i<=10) {
//			System.out.println(i); // when only this statement it will cause infinite loop
			System.out.println(i); 
//			i++;
//			++i;
			i=i+1;
		}
		
		System.out.println("\n"+i);
//		Infinite loop
		// when you write code after infinite loop then that code segment is called unreachable code

//		while(true){
//			System.out.println("Welcome to SBR & Sons: ");
//			
//		}
		
//		// to over come that we need to introduce BREAK with in the while loop		
//		System.out.println("Welcome to SBR & Sons: ");
		
		while(true){
			System.out.println("Welcome to SBR & Sons: ");
			break;
		}
		
		System.out.println("----------------------");
		
		int t=1;
		while (t<=10) {
			System.out.println(t);
			
			 if(t == 5) {
				 System.out.println("Hello ");
				 break; // break only breaks the loop.
			 }
			
		}
		
		System.out.println("----------------------");
		

		// 2. for loop
		// 1 to 10
		for (int j = 0; j <=10; j++) {
			System.out.println(j);
		}
		
		int j1=1;
		for(;j1<=10;j1++) {
			System.out.println(j1);
		}
		
//		// Infinity loop
//		for(;;) {
//			System.out.println("Its me Infinity ");
//		}
		
		// use cases for while loop
		// when number of iterations are not fixed 
		// infinite scrolling [example how many scroll we need to do for checking Naveen's post
		// web table with pagination
		// wait for element on the page: 0 5 10 20 50.
		// wait for the page loading 2 5 8 10.
		// search results from shopping cart size. 
		
		// use cases for for loop
		// when no.of iterations is fixed
		// with array, arraylist
		// month drop/ day drop
		// menu sub menu handing
		// no.of footers 
		
		// homework - print Capital A to Capital Z
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
