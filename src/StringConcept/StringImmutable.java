package StringConcept;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s = "hello"; // 1 object in SCP 
		
		System.out.println(s+"world");  // SOP will consume the value of s and concatenate and print it
		
		System.out.println(s); // still point to the same string
		System.out.println(s+"Testing");
		System.out.println(s);
		
		String t = "selenium";
		t = t+" Automation"; 
		// creating the object with existing value - "selenium" + "Automation" of 
		// variable t and re-assigning it to t; 
		// existing value selenium is not updated:
		
		System.out.println(t); // selenium Automation
		String p="selenium";
		System.out.println(p);
		
		String a = "testing";
		String b = "testing";
		String c = "testing";
		System.out.println("-------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a==b); // true
		System.out.println(b==c); //true
		a = a + "Automation";
		System.out.println(a); //testing automation
		System.out.println(b); // testing
		System.out.println(c); // testing
		
		System.out.println(a==b); // false 
		System.out.println(b==c); // true
		
		
	}

}
