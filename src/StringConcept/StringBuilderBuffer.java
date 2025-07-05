package StringConcept;

public class StringBuilderBuffer {

	public static void main(String[] args) {
//		StringBuilder sb="senthil"; //  cannot convert from String to StringBuilder
//		String Constant Pool not applicable to String Builder
		System.out.println(" ---- StringBuilder ---- ");
		StringBuilder sb =new StringBuilder("Selenium");
		System.out.println(sb+"Automation"); //seleniumAUtomation
//		sb = sb + "Automation"; // cannot string concatenation  [ER:cannot convert from String to StringBuilder]
		
		System.out.println(sb); // Selenium
		sb.append("automation"); // append "automation" with old value "Selenium"
		System.out.println(sb);  // Now automation is appended with old value 
		
		
//		StringBuffer sf = new StringBuffer("playwright");
//		System.out.println(sf);
//		sf = sf+"automation"; // cannot convert from String to StringBuild
//		sf.append("automation");
//		System.out.println(sf);
		System.out.println(" ---- String -- Immutables ---- ");
//		
		String s = "My Automation ";
		s.concat("with selenium ");
		System.out.println(s); // My Automation
		
		s= s.concat(" with Playwright");
		System.out.println(s); // My Automation with Playwright
			
		System.out.println(" ---- StringBuilder ---- ");
		StringBuilder sb1=new StringBuilder("automation ");
		sb1.append("with new selenium");
		System.out.println(sb1);
//		
		System.out.println(" ---- StringBuffer ---- ");
		StringBuffer sf1 = new StringBuffer("Playwright ");
//		sf1 = sf1+"automation"; // cannot convert from String to StringBuilder
		
		sf1.append("Automation");
		System.out.println(sf1);
		
		sf1.append(" with chrome");
		System.out.println(sf1);
		
		
		System.out.println("----");
		
		String sr = new String("restapi"); // 1 obj in heap and 1 obj in SCP
		sr.concat("Automation"); 
		// concatenated and updated only in the object in the heap and not in SCP
		// reason: because it is concatenated using the sr reference. 
		System.out.println();
		
//		StringBuilder  
		
		
		
		
	}

}
