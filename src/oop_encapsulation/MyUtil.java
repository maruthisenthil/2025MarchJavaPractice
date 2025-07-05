package oop_encapsulation;

public class MyUtil {
	
	public static void main(String[] as){
		TestUtil.launchURL();
		System.out.println(TestUtil.DEFAULT_TIME);
		
		
//		TestUtil tu = new TestUtil(); // The constructor TestUtil() is not visible - means the class have private const..
		
//		Class with having private Constructor
		
//		System obj = new System(); // it means the SYSTEM class contains private constructors.
//		if we are not able to create object means then the class have private constructors
//		 This clearly says that Java is not 100% Object oriented.
		
//		Use Case for Private Constructor - 
		
		// To Avoid Static methods access using object reference we are creating Private Constructor.
		// Reusable methods we can use private constructors
		
		TestUtil tu = new TestUtil();
//		tu.launchURL();  
		// Warning :::: The static method launchURL() from the type TestUtil should be accessed in a static way
//		To Avoid using the above warning we are using Private Constructor
	}
	
}
