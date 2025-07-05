package mypractice;

public class Day3IncrDecrInterviewQuestions {

	public static void main(String[] args) {
		
		// Interview Questions on ++ & --
//			System.out.println("Interview Questions on ++ & --");
//			System.out.println("INTQ-1");
//			int i = 11;
//			int j = i++ + ++i;
//			System.out.println(j); // 24
			
//			System.out.println("INTQ-2");
//			int a = 11, b = 22, c=0;
//			c = a + b + a++ + b++ + ++a + ++b;
//			System.out.println("a = "+a); // 13 
//			System.out.println("b = "+b); // 24
//			System.out.println("c = "+c); // 103
//			
//			System.out.println("INTQ-3");
//			int i = 0;
//			int j = i++ - --i + ++i - i--;
//			System.out.println("i = "+i); // 0 
//			System.out.println("j = "+j); // 0
			
//			System.out.println("INTQ-4");
//			boolean bb = true;
//			bb++; 						// Cannot convert from boolean to int
//			System.out.println(b);
			
//			System.out.println("INTQ-5");			
//			int i=1, j=2, k=3;
//			int m = i-- - j-- - k--;
//			System.out.println("i="+i); // 0 
//			System.out.println("j="+j); // 1 
//			System.out.println("k="+k); // 2
//			System.out.println("m="+m); // -4
			
//			System.out.println("INTQ-6");
//			int a=1; 
//			int b=2; 
//			System.out.println("a = "+a); // 1
//			System.out.println("b = "+b); // 2
//			System.out.println(--b - ++a + ++b - --a); // 0
			
//			System.out.println("INTQ-7");
//			int i=19, j=29, k=9;
//			int m = i-- - j-- - k--;
//			System.out.println("i="+i); //18
//			System.out.println("j="+j); //28
//			System.out.println("k="+k); //8
//			System.out.println("m="+m); //-19
		
//			System.out.println("INTQ-8");
//			 int i = 11;
//			 int j = --(i++); // invalid operator usage - Compiler error  
			
//			System.out.println("INTQ-9");
//			int m = 0, n = 0;
//			int p = --m * --n * n-- * m--;
//			System.out.println("m="+m); // -2
//			System.out.println("n="+n); // -2
//			System.out.println("p="+p); // 1
		
		
//			System.out.println("INTQ-10");
//			int a =5;
//			int b;
//			b= a++ + ++a * --a - a--;
//			System.out.println("a = "+a); // 5
//			System.out.println("b = "+b); // 41
			
//		System.out.println("INTQ-11");
//			int a = 10++; // Variables cannot be increment or decrement during  
//		System.out.println("INTQ-12");
//		int ch = 'A';//65
//		System.out.println(ch++);//65 
//		System.out.println(ch); // 66

//		System.out.println("INTQ-13");
		char ch='a';
		System.out.println(++ch); // b
			
//		System.out.println("INTQ-14");
		double d = 1.6, D=3.8;
		System.out.println(d++ + ++D); // 6.4
		System.out.println("d="+d); 	// 2.6
		System.out.println("D="+D); 	// 3.8
		
		int v = 10;
		int b= - (++v);
		System.out.println("v="+v);
		System.out.println("b="+b);
		
		
		
	}

}
