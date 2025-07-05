package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Browser {

	public static void main(String[] args) {
		
		System.out.println("open browser");
		
		try {
			Thread.sleep(5000); // 5000ms =5 sec -- CompileTime Exception
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("close browser");

		try {
			FileInputStream file = new FileInputStream("/documents/senthil.text");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
