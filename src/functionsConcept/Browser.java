package functionsConcept;

public class Browser {
	
	//AC: WAF
	//name: launchBrowser
	// input param: String browserName
	// logic: Launch Browser
	// return boolean
	// if browser is not found: return false.
	public boolean launchBrowser(String browserName) {
		System.out.println("Trying to launch the browser "+browserName);
		boolean isLaunched = true;
		
		switch(browserName.toLowerCase().trim()){
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "firefox":
			System.out.println("Chrome is launched");
			break;
		case "edge":
			System.out.println("Chrome is launched");
			break;
		case "safari":
			System.out.println("Chrome is launched");
			break;
		default: 
			System.out.println("Browser not found ... pass right browser...");
			isLaunched=false;
			break;
		}
		return isLaunched;
	}
	
	// return and break cannot be TOGETHER
	public boolean launchMyBrowser(String browserName) { 
		System.out.println("Trying to launch the browser "+browserName);
		
		switch(browserName.toLowerCase().trim()){
		case "chrome":
			System.out.println("Chrome is launched");
			return true;
		case "firefox":
			System.out.println("Chrome is launched");
			return true;
		case "edge":
			System.out.println("Chrome is launched");
			return true;
		case "safari":
			System.out.println("Chrome is launched");
			return true;
		default: 
			System.out.println("Browser not found ... pass right browser...");
			
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Browser obj= new Browser();
		boolean launchFlag= obj.launchBrowser("ChRome"); // call by value method type
		
		if(launchFlag) {
			System.out.println("Enter the application URL:  ");
		}
		System.out.println("----------------------------------------------");
		boolean s=obj.launchMyBrowser("opera");
		System.out.println(s);
		System.out.println("");
	}

}
