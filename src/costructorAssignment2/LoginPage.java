package costructorAssignment2;

public class LoginPage extends Page{
		
	public LoginPage() {
		System.out.println("LoginPage -- default const.. ");
	}
	
	public LoginPage(int a) {
		System.out.println("LoginPage -- 1 param const.. "+a);
	}
	
	public LoginPage(int a, int b ) {
		System.out.println("   LoginPage -- 2 param Const.. "+ (a+b));
	}

	public void title() {
		System.out.println(" Page -- title");
	}

	public void url() {
		System.out.println(" Page -- URL");
	}
	
	public void defaultLoadingTime() {
		System.out.println(" Page loading time 5 secs");
	}

	
	
}
