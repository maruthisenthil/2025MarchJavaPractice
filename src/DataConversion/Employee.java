package DataConversion;

public class Employee {

	public static void main(String[] args) {
		
		String x = "100";
		
		System.out.println(x+20); // 10020

		//String to int:
		int i = Integer.parseInt(x);
		System.out.println(i+20); // 120
		
		String y="200A";
//		int j = Integer.parseInt(y); // Error: java.lang.NumberFormatException
		int j = Integer.parseInt(y.replace("A", ""));
		System.out.println(j+199);
		
		y = "200#1";
		System.out.println(Integer.parseInt(y.replace("#", ""))+100);
		
		
		// String to Double :
		
		String price ="109.99";
		System.out.println(price+20);
		
		double pr = Double.parseDouble(price);
		System.out.println(pr+10.11);
		
		// From SElenium to Web Application only understand String 
		
		// int to String
		
		int finalAmt = 1000;
		String valueOfInt =String.valueOf(finalAmt);
		System.out.println(valueOfInt);
		System.out.println(valueOfInt+10); // 100010 - to confirm we are concatenating
		
		//double to String
		
		double test = 12.33;
		String tr = String.valueOf(test);
		System.out.println(tr+20);
		
		
		// String to boolean
		String remote = "true";
		
		if(Boolean.parseBoolean(remote)) {
			System.out.println("run test cases");
		}else {
			System.out.println("ignore test cases");
		}
		
		// Boolean to String 
		boolean flag = true;
		String flagString = String.valueOf(flag);
		System.out.println(flagString+20);
		System.out.println(flagString.length()+"--"+flagString);
		
		
		// Anything to String use String.valueOf(<data type>)
		
		// Primitive data type: byte short int long double float boolean char
		// Integer, Double, Float, Byte, Short, Boolean ---> Wrapper class
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.BYTES); // 8
		System.out.println(Integer.BYTES); // 4		
		
		
//		//String to int:
//		int i = Integer.parseInt(x);
//		System.out.println(i+20); // 120
//		
//		String y = "200$";
////		int j = Integer.parseInt(y);//  java.lang.NumberFormatException
//		
//		int j = Integer.parseInt(y.replace("$", ""));
//		System.out.println(j+20); 
//		
//		// String to Double 
//		String price = "12.33";
//		System.out.println(price+ 20 );// 32.33
//		double pr = Double.parseDouble(price);
//		System.out.println(pr+ 20 );// 32.33
//		
//		// int to String
//		int finalAmount = 1000;
//		String amt = String.valueOf(finalAmount);
//		System.out.println(amt+2200);
	}

}
