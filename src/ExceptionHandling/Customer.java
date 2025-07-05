package ExceptionHandling;

public class Customer {
	
	
	public static int getMarks(String name) {
		
		System.out.println("Customer name ---- "+name);
		
		 
		if(name.equals("shubam")) {
			try {
				System.out.println("Hi ");
//				System.exit(1); // shutdown the JVM -
				int i = 9/0;
				return 50;
			}catch(ArithmeticException ae) {
				System.out.println("AE is coming ");
				return 70;
			}
			finally {	
				System.out.println("finally block ");
//				System.exit(1); // shutdown the JVM - 
//				return 100; // finally block does not complete normally
				
			}
			
//			return 90;
		}
		else if (name.equals("rahul")) {
			return 95;
		}
		else if (name.equals("senthil")) {
			return 0;
		}
		else {
			System.out.println(" Customer not found " );
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		int m1=getMarks("shubam");
		System.out.println(m1);

	}

}
