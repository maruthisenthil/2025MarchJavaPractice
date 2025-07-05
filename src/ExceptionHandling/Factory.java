package ExceptionHandling;

public class Factory {

	public static void main(String[] args) {
		
		String browser = "opera";
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch ff");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		default:
			System.out.println("Enter valid browser");
			throw new MyException("<--- Invlid Browser --->");
//			break; // throw and break cannot be together.  
			// no need of break if we are using throw before line and after throw it it will be dead code.. 
		}
		
		System.out.println("Enter the url .. ");
		System.out.println("Find element ");
		System.out.println("closed browser");
	}

}
