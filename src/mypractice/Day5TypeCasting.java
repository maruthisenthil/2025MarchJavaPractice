package mypractice;

public class Day5TypeCasting {

	public static void main(String[] args) {
		
		// Primitive type casting
		
		// Byte - -128 to 127
		byte b1 = 10;
		byte b2 = 20;
		// when there is arthimetic operations for even byte may get more values
		// so Java decides to store only to integer
//		byte b3 = b1+b2;
		int b3 = b1+b2;
		System.out.println(b3);
		
		// Short : -32768 to 32767
		short s1 = 2000;
		short s2 = 3000;
		// Same like byte scenarios - only we can store in integer becoz what id the value goes beyond the ranges
//		short s3 = s1 + s2; 
		int s3= s1 + s2;
		System.out.println(s3);
		
		byte t = 10;
		int s = t; // type casting 
		System.out.println(s);

		
//		Two Types of Type casting 
		
//		1. Widening [implicit type casting]
//		 -----> ---->
//		byte --> short --> int --> long --> float --> long
		 
//		2. Narrowing [Explicit type casting]
//		 < --------- <--------
//		byte <-- short <-- int <-- long <-- float <-- long
		
		int i = t;
		int p = 20;
		byte m = (byte) p;
		System.out.println(m); // printing the type casted value p
		p = 200;
		m = (byte)p; // 200 --> 200 -256 = - 56
		// -128 to 127 = 256
		System.out.println(m);
		p = 250;
		m = (byte)p; // 200 --> 250 -256 = - 5
		
		short k = 1000;
		byte n = (byte) k; // 256 - 2000 = -744 + 256 + 256 + 256 = -24
		System.out.println(n);
		
		short h =25;
		int j =h;
		System.out.println(j); // no data loss
		
		int a = 400;
		byte d = (byte) a;
		System.out.println(d); // -112
		
		a = 128;
		d = (byte) a; /// 126 - 256 = -128
		System.out.println(d); // we are loosing the data
		
		int total = -210;
		byte bill = (byte) total; // 256 - 210 = 46
		System.out.println(bill );//46
		
		System.out.println("----------------------------");
		//Widening 
		// - 128 - 127
		
		byte price = 100;
		short p1 = price;
		int p2 = price;
		long p3 = price;
		float p4 = price;
		double p5 = price;
		System.out.println(price);
		System.out.println(p1); // 100
		System.out.println(p2); // 100
		System.out.println(p3); // 100
		System.out.println(p4); // 100.0
		System.out.println(p5); // 100.0
		System.out.println("----------------------------");
		
		// Narrowing 
		
		double bmi = 200.33; // 8 bytes 
		float bmf = (float) bmi; 
		System.out.println(bmf); // 200.33 - 4 bytes - no data loss
		
		long bml = (long) bmi;
		System.out.println(bml); // 200 - no data loss
		
		int bmI= (int)bmi;
		System.out.println(bmI); // 200 - no data loss
		
		short bms = (short)bmi;
		System.out.println(bms); // 200
		
		byte bmb = (byte) bmi;
		System.out.println(bmb); // 200 - 256 = -56
		
		System.out.println("----------------------------");

		// Assignment Float to Byte By Naveen - Narrowing  
		
		float ff = 180.12f;
		
		long ffl= (long) ff;
		System.out.println(ffl); // 180
		
		int ffi = (int) ff;
		System.out.println(ffi); // 180
		
		short ffs = (short) ff;
		System.out.println(ffs); // 180
		
		byte ffb = (byte) ff;
		System.out.println(ffb); // 180 - 256 = - 76
		
		System.out.println("----------------------------");
		
		// Widening 
		
		long num = 1200;
		float nf = num;
		System.out.println(nf); // 1200.0
		
		double nd = num;
		System.out.println(nd); // 1200.0
		
		int ni = (int) nf; // Narrowing - 1200.0 -->1200
		System.out.println(ni);
		
		short ns = (short)nf;
		System.out.println(ns); // will fit into short - 1200
		
		byte nb = (byte) nf;
		System.out.println(nb); // 1200 - 256 -256 - 256 - 256 - 256 = -80 
		
		char ch='a'; // 97
		byte cb=(byte) ch;
		System.out.println(cb); // 97

		System.out.println("----------------------------");

		
	// 	byte short char int long float double
		
		// char to short so narrowing
		short cs = (short)ch;
		System.out.println(cs );// 97
		
		
		int ci = ch;
		System.out.println(ci); // 97
		
		long cl = ch;
		System.out.println(cl); // 97
		
		float cf = ch;
		System.out.println(cf); //97.0
		
		double cd = ch;
		System.out.println(cd); // 97.0 - 8 bytes
		
		System.out.println("----------------------------");
// char to byte narrowing
		char th='A'; // 65 
		byte tb=(byte)th;
		
		System.out.println(tb);
		// Long to char so narrowing
		long test =98;
		char ce= (char)test;
		System.out.println(ce); // b
		
		test = 9968899L;
		ce = (char)test;
		System.out.println(cd);
		
		float pr = 99.3f;
		char cp = (char) pr; // 99.3 --> 99
		System.out.println(cp); // c
		
		byte number = 065; // octal number - base of 8 - Rule for octal number - after xzero two digits will 0-7
		// 086 - is not a number
		System.out.println(number); // 53 
		
		// 063 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 0 + 48 + 5 = 53
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
