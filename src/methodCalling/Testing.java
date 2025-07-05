package methodCalling;

public class Testing {

	public void m1(Testing g1) {
		System.out.println("m1 method");
		Testing.t1(g1); // g1=obj
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void t1(Testing p1) {
		System.out.println("t1 method");
		Testing.t2(p1);	// p1=g1
	}

	public static void t2(Testing ob) {
		System.out.println("t2 method");
//		m3(); // ERROR: Cannot make a static reference to the non-static method m3() from the type Testing
		ob.m3();   // ob=p1
	}
	
	public static void t3() {
		System.out.println("t3 method");
	}
	
	
	public static void main(String[] args) {
		
		Testing obj=new Testing();
		obj.m1(obj); // call by reference 

	}
	// Cheat Sheet
	// Static calling Static - CMA to CMA  - No object creation : call it using class name/directly
	// Non-Static calling Non-static - direct calling
	// Non-static calling Static : - no object creation - call it using class name/ directly
	// Static calling Non-static : - Create the Object/ use call by reference

}
