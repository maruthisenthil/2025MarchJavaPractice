package mypractice;

public class Day7SwitchAssignments {

	public static void main(String[] args) {
		
//		Assignment 1: Browser Launch
//		Write a switch case to launch a browser. Supported browsers: chrome, firefox, safari, edge, opera. Print a
//		message for unsupported browsers.
		
		String browser=" fIrefoX   ";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
				System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Chrome");
		break;
		case "safari":
			System.out.println("Launch Safari");
		break;
		case "edge":
			System.out.println("Launch Edge");
		break;
		case "opera":
			System.out.println("Launch Opera");
		break;
		
		default:
			System.out.println("Entered browser value is unsupported");
			break;
		}
		System.out.println("----------------------");
//		Assignment 2: Day of the Week
//		Write a switch case program that prints the name of the day when a number from 1 to 7 is given.
		int day = 1;
		switch (day) {
		case 1:
			System.out.println("Today is Sunday ");
			break;
		case 2:
			System.out.println("Today is Sunday ");
			break;
		case 3:
			System.out.println("Today is Tuesday ");
			break;
		case 4:
			System.out.println("Today is Wednessday ");
			break;
		case 5:
			System.out.println("Today is Thrusday ");
			break;
		case 6:
			System.out.println("Today is Friday ");
			break;
		case 7:
			System.out.println("Today is Saturday ");
			break;
		default:
			System.out.println("Enter the valid day range values[ 1 to 7]");
			break;
		}
		System.out.println("----------------------");
		
//		Assignment 3: Vowel or Consonant
//		Write a switch case program to check whether a character is a vowel (a, e, i, o, u) or a consonant.
		char ch='c';
		
		switch (String.valueOf(ch).toLowerCase()) {
		case "a":
			System.out.println(ch+" is a vowel character");
			break;
		case "e":
			System.out.println(ch+" is a vowel character");
			break;
		case "i":
			System.out.println(ch+" is a vowel character");
			break;
		case "o":
			System.out.println(ch+" is a vowel character");
			break;
		case "u":
			System.out.println(ch+" is a vowel character");
			break;	
			
		default:
			System.out.println("entered char - "+ch+"  is a consonat and not a vowel");
			break;
		}
		
		System.out.println("----------------------");
		
//		Assignment 4: User Roles
//		Create a switch case that prints the permissions based on user roles.
		String userRole="Admin";
		
		switch (userRole.toLowerCase().trim()) {
		case "admin":
			System.out.println("Admin user Loggedin");
			break;
		case "user":
			System.out.println("General user Loggedin");
			break;
		case "seller":
			System.out.println("Seller user Loggedin");
			break;
		case "distributor":
			System.out.println("Distributor user Loggedin");
			break;
		default:
			System.out.println("Entered users are not part of the system check and retry again with valid user");
			break;
		}
		System.out.println("----------------------");
//		Assignment 5: OS Selection
//		Write a switch case to detect the Operating System type.
		
		String operatingSystem= "MAC";
		switch (operatingSystem.toLowerCase().trim()) {
		case "mac":
			System.out.println("Operating system MAC is selected");
			break;
		case "windows":
			System.out.println("Operating system Windows is selected");
			break;
		case "linux":
			System.out.println("Operating system Linux is selected");
			break;
		default:
			System.out.println("Select anyone operating system from the given list [1. MAC, 2. Windows, 3. Linux]");
			break;
		}
		System.out.println("----------------------");
//		Assignment 6: Payment Mode
//		Write a switch statement for payment methods.
		String paymentMtd="UPI";
		switch (paymentMtd.toLowerCase().trim()) {
		case "upi":
			System.out.println("UPI payment method selected");
			break;
		case "paypal":
			System.out.println("PayPal payment method selected");
			break;
		case "cc":
			System.out.println("CreditCard payment method selected");
			break;
		case "netbanking":
			System.out.println("Netbanking payment method selected");
			break;
		default:
			System.out.println("Selected payment method is not valid");
			break;
		}
		
		System.out.println("----------------------");
//		Assignment 7: Environment Config
//		Based on the environment passed, print the URL used for testing.
		String env="QA";
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println("Selected QA Environment");
			break;
		case "stage":
			System.out.println("Selected Staging Environment");
			break;
		case "prod":
			System.out.println("Selected Production Environment");
			break;
		case "performance":
			System.out.println("Selected Performance Environment");
			break;
		default:
			System.out.println("Selected environment is not valid");
			break;
		}
		System.out.println("----------------------");
//		Assignment 8: Department Info
//		Pass an employee department name and print a message.
//		IT HR FINANCE, ADMIN
		String dept="ITz";
		switch (dept.toLowerCase().trim()) {
		case "it":
			System.out.println("You are into IT department");
			break;
		case "hr":
			System.out.println("You are into HR department");
			break;
		case "finance":
			System.out.println("You are into Finance department");
			break;
		case "admin":
			System.out.println("You are into Admin department");
			break;
		default:
			System.out.println("Invalid Department entered: ");
			break;
		}
		System.out.println("----------------------");

	}

}
