package mypractice;

import java.util.Arrays;

public class Day11ArraysConcept {

	public static void main(String[] args) {
		
		// Arrays
		// A collection/ Data structure: which can hold similar types of values .. 
		
		// Limitations of Array: 
		//limitations of array:
		//1. size is fixed: static array: to overcome this problem, we have to use dynamic array: ArrayList, Collections
		//2. it can store only similar type of family data: to overcome this problem, use static Object array, ArrayList with Generics
		
		// 1.size is fixed - Static Array - once size is fixed we cannot add more values into it.To Overcome the limitation of Array - ArrayList/Collections:
		// 2.it can store only similar of family data [ex-only string values can store in string Array String []browser = new String[4]]
		//		to overcome [2] we will use Generics and Object Array and ArrayList with Generics
		
		// use case: when size is fixed:
		// Month/ days/ days_of_week
		// Menu items, footers
		

		// Declaration:
		// 1. using new keyword:
		int i[]=new int[5];
//		i[-1]=100; // AIOB
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		System.out.println("i array length"+i.length);
		System.out.println("Low index : "+0);
		System.out.println("Hi Index : "+(i.length-1));
		
		System.out.println(i[0]);
		System.out.println(i[4]);
//		System.out.println(i[5]); // AIOB
//		System.out.println(i[-1]); // Array Index OutofBound Exception:
		int[] p= new int[50]; // 0 -49
		p[0]=100;
		p[3]=200;
		
		System.out.println("p[0]: "+p[0]);
		System.out.println("p[1]: "+p[1]);
		System.out.println("p[2]: "+p[2]);
		System.out.println("p[3]: "+p[3]);
		System.out.println("-------------------");
		
		// To PRint all the values of the array:
		System.out.println("Indexed based For loop");
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}
		System.out.println("-------------------");
		//For Each loop
		System.out.println("For each loop");
		for(int a: i){
			System.out.println(a);
		}
		System.out.println("-------------------");
		
		System.out.println(i.toString());
		System.out.println(Arrays.toString(i));
		System.out.println("-------------------");
		
		System.out.println(Arrays.toString(p));
		
		System.out.println("-------------------");
		System.out.println("Byte Array");
		
		byte[] b= new byte[2];
		System.out.println(Arrays.toString(b));
		b[0]=5; b[1]=10;
		System.out.println(Arrays.toString(b));
		System.out.println("-------------------");
		System.out.println("Double Array");
		double[] d=new double[3];
		System.out.println(Arrays.toString(d));
		d[0]=10.92;
		d[1]=12.34;
		d[2]=23.45;
		System.out.println(Arrays.toString(d));
		for (double e : d) {
			System.out.println(e);
		}
		System.out.println("-------------------");
		System.out.println("Float Array");
		
		float f[]=new float[2];
		System.out.println(Arrays.toString(f));
		f[0]=10.23f;
		f[1]=20;
		System.out.println(Arrays.toString(f));
		System.out.println("-------------------");
		
		System.out.println("Char Array");
		
		char[] cr=new char[4];
		System.out.println(Arrays.toString(cr));
		
		cr[0]='a';
		cr[1]='B';
//		cr[2]='$';
		cr[3]='0';
		System.out.println(Arrays.toString(cr));
		
		System.out.println("for Each ==>");
		for(char cri: cr) {
			System.out.println(cri);
		}
		System.out.println("-------------------");
		System.out.println("boolean Array");
		
		boolean[] ba=new boolean[3];
		System.out.println(Arrays.toString(ba));
		
		ba[0]=true;
		ba[1]=true;
		System.out.println(Arrays.toString(ba));
		
		System.out.println("-------------------");
		System.out.println("String Array");
		
		String browser[]=new String[4];
		browser[0]="chrome";
		browser[1]="edge";
//		browser[2]="firefox";
		browser[3]="safari";
		
		System.out.println(Arrays.toString(browser));
		
		System.out.println("for-indexbased ==>");
		for (int j = 0; j < browser.length; j++) {
			System.out.println(browser[j]);
		}
		
		System.out.println("for-each ==>");
		for(String sri: browser) {
			System.out.println(sri);
			if(sri.equals("edge")) {
				System.out.println("Launch Edge Browser");
				break;
			}
		}
		
		System.out.println("----------------------");
		// Object is a super class of all the classes in java by default.
		
		//Object array:
		// name(String), age(int), salary(double), gender(char), isPermanent(boolean)
		// will solve one situaion of sotring multiple typpe of date in a single array but fails to overcome 
		// the fixed array size;  
		System.out.println("Static Object Array with fixed value:");
		Object empData[] = new Object[5];
		System.out.println(Arrays.toString(empData));
		
		empData[0] = "Senthil";
		empData[1] = 43;
		empData[2] = 40.40;
		empData[3] = 'm';
		empData[4] = true;
		System.out.println("Arrays.toString() ==>");
		System.out.println(Arrays.toString(empData));
		System.out.println("for-each ==>");
		for(Object ee: empData) {
			System.out.println(ee);
		}
			
		
	}

}
