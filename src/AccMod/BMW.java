package AccMod;

public class BMW extends Car{

	public static void main(String[] args) {
		
		BMW bmw = new BMW();
		bmw.name="BMW"; // public
		bmw.modelNumber="Q+"; // default
		bmw.licNumber="12231"; // protected
		
		// rule: same package - subclass
//		bmw.price=10; // private - The field Car.price is not visible due to private access modifiers
		
	}

}
