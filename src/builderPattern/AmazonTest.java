package builderPattern;

public class AmazonTest {

	public static void main(String[] args) {
		
		// method chaining: actions of methods
		
		Shopping shop = new Shopping();
		shop.login("senthil@gmail.com","senthil123")
			 .search(" Apple Mackbook pro m1 chip")
			  .addToCart("Mackbook pro")
			   .makePayment("senthil@upi.com")
			    .generateOrder()
			     .logout();
		
		shop.trackOrder(shop.orderId);
		
		System.out.println("-------------------");
		
		shop.login("senthil86@gmail.com", "sen1234")
			 .search("Nike T-Short",100)
			  .addToCart("Nike T-Short 1")
			   .logout();
		
		System.out.println("-------------------");
		
		shop.login("senthil@gmail.com","sen1234")
			 .makePayment("1111 2222 1111 2121, 1232", 123)
			  .generateOrder()
			   .logout();
		
		System.out.println("-------------------");
		shop.login("senthil@gmail.com", "1234")
		     .logout();
		
		System.out.println("-------------------");
		shop.logout();

	}

}
