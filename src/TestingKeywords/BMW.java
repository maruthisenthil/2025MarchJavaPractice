package TestingKeywords;

public class BMW extends Car{

	int speed = 200;
	int price = 400;
	
	// Super used to call the parent class constructors from child class
	// Super should be first statement
	//  while using super for access methods and variables No restrictions like constructors
	public BMW() {
		super(); // this super() will call the default constructor from the parent class
		System.out.println("  BMW - default const.. ");
	}
	
	public BMW(int a ) {
		super(a);  // super(a) keyword helps to call parent class parameter constructor
//		super(); // Constructor call must be the first statement in a constructor
		System.out.println("  BMW - 1 param const.. " + 10);
	}
	
	public BMW(int a, int b ) {
		super(100);
		System.out.println("  BMW - 2 param const.. " + (a+b));
	}
	
	public void getFinalSpeed() {
		System.out.println("BMW Speed --> "+ speed);
		int carSpeed = super.speed; // super --> to access parent/ super class variable value : we can use it any where and not like constructor
		System.out.println("Car Speed --> "+ carSpeed);
	}
	
	@Override
	public void start() {
		 // super.start() will call the super classes start()  
		System.out.println("BMW - start ");
		super.start();
		System.out.println(super.price);
	}
	
	public void display() {
		System.out.println(super.speed); // 100
		System.out.println(speed); // 200
		super.start(); // Car - Start
		stop(); // Car - stop --- it wil call the parent class since he stop() method is not overridden.
		start(); // BMW - Start
		System.out.println(super.speed); // 100
		super.start();
		
		
	}
}
