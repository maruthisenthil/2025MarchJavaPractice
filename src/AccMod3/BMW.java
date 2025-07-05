package AccMod3;

public class BMW extends Car{
	
	// ways to override the public method
	// 1. with public 
	
	@Override
	public void start() {
		System.out.println("car -- start");
	}
	
	
	// ways to override the protected method
	// 1. with public 
	// 2. with protected
	@Override
	public void stop() {
		System.out.println("car -- stop");
	}
	
//	@Override
//	private void refuel() { // The method refuel() of type BMW must override or implement a supertype method
//		System.out.println("car -- refuel");
//	}
	
	// individual method
	// ways to override the private method
		// 1. with public 
		// 2. with protected
	public void refuel() { 
		System.out.println("car -- refuel");
	}
	
	// ways to override the default method
		// 1. with public 
		// 2. with protected
		// 3. default
	@Override
	protected void autoParking() {
		System.out.println("car -- autoparking");
	}
	
	
	
}
