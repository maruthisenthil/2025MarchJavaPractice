package mypractice;

public class Day6SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		// About Switch 
		// switch() - // switch - decision maker to check the available value
		// break will break the entire switch block
		// only one default should be there
		// good practice to use break in default
		// if break is commented then it will jump to next case and execute the stmts
		switch (browser) {   
		case "chrome":
			System.out.println("Launch Chrome");
			break; 
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		default:  
			System.out.println("Please pass the right browser");
			break; 
		case "brave":
			System.out.println("Launch Brave");
			break;
		}
	

	}

}
