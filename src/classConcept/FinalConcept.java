package classConcept;

public class FinalConcept {

	public static void main(String[] args) {
		
		final int days =7; // Only final allowed for local variable and not static
		
//		days=10; // data is manipulated: 
// CMP_ERR:The final local variable days cannot be assigned. 
//         It must be blank and not using a compound assignment
		
		
		int salary = days * 100;
		System.out.println(salary);
		

	}

}
