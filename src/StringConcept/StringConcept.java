package StringConcept;

public class StringConcept {

	public static void main(String[] args) {
		
		// string literal
		String st = "selenium";  // String Constant Pool or String Literal Pool [SCP]
		String s2 = "selenium"; // SCP
		
		// new: 
		String s1 = new String("testing");	// 2 objects got created 
		// two things will happen 
		//	1 - in heap, and 
		//	1 - in string constant pool
		
		String s3 ="testing"; // SCP
		String s4 ="testing"; // SCP
		
		System.out.println(s3==s4); // Value comparision value of s3 is compared with value of s4
		
		System.out.println(s3==s1); // false - never compare string with "==="
		// s3 is pointing to scp value "testing" 
		// s1 is pointing to heap object value "testing" 
		// both memory location are different   
		
		System.out.println(s3.equals(s1)); // it will compare the values of s3 and s1 and not the memory location
		// .equals are comparing the value of the variables 
		System.out.println(s3.equals(s4));
		
//		In string comparision if the value in the same memory [either string constant pool/ heap] then it will
//		compare with value 
		
		// Using the string literal is the best way to create Strings because it will 
		// create only one obj in the string constant pool. 
		
		String name = new String("Tom"); // 1 obj in heap - 1 obj in scp
		String n1 = "Tom"; // 0 object
		
		String str1="Playwright";
		String str2="Playwright";
		String str3="Playwright";
		String str4="Playwright";
		
		int i = 10;
		int j = 10;
		int k = 10;
		
	}

}
