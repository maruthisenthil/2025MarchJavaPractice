package WebDriver_Arch;

public class AmazonTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Top Casting
//		WebDriver driver = new ChromeDriver(); 
		
//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
		
		// top casting
//		WebDriver driver = new ChromeDriver();
		
		String browser = "edge";
		
		// cross browser logic
		// parallel execution:
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;	
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("invliad browser :");
			break;
		}
		
		driver.get("https://www.amazon.com");
		System.out.println("driver.getTitle() : "+driver.getTitle());
		driver.findElement("search");
		
		driver.sendKeys("search", "MacBook");
		driver.click("search icon");
		driver.quit();
	}

}
