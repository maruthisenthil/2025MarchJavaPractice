package opp_abstract;

// Object creation for the Abstract class is NOT like interface  
// cannot create object of the abstract class 
// abstract class can have constructor .. it will be called when you create the object of the child class  
public abstract class Page {
	
	// first preference goes to default const..  
	// when we are supplying other const.. then default const.. is must
	// default const.. will be created during the RUNTIME
	public Page() { 
		System.out.println("  Page -- default const ..");
	}
	
	public Page(int a ) { // 1 param const
		System.out.println("  Page --  one param const .."+ a);
	}
	
	public Page(int a, int b ) {
		System.out.println("   Page -- 2 param Const.. "+ (a+b));
	}
	
	int price=10;

	// Abstract + non-abstract class
	
	// ABstract possibility
	// only abstract methods -- 100% abstraction 
	// no abstract method -- 0 % abstraction
	// abstract + non abstract methods - partial abstraction 
	// Abstract methods will be stored in the Class Loader since it is stick with class 
	
	public abstract void title(); 
	public abstract void url();
	
	// final - no one can override 
	public final void displayLogo() {
		System.out.println("page -- logo");
	}
	
	public void defaultLoadingTime() {
		System.out.println("page loading time 10secs ");
	}
	
	// cannot be Overriden 
	public static void footers() {
		System.out.println("page -- footers ");
	}

}
