package methodCalling;

public class Person {
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
//		t1();
	}

	
	public static void main(String[] args) {
		System.out.println("main - method");
		t1();
		

	}

}
