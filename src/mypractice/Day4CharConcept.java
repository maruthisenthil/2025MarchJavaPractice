package mypractice;

public class Day4CharConcept {

	public static void main(String[] args) {
		// ASCII - Defines values for all characters : universal values
		
		// char : single digit value
		// size: 2 byte - 2x8 = 16 bits - 
		// range : a-z, A-Z, 0-9
		// a-z : 97 - 122
		// A-Z : 65 - 90
		// 0-9 : 48 - 57
		
		char ch='a';
		char bh='b';
		char cch='0';
		System.out.println(ch+bh); // 97 + 98 = 195
		System.out.println(ch+1); // 97 + 1 = 98
		System.out.println(ch-bh); // 97 - 98 = -1
		System.out.println(ch/2); // 97/2 = 48
		System.out.println(cch); // 0 
		System.out.println(cch+1); // 49
		System.out.println('a'+'A'); // 97 + 65 = 162
		System.out.println('$'+'a'); // 36  + 97 = 133
		System.out.println(' '+1); // 32 + 1 = 33
		System.out.println("Hello"+"World"+ch+bh);
		System.out.println("Hello"+"World"+(ch+bh));
		
		char gh='g';
		// Perform arithmetic operation on the char gives ascii values
		System.out.println(gh+0); // 103 

		char yh = 'a';
		// Type casting the char to int will print ascii values
		System.out.println((byte)yh);  // 97
//		System.out.println((short)yh); // 2 bytes 
//		System.out.println((int)yh);   // 4 bytes
//		System.out.println((long)yh);  // 8 bytes

		 System.out.println((char)45); // - 
		 System.out.println((char)1986321);
		 System.out.println((int)' ');
		 System.out.println((int)'%');
		 
		 char ah='a';
		 char bbh='b';
		 int a = 100;
		 System.out.println(ah+bbh+100); // 97 + 98 + 100 = 295
		 
		 System.out.println((char)97); //a
		 
		 System.out.println((char)97 + (char)99); // 97 + 99 = 196
		 System.out.println((char)97 +""+ (char)99); // here concatenation - ac
		 System.out.println('a'+'b'); // 195
		 System.out.println('a'+""+'b'); // ab
		 System.out.println((char)0); // NULL but empty space

		 byte k= 'a';
		 System.out.println(k); // 97
		 System.out.println((char)k); //a
		 
		 
		 float f1 = 'a';
		 System.out.println(f1); // 97.0
		 double d1= 'b';
		 System.out.println(d1); // 98.0 
		 
		 
		 
		
		
		
	}
}
