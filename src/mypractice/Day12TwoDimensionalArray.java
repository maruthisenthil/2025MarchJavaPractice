package mypractice;

public class Day12TwoDimensionalArray {

	public static void main(String[] args) {
		
		String data[][]= {
				{"macbook"	,"mackbook pro",	"Apple",	"InStock"},
				{"iMac"		,"mackbook pro",	"Apple",	"InStock"},
				{"Samsung"	,"Samsung Monitor", "Samsung",	"outofstock"},
				{"Canon"	,"DSLR Camera",		"cannon",	"InStock"}
		};
		System.out.println(data.length);
		System.out.println(data[0][0]);
		System.out.println(data[0][3]);
		System.out.println(data[3][2]);
		
		for(int i=0;i<data.length;i++) {
			for(int j=0; j<data.length;j++) {
				System.out.print(data[i][j]+"   ");
			}
			System.out.println("");
		}
		
		for(String[] b:data) {
			for(String[] d:data) {
				System.out.print(b+""+d+" \t");
			}	
			System.out.println();
		}
		
		System.out.println("--------------------");
		System.out.println("2D Array with New");
		
		int[][] num=new int[3][3];
		
		System.out.println(num[0][0]);
		System.out.println(num.length);
		int[][] num1=new int[2][10];
		System.out.println(num1.length);
		
	}

}
