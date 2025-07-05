package ExceptionHandling;

public class Employee {
	
	String name;
	
	public static void main(String[] args) {
		System.out.println("Hi ");
		System.out.println("Hi ");
		System.out.println("Hi ");
		
		try {
			int i =9/0;	// AE
			
			int num[]=new int[2];
			num[4]=100; // AIOB
		
			Employee emp = new Employee();
			emp = null;
			emp.name="Senthil"; // NPE
			
			System.out.println(" After the culprit ");
		}
		
		catch(Error er) {
			System.out.println("Error is coming..");
			er.printStackTrace();
		}
		
		catch(ArithmeticException ae) {
			// reporting
			System.out.println("AE is coming ......");
			ae.printStackTrace();
		}catch(NullPointerException npe) {
			// reporting
			System.out.println("NPE is coming ......");
			npe.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Some expection is on your way !!!");
			e.printStackTrace();
		}
		catch(Throwable e) {
			System.out.println("Some expection is on your way !!!");
			e.printStackTrace();
		}
		
		System.out.println("Bye ... ");

	}

}
