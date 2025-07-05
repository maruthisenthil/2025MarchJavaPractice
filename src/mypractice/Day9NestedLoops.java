package mypractice;

public class Day9NestedLoops {

	public static void main(String[] args) {
		
		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55
		
		// 2D Array for accessing the excel sheet
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=5; j++) {
				System.out.print(i+""+j+" ");
//				break;						// it will break the inner loop
			}
			System.out.println("hi");
//			break;							// it will break the outer loop
		}
		System.out.println("----------------");
		
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=5; j++) {
				for (int k = 0; k <=5; k++) {
					System.out.print(i+""+j+k+ " ");
				}
				System.out.println();
			}
		}
		
		System.out.println("----------------");
		int i=1;
		while (i <= 5) {
//			System.out.println(i);
			int j =1;
			while (j <= 5) {
				System.out.print(i+""+j+" ");
				j++; //all the increments are same
			}
			System.out.println();
			i++; //all the increments are same
		}
		
		
		// nested loops uses cases:
		// read data from Excel sheet/csv
		// iterate 2D array
		
	}

}
