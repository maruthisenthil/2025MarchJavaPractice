package mypractice;

public class Day3IncrementAndDecrementOperators {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =1 ;
		int b= a++;
		
		//1. post increment: a++ []  --- First assign then increase
		
		System.out.println(a); // 2
		System.out.println(b); // 1 
		
		int m = -99;
		int n = m++ ;
		System.out.println(m);// -98
		System.out.println(n);// -99
		
		int p =10;
		System.out.println(p++); // 10
		System.out.println(p); // 11
		
		//2. pre-increment -- First increase then assign

		int a1=20;
		int b1 = ++a1;  // while assigning itself the value is getting added here
		System.out.println(b1); // 21
		System.out.println(a1); //21
		
		int a2=-90;
		int b2=++a2; 
		System.out.println(a2); // -89
		System.out.println(b2); // -89
		
		int a3=100;
		System.out.println(++a3);   // 101
		System.out.println(a3);		// 101
		
		//3. post decrement: i--  =>  
		
		int a4=100;
		int a5=a4--;
		System.out.println(a4); // 99
		System.out.println(a5); // 100
		
		int a6= -100;
		int a7= a6--;
		System.out.println(a6); // -101
		System.out.println(a7);  // -100
		
		byte aa = 100;
		byte bb= aa--;
		System.out.println(aa); // 99
		System.out.println(bb); // 100
		System.out.println(aa--);//99
		System.out.println(aa); //98
		System.out.println(aa++);// 98
		System.out.println(aa);//99
		
		System.out.println(++aa); // 100
		
		// 4. pre-decrement 
		int bill = 300;
		a=101;
		System.out.println(--bill); //299
		System.out.println(--aa); // 99
		System.out.println("-----------------------------");
		// Interview Questions on ++ & --
		System.out.println("Interview Questions on ++ & --");
		System.out.println("IQ-1");
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);
		
		
		
		
		
		
		

	}

}
