package opp_abstract;

public class LoginPage extends Page{

	int price = 50;
	
	public LoginPage() {
		System.out.println("   LoginPage -- Const.. ");
	}
	
	public LoginPage(int a ) {
		System.out.println("   LoginPage -- 1 param Const.. "+ a);
	}
	
	public LoginPage(int a, int b ) {
		System.out.println("   LoginPage -- 2 param Const.. "+ (a+b));
	}
	@Override
	public void title() {
		System.out.println("Login Page -- title");
	}

	@Override
	public void url() {
		System.out.println("Login Page -- URL");
	}
	@Override
	public void defaultLoadingTime() {
		System.out.println("Login page loading time 5 secs");
	}
	
//	// parent and child having same static method then it is called Method Hiding 
//	public static void footers() {
//		System.out.println("page -- footers ");
//	}
	
	public void doLogin(String un, String pw) {
		System.out.println("Enter the username "+un);
		System.out.println("Enter the password "+pw);
		System.out.println("click on the login button");
		System.out.println("UserLogin successfully");
	}
	
	
}