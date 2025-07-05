package ExceptionHandling;

public class Testing {
	
	public void m1(){
		System.out.println(" m1 method");
		m2();
	}
	
	public void m2(){
		System.out.println(" m2 method");
		try {
			m3();
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
	}
	
	// throws are throwing the exception to the caller method m2()
	public void m3() throws ArithmeticException{
		System.out.println(" m3 method");
		int i= 9/0; // AE
	}
	
	// user - called method -- execution start from here so no business logic code... 
	// never write exception handling in caller or from main
	public static void main(String[] args) {
		Testing obj = new Testing();
		
		obj.m1();
		
		System.out.println("Bye !!! ");
		
	}

}
