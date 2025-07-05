package classConcept;

public class Page {

	// Template of the page
	String title;     // Obj
	String partialUrl; // obj
	static String baseUrl = "https://www.abc.com";// CMA
	int loadingTime; // obj
	static final String logo="nal.png";   // CMA 
	static final String footer = "help";  // CMA
	
	public static void main(String[] args) {
		
		int bill=200;
		final int days=7;
		
		Page p1=new Page();
		
		Page.baseUrl="https://www.senthil.com/";
		System.out.println(Page.baseUrl);

		// QA 
		Page.baseUrl="https://www.qa.senthil.com/";
		System.out.println(Page.baseUrl);
		
		// Stage
		Page.baseUrl="https://www.stage.senthil.com/";
		System.out.println(Page.baseUrl);
		
		//oms
		Page.baseUrl="https://www.oms.com/";
		System.out.println(Page.baseUrl);
		
		
		
		
		
	}
}
