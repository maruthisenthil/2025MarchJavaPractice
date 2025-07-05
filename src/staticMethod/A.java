package staticMethod;

public class A {

	public static void main(String[] args) {
		System.out.println("A - Main method");
		
		String browser[]= {"chrome","firefox","safari"};
		String os[]= {"win","mac","linux"};
		
		B.main(browser);
		B.main(browser, os);
	}

}
