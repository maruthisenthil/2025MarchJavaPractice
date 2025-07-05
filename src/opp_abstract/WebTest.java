package opp_abstract;

public class WebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage(10,20);
		lp.title();
		lp.url();
		lp.defaultLoadingTime();
		lp.displayLogo();
		lp.doLogin("Senthil", "HeyRam");
		
		LoginPage.footers();
		
		System.out.println(lp.price);
		
		// top casting
		// child class object can be referred by parent abstract class reference variable
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.defaultLoadingTime();
		pg.displayLogo();
		System.out.println(pg.price); // take parent variable : 

		
		//down casting
		// new Page();
	}

}
