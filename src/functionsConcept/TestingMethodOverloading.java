package functionsConcept;

public class TestingMethodOverloading {
	
	// Method overloading: Poly(many) + Morphism (forms): Compile time - Polymorphism 
	// within the same class when you have have multiple methods
	// 1. with the same name
	// 2. with different no.of parameters (no static only final)
	// 3. with different sequence of parameters (if number of params are same)
	// 4. return type does not matter 
	// 5 no limits for overload the method
	public void test() { // 0 param
		System.out.println("test method..");
	}
	
//	public int test() { // 0 param				 // Duplicate
//		System.out.println("test method ...");
//		return 100;
//	}
	
	public void test(int a) { // 1 param
		System.out.println("test method.. "+a);
	}
	
	public void test(String a) { // 1 param
		System.out.println("test method.. "+a);
	}
	
	public void test(int a, int b) { // 2 param
		System.out.println("test method.. "+ a+b);
	}

	public void test(int a, String b) { // 2 param
		System.out.println("test method.. "+ a+b);
	}
	
	public void test(String a, int b) { // 2 param
		System.out.println("test method.. "+ a+b);
	}
	
	// Usecase: 
	// login
	public void login() {
		
	}
	public void login(String un, String pw) {
		
	}
	public void login(String un, String pw, int otp) {
		
	}
	
	public void login(String un, String pw, String socialMedia) {
		
	}
	
	// search:
	
	public void search() {
		
	}
	
	public void search(String name) {
		
	}
	
	public void search(String name, String brand) {
		
	}
	
	public void search(String name, String brand, int price) {
		
	}
	
	// payment: 
	
	public void payment(String upi) {
		
	}
	
	public void payment(String cc, int cvv) {
		
	}
	public void payment(String cc, int cvv, int otp) {
		
	}
	public void payment(String un, String pw, int otp) {
		
	}
	
	// booking uber:
	public void booking(String stPoint, String edPoint) {
		
	}
	
	public void booking(String stPoint, String edPoint, String carType) {
		
	}
	
	public void booking(String stPoint, String edPoint, String carType, int passengers) {
		
	}
	
	// 5 features of Overloading 
	
	// Ticket Booking
	// Food Order
	// Hotel RoomBooking
	
	
	public static void main(String[] args) {
		
		TestingMethodOverloading t = new TestingMethodOverloading();
		t.test();
		t.test(10);
		t.test("Selenium");
		t.test("Playwright", 100);
		
	}

}
