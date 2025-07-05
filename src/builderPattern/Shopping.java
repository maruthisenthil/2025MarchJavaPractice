package builderPattern;

public class Shopping {
	
	int orderId;


	// using the return keyword to achieve the builder pattern.
	public Shopping login() {
		System.out.println("login to app ");
		return this; // return current class object with [this] keyword 
					 // (this) --> means it is pointing to the current class object and it returning the current class object
	}
	
	public Shopping login(String un, String pw) {
		System.out.println("Login with creds : "+ un + ":" + pw);
		return this; // return same object available in the heap which is the current object
	}
	
	public Shopping search() {
		System.out.println(" default search with default products ");
		return this; // return current class object with [this] keyword 
	}
	
	public Shopping search(String productName) {
		System.out.println(" search with product name: "+productName);
		return this;
	}
	
	public Shopping search(String productName, int price) {
		System.out.println(" search with product name : "+productName +  " -- price: " + price);
		return this;
	}
	
	public Shopping addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
		return this;
	}
	
	public Shopping makePayment(String upi) {
		System.out.println("making payment via: "+upi);
		return this;
	}
	
	public Shopping makePayment(String cc, int cvv) {
		System.out.println("making payment cc: "+cc+" -- cvv :"+cvv);
		return this;
	}
	
	public Shopping generateOrder() {
		orderId = 123456;
		System.out.println("Your order id is: "+orderId);
		
		return this;
	}
	
	public Shopping logout() {
		System.out.println("Logout from the application ");
		return this;
	}
	
	public void trackOrder(int orderId) {
		System.out.println(" Tracking Id: "+ orderId );
	}
}
