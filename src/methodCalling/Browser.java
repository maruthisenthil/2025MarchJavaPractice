package methodCalling;

public class Browser {
public static int i=0;
	public void m1() {
		i++;
		System.out.println(i+" : m1 method ");
		m2();
	}
	
	public void m2() {
		i++;
		String n="test";
		System.out.println(i+" : m2 method");
		m3();
	}
	
	public void m3() {
		i++;
		System.out.println(i+" : m3 method");
//		m1();
	}
	
	public static void main(String[] args) {
		int a =10; // local - stack
		System.out.println("main - method called");
		
		Browser br= new Browser();		
		br.m1();

	}

}
