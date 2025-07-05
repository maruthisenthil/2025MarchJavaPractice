package constructorConcept;

public class Car {
	
	String name;
	int price;
	String licenseNumber;
	String model;
	static final int wheels=4;
	

	// JVM Add one default constructor AKA hidden Constructor - when no constructor in the class. 
	
	// AC :
	// name
	// name, price
	// name, licenseNumber
	// name, price, licenseNumber, model
	// when no car info - no need to create the object: no default constructor

 	public Car(String name) {
		this.name = name;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, String licenseNumber) {
		this.name = name;
		this.licenseNumber = licenseNumber;
	}
	
	public Car(String name, int price, String licenseNumber, String model) {
		this.name = name;
		this.price = price;
		this.licenseNumber = licenseNumber;
		this.model = model;
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("Audi");
		Car c2 = new Car("Hyndai Venue-IMT", 25);
		Car c3 = new Car("ALto", "LNSE49320ALTO");
		Car c4 = new Car("Benze", 45, "LNSBENZ2910394", "A+");
		System.out.println(c2.name+" "+c2.price+" "+c2.licenseNumber+" "+c2.model);
		c2.model="R+";
		c2.licenseNumber="LNSVNUIMT34221";
		System.out.println(c2.name+" "+c2.price+" "+c2.licenseNumber+" "+c2.model);
		
	}

}
 