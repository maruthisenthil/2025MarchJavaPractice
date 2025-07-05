package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		//Big Oh : O()
		
		int i = 10;
		//O(1)
		System.out.println(i);
		//O(1)
		//constant time
		
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
		
		int num = 10;
		for(int p = 1; p<=num; p++) {
			System.out.println(p);
		}
		//1+1+n+n+n=> 3n+2 : linear equation
		//3n+2 ==> 3n --> n --> O(n)
		
		//1 hr --> 0.000001 + 10  mins + 0.000001 + 50 mins
		int total = 1;
		while(total<=10) {
			System.out.println(total);
				if(total == 5) {
					System.out.println("hello!!");
					break;
				}
			total++;
		}
		
		//1+n+n++n+1+n=>4n+2==>4n==> n==> O(n)
		
		//
		for(int m=1; m<=100; m++) {
			System.out.println("calculating logic");
			if(m==200) {
				System.out.println("bye!!");
				break;
			}
			m++;
			System.out.println("value is updated...");
		}
		
		//1+n+n+n+n+n+n==>6n+1 ==> 6n ==> n ==> O(n)
		
		for(int u=1; u<=5; u++) {
			System.out.println(u);
		}
		
		for(int v=1; v<=5; v++) {
			System.out.println(v);
		}
		
		//1+3n + 1+3n ==> 2+6n ==> 6n ==> n ==> O(n)
		
		System.out.println("-----------");
		
		for(int row=1; row<=10; row++) {
			for(int col=1; col<=10; col++) {
				System.out.print(row+""+col+" ");
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)=>(1+3n)(1+3n)=> 1+3n+3n+9n^2=>9n^2+6n+1 (Quadratic equation)
		//9n^2+6n+1 ==> 9n^2+6n => 3n(3n+2) ==> 9n^2 ==> n^2 ==> O(n^2)
		
		
		System.out.println("-----------");

		int w=1;
		int z=1;
		while(w<=10) {
			while(z<=10) {
				System.out.print(w+""+z+" ");
				z++;
			}
			System.out.println();
			w++;
		}
		
		//1+1+(n+n+n)(n+n+n) ==> 2+(3n)(3n)=>2+9n^2==>n^2
		
		System.out.println("-----------");

		for(int row=1; row<=10; row++) {
			for(int col=1; col<=10; col++) {
				for(num=1; num<=10; num++) {
					System.out.print(row+""+col+num+" ");
				}				
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n)(1+n+n+n)==>(1+3n)(1+2n)(1+3n)==>n^3+n^2+n+1 : Cubic equation
		//n^3+n^2+n+1 ==> n^3+n^2+n ==> n(n^2+n+1)==> n(n^2+n)=>n^3+n^2==>n^2(n+1)==> n^2(n)=> n^3
		
		//linear search: for() : o(n)
		//binary search algo: 
		//k = n/2
		//log k = log(n/2)
		//log k = log n - log 2
		//log k = log n - log 2 (base 2)
		//log k = log n - 1 => log n ==> O(log n) 
		//log n (base k) : binary search: k = 2
		
		//binary tree, merge sort, 
		
		
		String evenNumberList = "";
		for (int c = 1; c <= 100; c++) {
			if (c % 2 == 0) {
				evenNumberList = (evenNumberList + c + ",");//2,4,6,8,,100
								
			}
			
		}
		System.out.println(evenNumberList);
		
	}

}
