package AccMod;

public class Car {

	// By Default all the class variables are default
	
	// Access modifiers: can be applied on data members of the class.
	// data members: var + methods
	
	public String name;
	private int price;
	protected String modelNumber;
	String licNumber;
	
	public void itisPublic() {
		System.out.println("It is a public method");
	}
	
	private void itisPrivate() {
		System.out.println("It is a private method");
	}
	
	protected void itisProtected(){
		System.out.println("It is a protected method");
	}
	
	void itisDefault() {
		System.out.println("It is a default method");
	}
	public static void main(String[] args) {

		Car c = new Car();
		c.name = "BMW";
		c.price= 30;
		c.modelNumber= "CDM";
		c.licNumber = "1423";

	}

}
