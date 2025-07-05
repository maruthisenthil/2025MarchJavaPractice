package costructorAssignment2;

public class Page {
	
	public Page() {
		System.out.println("Page -- default const.. ");
	}
	
	public Page(int a) {
		System.out.println("Page -- 1 param const.. "+a);
	}
	
	public Page(int a, int b ) {
		System.out.println("   Page -- 2 param Const.. "+ (a+b));
	}
	
	public void title() {
		System.out.println(" Page -- title");
	}

	public void url() {
		System.out.println(" Page -- URL");
	}
	
	public void defaultLoadingTime() {
		System.out.println(" Page loading time 5 secs");
	}

}
