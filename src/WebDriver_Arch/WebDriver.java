package WebDriver_Arch;

public interface WebDriver {
	
	public void get(String url);
	
	public String getTitle();
	
	public void findElement(String ele);
	
	public void click(String ele);
	
	public void sendKeys(String elem, String value);
	
	public void quit();

}
