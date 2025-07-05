package staticMethod;

import java.util.Arrays;

public class B {

	public static void main(String[] args) {
		System.out.println("B - Main method");
		System.out.println(Arrays.toString(args));
	}
	
	public static void main(String[] args, String[] args1) {
		System.out.println("B - Main method");
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(args1));
	}

}
