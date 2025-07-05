package mypractice;

public class Day7ANDORAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Assignment 1: Voter Eligibility
//		Write a program to check if a person is eligible to vote:
//		- The person should be 18 or older.
//		- The person must be a citizen of the country.
//		Use both & and && to show the difference in behavior.
		boolean isCitizen=true;
		int age=17;
		
//		if(age>=18 & isCitizen) {
//			System.out.println("Person is eligible to Vote. '& '");
//		}else {
//			System.out.println("Person is not elibile to Vote. '&'");
//		}
//
//		if(age>=18 && isCitizen) {
//			System.out.println("Person is eligible to Vote. '&&'");
//		}else {
//			System.out.println("Person is not elibile to Vote. '&&'");
//		}
		
		System.out.println("----------------------------------------");
//		Assignment 2: Login Check
//		Assume two boolean values:
		boolean isUsernameCorrect = true;
		boolean isPasswordCorrect = false;
//		Use:
//		- & and && to print whether login is successful or not.
//		- | and || to explore the behavior when one of the credentials is correct.
		
		if(isUsernameCorrect | isPasswordCorrect) {
			System.out.println("Crednetials are partially correct '|' ");
		}else {
			System.out.println("Entire cretentials are wrong '|' ");
		}
		if(isUsernameCorrect || isPasswordCorrect) {
			System.out.println("Crednetials are partially correct '||' ");
		}else {
			System.out.println("Entire cretentials are wrong '||' ");
		}
		
		if(isUsernameCorrect & isPasswordCorrect) {
			System.out.println("User logged in successfully '&' ");
		}else {
			System.out.println("User log-in un-successfully '&' ");
		}
		if(isUsernameCorrect && isPasswordCorrect) {
			System.out.println("User logged in successfully '&&' ");
		}else {
			System.out.println("User log-in un-successfully '&&' ");
		}
		
		System.out.println("----------------------------------------");
//		Assignment 3: Discount Eligibility - Use || and | to check discount eligibility.
//		A user is eligible for a discount if:
//		- Their total purchase amount is above 1000
//		- OR they are a premium member
		int purchaseAmount=900;
		boolean isPremierMember = true;
		if(isPremierMember || purchaseAmount>=1000) {
			System.out.println("Eligible for discount '||' ");
		}else {
			System.out.println("Not Eligible for discount '||' ");
		}
		
		if(isPremierMember | purchaseAmount>=1000) {
			System.out.println("Eligible for discount '|' ");
		}else {
			System.out.println("Not Eligible for discount '|' ");
		}
		
		System.out.println("----------------------------------------");
//		Assignment 4: Find the Greatest of Four Numbers
//		Write a program to find the greatest of four numbers using logical && and if-else.
		int a=100; int b=750; int c=50; int d=25;
		if(a>b && a>c && a>d) {
			System.out.println("A is greatest");
		}else if (b>c && b>d) {
			System.out.println("B is greatest");
		}else if (c>d) {
			System.out.println("C is greatest");
		}else {
			System.out.println("D is greatest");
		}

//		Assignment 5: Short-Circuit Behavior
//		Create a method printMessage() that prints a message and returns true. Use this method
//		in:
//		if (x > 5 || printMessage())
//		Then change to:
//		if (x > 5 | printMessage())
//		Observe the output difference.
		System.out.println("----------------------------------------");
		int x=3;
		
		
		if (x > 5 || printMessage()) {
			System.out.println("Any one is true '||' ");
		}else {
			System.out.println("Both are false '||' ");
		}
		
		if (x > 5 | printMessage()) {
			System.out.println("Any one is true '|' ");
		}else {
			System.out.println("Both are false '|' ");
		}
		
//		Assignment 6: Access Control
//		A user can access a secure area if:
//		- They are an admin
//		- OR (they are a user AND their access level is above 5)
//		Write boolean logic using isAdmin, isUser, accessLevel.
		System.out.println("----------------------------------------");
		
		boolean isAdmin= false;
		boolean isUser = true;
		int accessLevel = 6;
		
		if(isAdmin || (isUser && accessLevel>5)) {
			System.out.println("Secure area access granted");
		}else {
			System.out.println("Access granted restricted");
		}

	}
	public static boolean printMessage(){
		System.out.println("hi ");
		return true;
	}

}
