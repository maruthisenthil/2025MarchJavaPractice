package staticMethod;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("This is my main method");
		
		MainMethodOverloading.main(10);
	}
	
	public static void main(int[] a) {
		System.out.println("main "+a);
	}
	
	public static void main(int a) {
		System.out.println("main method "+a);
	}
	
	public static void main(int a, int b) {
		System.out.println("main method "+ a+b);
	}
	
	public static void main(int a, String b) {
		System.out.println("main method "+ a+b);
	}
}
