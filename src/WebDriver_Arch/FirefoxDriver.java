package WebDriver_Arch;

public class FirefoxDriver implements WebDriver{

	public FirefoxDriver() {
		System.out.println("Launch Firefox Browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Launch Url: " + url);
		
	}

	@Override
	public String getTitle() {
		return "MyTitle";
	}

	@Override
	public void findElement(String ele) {
		System.out.println("Find the element:  "+ ele);
		
	}

	@Override
	public void click(String ele) {
		System.out.println("Clicking on elemnt :  "+ele);
		
	}

	@Override
	public void sendKeys(String elem, String value) {
		System.out.println("Entering the value in the ele : "+elem+"  value== " + value );

	}

	@Override
	public void quit() {
		System.out.println("Quit Browser: ");
		
	}
}
