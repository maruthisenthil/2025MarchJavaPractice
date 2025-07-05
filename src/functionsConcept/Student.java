package functionsConcept;

public class Student {

	public static void main(String[] args) {
		
		Student st1= new Student();
		int result1=st1.getStudentMarks("Arul");
		System.out.println("result1: "+result1);
		
		if(result1>=0) {
			System.out.println("print the marksheet");
		}else {
			System.out.println("marksheeet wont be printed, since student wont be printed");
		}
		
	}
	
	// AcceptanceCriteria
	// WAF - [Write A Function]= get a student marks on the basis of Student name:
	// logic - negative marking: -1 for wrong answer
	// function name: getStrudentMarks(String studentName)
	// parameters : 1
	// return: marks(int)>=0 [0-100]
	public int getStudentMarks(String studentName) {
		System.out.println(" getting student marks");
		int marks =-1;
		if(studentName.equals("Senthil")) {
			int score=99;
			int negativeMarks = -1;
			marks= score+negativeMarks;
		}
		
		else if(studentName.equals("Bairava")) {
			int score=100;
			int negativeMarks = 0;
			marks= score + negativeMarks;
		}
		else if(studentName.equals("Mohan")) {
			int score=70;
			int negativeMarks = -70;
			marks= score + negativeMarks;
		}else {
			System.out.println("Studnet not found ... "+studentName);
		}
		
		return marks;
		
	}

}
