package mypractice;

import java.util.Arrays;

public class Day12ArrayLiterals {

	public static void main(String[] args) {
		
		//2.Array Literals: Also Static Array but values are assigned during the declaration 
		// but the no of elements are already known;
		
		int num[]= {10,20,30,40,50};
		
		System.out.println("Array Literals: ");
		System.out.println(num[0]);

		System.out.println("Lenght of ArrayLiterals num[] = : "+num.length);
//		System.out.println(num[5]); // AIOB
//		num[5]=45;		// AIOB
//		System.out.println(num[5]); // AIOB
		// Even we assigned the new value in the literals size wont be increased
		// Once created THATS IT ARRAY SIZE IS FIXED 
	
		//1. NEW KEYWORD: - when we are sure about the size we can go with new keyword 
		int i[] = new int[10];
		i[0]=100;
		i[2]=200;
		i[4]=200;
		System.out.println(Arrays.toString(i));
		i[5]=500;
		i[9]=900;
		System.out.println(Arrays.toString(i));
		System.out.println("-----------------");
		System.out.println("Double Array Literals");
		double salary[]= {12.34,23.34,34.45};
		System.out.println("For - Reverse");
		System.out.println(salary.length);
		for(int i1=salary.length-1;i1>=0; i1--) {
			System.out.println(salary[i1]);
		}
		
		System.out.println(salary.length);
		System.out.println("Arrays.toString(salary");
		System.out.println(Arrays.toString(salary));
		
		System.out.println("-----------------");
		System.out.println("String Array Literals");
		String browser[]= {"chrome","firefox","edge","safari"};
		System.out.println(browser.length);
		System.out.println(Arrays.toString(browser));
		
		browser[0]="chromium"; // by default new value will be replace the old value in String array literals
		
		System.out.println(Arrays.toString(browser));
		System.out.println("String Array Literals- Reverse Order");
		for(int jj=browser.length-1;jj>=0;jj--) {
			System.out.println(browser[jj]);
		}
		System.out.println("For Each");
		for(String s:browser) {
			System.out.println(s);
		}
		
		System.out.println("-----------------");
		System.out.println("Object Array Literals");
		
		
		Object emp[]= {"Senthil",38,34.50,false,'m'};
		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp));
		for (Object e: emp) {
			System.out.println(e);
		}
		
//		emp[5]="Bangalore"; // AIOB - Becoz once size is FIXED means FIXED
//		System.out.println(Arrays.toString(emp)); // AIOB
		emp[0]="Senthil Automation Architect ";
		emp[3]=true;
		System.out.println("For Each");
		for(Object e:emp) {
			System.out.println(e);
		}
		System.out.println("For-Index Based");
		for(int j=0; j<emp.length;j++) {
			System.out.println(emp[j]);
		}
		
		System.out.println("Arrays.toString()");
		System.out.println(Arrays.toString(emp));
		
		System.out.println("-----------------");
		System.out.println("reverse ArrayLiterals: Using for_index ");
		int number[]= {10,20,30,40,50};
		
		for(int k=number.length-1; k>=0; k--) {
			System.out.println(number[k]);
		}
		System.out.println("reverse ArrayLiterals: using for_each ");
		int count= number.length-1; // 4
		
		// Without using e
		for(int e: number) {
			System.out.println(number[count]);
			System.out.println("e ========>"+e);
			count--;
		}
		
		// with using e
		int count1= number.length-1; // 4
		System.out.println("reverse ArrayLiterals: using for_each -- With for_each reference value: ");
		for(int f: number) {
			f=count1;
			System.out.println(number[f]);
			System.out.println("using e =====>"+f);
			count1--;
		}
		
		
		
		int[] ar2=new int[4];


		ar2[3]=4;

//				Homework
//				Use For each for 2d array
//				Object 2d array 
				
	}

}
