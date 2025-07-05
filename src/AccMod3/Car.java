package AccMod3;

public class Car {
	
	public Car() {
		
	}
	
	private Car(int a ) {
		
	}
	
	protected Car(String a) {
		
	}
	
	Car(double d){
		
	}
	
	public void start() {
		System.out.println("car -- start");
	}
	
	protected void stop() {
		System.out.println("car -- stop");
	}
	
	private void refuel() {
		System.out.println("car -- refuel");
	}
	
	void autoParking() {
		System.out.println("car -- autoparking");
	}
}
