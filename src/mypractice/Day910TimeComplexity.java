package mypractice;

public class Day910TimeComplexity {
	
	public static void main(String[] args) {
	
		// Big O - Time complexity will be measured as Big O
		
		// Time Complexity - O(1) - Becoz the below two lines are going to execute only once so O(1)
		//so O(1) is called the complexity as a CONSTANT TIME
		int i = 1;
		System.out.println(i);
		
		
		// Time Complexity - O(n) because n no.of times the loop can run so O(n)
		int n=10;
		for (int k = 0; k < n; k++) {
			System.out.println(k);
		}
		
//		------------------------------------
		
		//Big Oh : O()
		// Time complexity of a statements that is going to execute 1 time the O(1) is the time Complexity
		
		// O(1) - CONSTANT TIME
		i = 1;
		System.out.println(i);
		
		int x = 10;
		int y = 5;
		if(x>y) {
			System.out.println("hii"); 
		}
		else {
			System.out.println("bye");
		}
		//O(1)
		//switch - case: O(1)
		
		System.out.println("-------------------------------");
		
		int num = 10;
		for(int p = 1; p<=num; p++) {
			System.out.println(p);
		}
		//1+1+n+n+n=> 3n+2 : linear equation [2 is a constant so we will removed]
		//3n+2 ==> 3n --> n --> O(n) [2 is a constant so we will removed]
		// 3n --> n --> O(n) for the code from line number_43 to line number_46;
		
		int total = 1; // it will take 0.00001ms for execcution
		while(total<=10) {    // 10 minutes for execution
			System.out.println(total);  // 0.00001ms 
			if(total ==5) {  	// 0.00001ms
				System.out.println("hello");
			}
			total++;// 50 minutes
		}
		// 1 + n + n + n + 1 + n = 4n+2 ==> O(n)
		
		System.out.println("-----------");
		
		for(int row=1; row<=10; row++) {
			for(int col=1; col<=10; col++) {
				System.out.print(row+""+col+" ");
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)=>(1+3n)(1+3n)=> 1+3n+3n+9n^2=>9n^2+6n+1 (Quadratic equation)
		//9n^2+6n+1 ==> 9n^2+6n => 3n(3n+2) ==> 9n^2 ==> n^2 ==> O(n^2)
		
	}
	
}
