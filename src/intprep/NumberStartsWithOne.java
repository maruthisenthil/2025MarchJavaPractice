package intprep;

import java.util.ArrayList;
import java.util.List;

public class NumberStartsWithOne {

	
	public static int getFirstDigit(int num) {
		while(num>=10) {
			num = num /10;
		}
		return num;
	}
	
	public static List<Integer> getNumbersList(int[] arr){
		List<Integer> numberLists=new ArrayList<Integer>();
		
		for (int num : arr) {
			int n=getFirstDigit(num);
			if(n==1) {
				numberLists.add(num);
			}
		}return numberLists;
	}
	
	public static void main(String[] args) {
		// find out the number starting with 1
		int[] ar= {1,22,321,123,431,155,1655,100,989,211,1456};
		System.out.println("Hi");
		System.out.println(getNumbersList(ar));
		
	}

}
