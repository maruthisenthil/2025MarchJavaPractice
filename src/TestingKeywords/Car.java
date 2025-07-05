package TestingKeywords;

public class Car extends Vehicle{

	int speed = 100;
	int price = 800;
	
	// this key word used to call its own/current class constructor
	// this - is also like super 
	public Car() {
		this(200, 300);
		
		System.out.println("Car - default const.. ");
	}
	
	public Car(int i) {
		System.out.println("Car - 1 param const.. " + i);
	}
	
	public Car(int i, int j) {
		System.out.println("Car - 2 param const.. " + (i+j) );
	}
	
	public void start() {
		System.out.println("Car - start ");
	}
	
	public void stop() {
		System.out.println("Car - stop ");
	}

}
