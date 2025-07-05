package mypractice;

public class Day2DataTypeConcept {

	public static void main(String[] args) {

		
		//Java - DataTypes : Java follow Strict data type rule;
	
		// 1. Primitive data types : memory size is fixed
		// 2. Non-Primitive data types: Object, class, interface, array, collections.
		
		//Primitive data types -	Numeric Type:
			// 1. Integral value: 
				// 1.a: Integer: byte, short, int, long
				// 1.b: Floating-type: float, double
		
			//2. Character Type: char
	
		//Boolean: 
			// boolean: true/false
		
		// 1.byte:
		// size: 1 byte = 8 bits
		// Range: -128 to 127
		// Use case: Age, total number of months, no.of weeks, days of a month. 
		
		byte b =10;
		b=20;
		System.out.println(b);
		byte b1= 50;
		System.out.println(b1);
		
		byte b3 = 0;
		byte b4 = -100;
		byte age= 101;
		System.out.println("age: "+age);
//		byte b5 = -129;  // out of range:
//		byte b6 = 128; // out of range:
		
		//2. short: size: 2 bytes = 2 x 8 = 16 bits : - 2^15 to 2^15-1
		// range: -32768 to 32767
		short sh=1000;
		short totalBill = 4500;
		System.out.println("Short : totalBill= "+totalBill);
		System.out.println("----------------");
		// 3. int: 
		// size: 4 bytes = 4x8 = 32 bits
		// range: -2147483648 to 2147483647 : - 2^31 to 2^31-1
		// int i =12345678901; // out of range
		// use case: salary
		int i =1234567890;
		int salary = 2700000;
		System.out.println(salary);
		System.out.println("----------------");
		//4. long:
		// size: 8 bytes = 8x8 = 64 bits
		// range: -2^63 to 2^63-1
		// total no.of world population 
		long long1= 1234567890123456789l; // 19 digits
		long mobileNumber= 1234567890; 
		System.out.println("long value: long1 = "+long1); // 1234567890123456789
		System.out.println("----------------");
		// Never declare the CC_No, SSN No, AccountNumber, Adhar , PAN and mobile because we are not going to use it for any kind of calculations
		// it should be declare those values as string data because we are not using it for any arthmetic operations
		
		// 5. Float:
		// size: 4 byte : 4 x 8 = 32 bits
		// range: after dot(.) can take up 6 to 7 digits 
		// use case - salary, BMI, product price, bill amount, weight
		float f1 = 23.34f;
		System.out.println("floaf- f1= " + f1);
		float sal = 35.55F;
		System.out.println("packgae: sal= "+sal);
		float rangeCheck = 99.123456789f;
		System.out.println(rangeCheck);
		System.out.println("----------------");
		
		
		// 6 Double: 
		// size: 8 byte : 8x8 = 64 bits 
		// range: after the dot(.) can take upto 15 decimal digits
		double doubleRangeCheck = 99.123456789012345678901234567890; // 30 digits
		double testDouble = 12.33; // Bad practice because it will  consume 8 bytes for two digit decimal value best practice is to declare two digit
		System.out.println("double rangeCheck : doublerangeCheck : "+ doubleRangeCheck);
		System.out.println("----------------");
		// BigInteger and BigDecimal - more range of values 
		
		// char : single digit value
		// size: 2 byte - 2x8 = 16 bits - 
		// range : a-z, A-Z, 0-9
		// use case - Gender - execution status
		char ch = 'a';
		char ct = '1';
		char cf = '$';
		char status = 'Y';
//		char ff = 'sd'; // invalid character constant because only single character 
		
		System.out.println("Character value: ch - "+ch);
		System.out.println(ct);
		System.out.println("exe status : "+status);
		
		
		System.out.println("----------------");
		
		// Boolean - Boolean family 
		// size ~1 bit 
		// range: true/ false
		boolean booleanValue= true;
		System.out.println("Boolean Value : "+booleanValue);
		
		
		System.out.println(12); // int = 4 bytes
		System.out.println((byte)12); // 1 byte
		System.out.println(12.33); // double = 8 bytes
		System.out.println(12.33f); // float = 4 bytes
			
	}
}
