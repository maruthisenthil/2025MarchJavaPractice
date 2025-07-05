package StringConcept;

import java.util.Arrays;

public class StringMethods {

	String name;
	int age;
	
	
	
	@Override
	public String toString() {
		return "StringMethods [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy";
//		String str = "helli hi howi youid did you find";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0)); //h
		
		System.out.println(str.charAt(9)); //s
//		System.out.println(str.charAt(40)); // y
//		System.out.println(str.charAt(41)); // AIOB
//		System.out.println(str.charAt(-1)); // AIOB
		System.out.println(str.indexOf('h')); // 0
		System.out.println(str.indexOf('y')); // 12
		System.out.println(str.indexOf('i'));  // 1
		
		System.out.println(str.indexOf('i', 2)); // for the first occurrence we got right value 
		
		System.out.println(str.indexOf('i',str.indexOf('i')+1)); // 2nd occurrence of i // 5
		
		System.out.println(str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1 )); // 3rd occurrence of i
		
		System.out.println(str.indexOf('i', str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1)+1));
		// 4th Occurrence of i
		
		System.out.println(str.indexOf("java")); //14
		System.out.println(str.indexOf("TypeScript"));
		
		String msg="welcome admin";
		if (msg.indexOf("admin")==8) { // Check for position of the string 
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		// contains 
		String mg = "I love java programming";
		if(mg.contains("java")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		String url = "https://naveenautomationlabs.com/opencart/index.php?route=product/product&path=18&product_id=47";
		
		if(url.indexOf("https")==0) {
			System.out.println("PASS");
		}
		
		if(url.contains("route=prod")) {
			System.out.println("PASS");
		}
		
		
		// trim - remove space from the corners/ begining&end of the string
		
		String test = "   Senthil re ady for next life God wll you give Good Job";
		
		System.out.println(test.trim());
		
		
		// replace - remove all the spaces in the given string 
		System.out.println("===>>>>>"+test.replace(" ",""));
		String a2 = "!this 2is a3 sample@ data# setup!21";
//					 !this 2is a3 sample@ data# setup!21
		
		String ss1="senthils";
		String ss2 = ss1.replace('s','S');
		String ss3="SenthilS";
		System.out.println(ss3==ss2);
		
		
		String aaa="senthil";
		String bbb="senthil";
		System.out.println(aaa == bbb);
		
		String a1="NaveeN";
		String a3="Naveen";
		System.out.println(a1==a3);
		
		removeSpecialCharactersWithOutReplaceAll(a2);
		
		System.out.println(removeSpecialCharsWithReplaceAll(a2));
		
		String dob ="01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		
		String mg1="I love Java programming"; 
		System.out.println(mg1.replace("Java", "Playwright"));
		
		// lowercase & uppercase 
		String pop="I love Java programing";
		System.out.println(pop.toUpperCase());
		System.out.println(pop.toLowerCase());
		
		//startswith:
		System.out.println(pop.startsWith("I love"));
		System.out.println(pop.endsWith("programing"));
		
		//equals
		String m1 = "hello selenium";
		String m2 = "Hello selenium";
		
		System.out.println(m1.equals(m2)); // true - hard compare 
		System.out.println(m1.equalsIgnoreCase(m2)); // false - soft compare   
		
		// split - for data driven approach we will use split
		String lang = "Java_Python_JavaScript_Ruby";
		
		System.out.println(Arrays.toString(lang.split("_")));
		
		String top = "xXhelloXxXseleniumXxXtestingXXxXautomationX";
		
		String[] t =top.split("xX");
		System.out.println(t[0].length());
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		System.out.println(t[4]);
		
		System.out.println("--------------------");
		String data = "pooja:sharma:bangalore:IBM:SDET:QA";
				
		String[] d = data.split(":");
		for(String e: d) {
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		
		String domain = "pooja.sharma.bangalore.IBM.SDET.QA"; // for dot[.] split wont work and dot have special meaning 
		
		String[] dom = domain.split("\\."); // use "\\" for splitting the .dot
		
		System.out.println(dom[0]);
		
		System.out.println("--------------------");
		
		String tree = "sonali|sharma|bangalore|IBM|SDET|QA";
		
		String[] tr = tree.split("||");
		System.out.println(tr[0]);
		
		System.out.println("--------------------");
		
		String xpath = "//input[@id=\"automation\"]";
		System.out.println(xpath);
		
		String mgg = "I love \"Java\" Programming";
		
		System.out.println(mgg);
		
		String mg2 = "I love 'Java' Programming";
		System.out.println(mg2);
		
		System.out.println("----------substring---------");
		
		// substring 
		String trMsg = "your order id is 12345";
		System.out.println(trMsg.substring(3)); // starts from 3 to end of string
		System.out.println(trMsg.substring(14)); // starting from "is"
		
		System.out.println(trMsg.substring(0,6)); // between 0 to 6 - and 6th index value wont be included
		
		System.out.println(trMsg.substring(trMsg.indexOf("1") , trMsg.length())); // 1234
		String[] ss = trMsg.split("is");
		System.out.println(ss[1].trim()); // 1234
		
		System.out.println("--------------------");
		
		StringMethods sm=new StringMethods();
		sm.name="Senthil";
		sm.age=30;
		
		System.out.println(sm);
		
		String bh="I love java and I can not live without java programming";
		String ar[] = bh.split("java");
		System.out.println(Arrays.toString(ar));
		
		String t2 = "Lets.tr\\\\y.this";
		String[] rr=t2.split("\\.");
		System.out.println(Arrays.toString(rr));
		
//		System.out.println(str.codePointAt(0));
		
//		Tech Mahendra 
//
//		String str1=new String("Hello"); 
//		String str2=new String("Hello"); 
//		
//		String str3="Hello";
//		String str4="Hello";
//		
//		System.out.println(str1==str2); // true
//		System.out.println(str1 == str2);  //true 
//		System.out.println(str3 == str4); // true 
//		System.out.println(str3 == str1);   // true
//		System.out.println(str1.equals(str2)); // true 


	}
	
	public static String removeSpecialCharsWithReplaceAll(String input) {
//		String pr= null;
		
		String cleaned=input.replaceAll("[^a-zA-Z]", " ");
		cleaned = cleaned.replaceAll("\\s+", " ").trim();
		
		return cleaned;
		
	}
	
	
	public static void removeSpecialCharactersWithOutReplaceAll(String input) {
		

        // Keep only letters and spaces
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ') {
                result += c;
            }
        }

        System.out.println("Cleaned String: " + result);
	}

}
