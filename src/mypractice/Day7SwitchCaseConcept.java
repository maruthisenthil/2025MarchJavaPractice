package mypractice;

public class Day7SwitchCaseConcept {

	public static void main(String[] args) {
		
		// About Switch 
			// switch() - // switch - decision maker to check the available value
			// break will break the entire switch block
			// only one default should be there
			// good practice to use break in default
			// if break is commented then it will jump to next case and execute the stmts
			// boolean, Long, double, float types not allowed in switch as value
			// byte, short, int, string, char allowed in switch
		// char allowed
		System.out.println("-----------------------");
		String browser = " Chrome    ";
		
		switch (browser.toLowerCase().trim()) {   
		case "chrome":
			System.out.println("Launch Chrome");
			break; 
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		default:  
			System.out.println("Please pass the right browser");
			break; 
		case "brave":
			System.out.println("Launch Brave");
			break;
		}
		System.out.println("-----------------------");
		// 1 to 7;
		int days=4;
		
		switch (days) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
		break;
		case 3:
			System.out.println("Tuesday");
		break;
		case 4:
			System.out.println("Wednessday");
		break;
		case 5:
			System.out.println("Thursday");
		break;
		case 6:
			System.out.println("Friday");
		break;
		case 7:
			System.out.println("Saturday");
		break;
		default:
			System.out.println("day number range can be between 1 to 7");
			break;
		}
//		Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
//		byte b = 10;
//		short sh=10;
//		long lg = 100; // Long, float & double is not allowed due to high range
//		switch (sh) {
//		case 10:
//			System.out.println("Byte short int is allowed");
//			break;
//		default:
//			break;
//		}
		System.out.println("-----------------------");

		char ch='a';
		String alpha = String.valueOf(ch);
		
		switch (alpha.toLowerCase()) {
		case "a":
			System.out.println(ch+ " is a vowel");
			break;
		case "e":
			System.out.println(ch+ " is a vowel");
			break;
		case "i":
			System.out.println(ch+ " is a vowel");
			break;
		case "o":
			System.out.println(ch+ " is a vowel");
			break;
		case "u":
			System.out.println(ch+ " is a vowel");
			break;
		default:
			System.out.println(ch+ " is a consonent");
			break;
		}
		
		System.out.println("-----------------------");
		char th='b';
		switch (th) {
		case 97:
			System.out.println("implicit type conversion of int to char");
			break;
		case 'b':
			System.out.println("implicit type conversion char to int for ch - "+th);
			break;
		default:
			System.out.println("value not as expected");
			break;
		}
		System.out.println("-------Naveen's assignment----------------");

		int nc=909;
		switch (nc) {
		case 'a':
			System.out.println(nc);
			break;
		case 'b':
			System.out.println("b - "+(char)nc);
			break;
		default:
			System.out.println("Enter valid ASCII value between a to z [97 to 122] "+nc);
			break;
		}
		
		// use cases for switch
		// cross browser logic
		// cross os logic: win/mac/linux
		// multi environments: QA/ Dev/ Stage/ UAT/ Prod
		// user permission : user, admin, seller, partner, vendor, distributor
		// payment methods : UPI, Paypal, Debit/Credit card, Netbanking
		// order type
		// employee dept: Admin,hr, eng, IT
		
	}

}
