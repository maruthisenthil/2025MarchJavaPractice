package mypractice;

public class Day8LoopsConcept {

	public static void main(String[] args) {

		// 3 Important Loops
		// While Loop:
		// For Loop:
		// Do-While:
		
//		1. while
		
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
//			i++; //all the increments are same
//			++i;
			i = i + 1;
		}
//Break to come out of the loop and break the entire loop
		while (true) {
			System.out.println("Welcome to Java");
			break;
//			System.out.println("ji");this also unreachable code becoz we use print statement after the break statement
		}
// Unrachable code when we write the statements after infinite loop and if we supply break inside the loop
		System.out.println("Hello");
		System.out.println("------------------------");
//	break inside if which is inside while---Loop
//  break here break the loop and not the if Condition
		int t = 1;
		while (t <= 10) {
			System.out.println(t);
			if (t == 5) {
				System.out.println("Hello Java");
				break;
			}
			t++;
//			 break;  //=> 1 will be printed due to this loop and the loop is broken here
		}
		System.out.println("t value after while-loop "+t);
		System.out.println("------------------------");
		
		int r = 1;
		while(r<=20) {
			System.out.println(r);
			if(r%5==0) {
				System.out.println("Hello");
			}
			r++;
		}
		System.out.println("------------------------");
		int num=1;
		while(num<=10) {
			if(num%2==0) {
				System.out.println(num+" is even number ");
			}else {
				System.out.println(num+" is odd number ");
			}
			num++;
		}
		
		System.out.println("------Byte:while_loop------------------");
		
		byte total=1;
		while(total<6) {
			System.out.println("byte value : "+ total);
			total++;
		}
		
		System.out.println("------Long:while_loop-------------------");
		
		long l = 100;
		while(l<=110) {
			System.out.println(l);
			l++;
		}
		
		System.out.println("----------Double: while_loop--------------");
		double dd=1.1;
		while(dd<=5.5) {
			System.out.println(dd);
			dd++;
		}
		System.out.println("-------Char: while_loop-----------------");
		char ch='a';
		while(ch<='z') {
			System.out.println(ch+"="+(int)ch);
			ch++;
		}
		
		System.out.println("------------2.for_loop--------------");
		
//		2. for loop 
		// int k = 1 and it will initialize once and execute only once.
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
		
		System.out.println("------------------------");
		int a = 1;
		for (; a <= 10;) {
			System.out.println(a);
			a++;	
		}
		
//		System.out.println("------Infiniteloop------------------");
//		for (int j = 1; j <= 10; ) {
//			System.out.println(j);
//		}
		System.out.println("------------------------");
		for(;;) { // by default is true if no condition  and If the condition is false then it is un-rechable code:
			System.out.println("Hello Java");
			break;
		}
		System.out.println("------------------------");
		for (int m = 1; m<=10; m++) {
			if(m%2==0) {
				System.out.println(m);
			}
		}
		System.out.println("---------Print Alphabets---------------");
		
		
		for (char ch1='A';ch1<='Z'-1;ch1++) {
			System.out.println(ch1+"="+(int)ch1);
		}
		
		System.out.println("-----------String use cases not posible and not needed for FOR... - Loop-------------");
//		for(String browser="chrome";browser.equals("chrome");) {
//			System.out.println("Launch Chrome");
//		}
		
		System.out.println("------------------------");
		// 10 to 1
		for(int m=10;m>=1;m--) {
			System.out.println(m);
		}
		System.out.println("-----while - reverse 10 to 1--------");
		int e=10;
		while(e>=-10) {
			System.out.println(e);
			e--;
		}
		
		System.out.println("------do_while -- Loop ------------------");
		
		// 3. do-while loop 
		
		int aa=1;
		do {
			System.out.println(aa);
			aa++;
			if(aa==5) {
				System.out.println("Done!! Bye ");
				break;
			}
		}while(aa<=10);
		
//		System.out.println("------------------------");
		//use cases for while loop
		// un-identified values 
		// Number of iterations are not fixed ex: infinite scrolling or web pages
		// calender: 
		// webtable with pagination [selectors hub]
		// wait for element on the page - ex: Amazon -- wait elements to be loaded 	
					// 5, 10 , 20 , 50 seconds
		// wait for page load - page load time we dont know 
		
		//use cases for for loop
		// when No.of iteration is fixed
		// with Array, ArrayList
		// month dropdown / day drop down. [ex: Bigbox.com categeroy is fixed in the web pages:]
		// Menu with fixed values in the websites
		// number of footers & links in home pages 
		

	}
}
