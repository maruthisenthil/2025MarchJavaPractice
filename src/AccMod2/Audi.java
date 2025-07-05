package AccMod2;

import AccMod.Car;

public class Audi extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Audi ad = new Audi();
		ad.name = "Audi"; // public 
		ad.modelNumber = "A+"; // protected
//		ad.licNumber // default 
//		ad.price // private 
		
		Car c = new Car();
		c.name = "Car";
		
		
		
	}

}
