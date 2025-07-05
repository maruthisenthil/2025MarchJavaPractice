package ExceptionHandling;

public class Calculator {

	public static void div(int a, int b) {
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			// handling or reporting of the error/exception:
			// reporting of issue, error, message, logs, screenshot
			System.out.println("B is zero hence AE is on your way.... please pass the non sero value for b.. ");
//			ae.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
//		div(10,2);
		div(10,0);
		System.out.println("Bye !! ");
	}

}
