package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {
		
		int marks = -1;
		
		if(name.equals("tom")) {
			marks = 90;
			return marks;
		}
		else if(name.equals("peter")) {
			marks = 95;
			return 95;
		}
		else if(name.equals("lisa")) {
			marks = 85;
			return 85;
		}
		else {
			System.out.println("Student not found ");
			
				throw new MyException("<----Student not found --->");
//			return -1; // Unreachable code because in the previous line program is terminated ..
			// throw and return cannot be together and throw and break cannot be together  
		}
		
	}
	
	public static void main(String[] args) {
				
		int m1=Student.getMarks("naveen");
		System.out.println(m1);
		
		if(m1>=0) {
			System.out.println("print the marksheet ");
		}
		
		System.out.println("enter the url ...");

	}

}
