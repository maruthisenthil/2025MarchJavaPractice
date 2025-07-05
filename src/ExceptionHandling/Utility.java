package ExceptionHandling;

public class Utility {

	public static void main(String[] args) {
		
		// throw - to create own exception 
		// throwing the exception deliberately 
		String data = null;
		
		if(data == null) {
			System.out.println(" data is not present ");
			throw new RuntimeException("---->  data is not present <---- ");
			
		}
		
//		System.out.println(" EOP "); // this is dead code because we are using custom exception:
	}
}
