package StringConcept;

public class StringReverse {

	
	public static String reverseString(String input) {
		
		int strLength = 0;
		// null check 
		try {
			strLength = input.length();
		}catch(NullPointerException npe) {
			return input;
		}
	
		// len is 0.zero or 1.One checks
		if(strLength==0 || strLength == 1) {
			return input;
		}
		
		StringBuilder revStr = new StringBuilder();		
		for(int i=strLength-1; i>=0; i--) {
			revStr=revStr.append(input.charAt(i));
		}
		return String.valueOf(revStr);
	}
	public static void main(String[] args) {
		
		
		String s1 = reverseString("Selenium"); // Complexity - O(n) - worst case
		System.out.println("Reversed String : "+s1);
		
		s1 = reverseString("testing");
		System.out.println("Reversed String : "+s1);
		
		s1 = reverseString("S"); // Complexity - O(1)
		System.out.println("Reversed String : "+s1);
		
		s1 = reverseString("1234"); // O(n) - avg case
		System.out.println("Reversed String : "+s1);
		
		s1 = reverseString(""); // Complexity - O(1)
		System.out.println("Reversed String : "+s1);
		
		// Complexity - O(1)
		s1 = reverseString(null); // will through NULL POINTER EXCEPTION : java.lang.NullPointerException
		System.out.println("Reversed String : "+s1);
		
		s1 = reverseString("");
		System.out.println("Reversed String : "+s1);
		
		s1 = reverseString("Selenium1234@#$!@##");
		System.out.println("Reversed String : "+s1);
	}

}
