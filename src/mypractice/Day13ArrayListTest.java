package mypractice;

import java.util.ArrayList;

public class Day13ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		System.out.println(marksList.size()); // Current VC=10, PC=0
		marksList.add(100);
		marksList.add(200);
		System.out.println(marksList.size()); // Current VC=8, PC=2
		
		
		ArrayList<String> empList=new ArrayList<String>(); // Current VC=10, PC=0
		empList.add("Naveen");
		empList.add("Senthil");
		empList.add("Tom");
		empList.add("Peter");
		// VC=6, PC=4
		
		ArrayList<Integer> mList= new ArrayList<Integer>(20); // vc=20, pc=0 
		// 20 Denotes we are informing JVM We need 20 space
		// 0 to 19 filled - vc=0, pc=20
		//when we add one more value then based on the LF load factor we are new VC
		// LF=pc/2 ...in the initial pc=20 and now LF=20/2=10
		// now new 10 VC will be added/reserved for the ArrayList
		// now new VC=10 and PC=20
		
		ArrayList<Integer> pList=new ArrayList<Integer>(5); // vc=5, pc=0
		// 0 to 5 filled - now vc=0, pc=5
		//add one more value and based on LF new VC will allocated
		// LF=PC/2; LF=5/2 = 2
		
		System.out.println("--------");
		
		ArrayList<String> stList=new ArrayList<String>(); // Current VC=10, PC=0
		stList.add("Tom"); //0 
		stList.add("Peter"); //1
		stList.add("Ravi"); // 2
		stList.add("Pooja"); // 3 
		stList.add("Aswini"); // 4
		stList.add("Anjani"); // 5
		stList.add("Sen"); // 6
		
//		System.out.println(stList.size()); //7
		System.out.println(stList);
//		
//		stList.remove(2); // remove the value on the basis of index - removing the value in the 2nd index = Ravi
//		
//		System.out.println(stList);
//		System.out.println(stList.size()); //6
//		
//		stList.remove("Pooja");
//		System.out.println(stList);
//		System.out.println(stList.size());//5
//		
//		
//		stList.set(0, "Naveen"); // set will replace and we will loose data-- old value will be replaced with new value when we use set using index
//		System.out.println(stList);
//		System.out.println(stList.size());//5
		
		stList.add(0, "Naveen"); // add will insert the value at this position 
		System.out.println(stList);
		System.out.println(stList.size());
		
		ArrayList<Integer> numList= new ArrayList<Integer>(20); // vc=20, pc=0;
		numList.add(1); // 0
		numList.add(2); // 1
		numList.add(3); // 2
		numList.add(4); // 3
		
		System.out.println(numList);
		
		numList.remove((Object)2); // Remove the value 
		System.out.println(numList);
		
//		numList.remove(3); // Remove the index
//		System.out.println(numList);
//		numList.remove(10); // IndexOutOfBoundsException
		
		ArrayList<Integer> nList= new ArrayList<Integer>();
		// nList.add(1,200); // IndexOutOfBoundsException
		// Reason: We cannot skip the position and add the value in the needed index
		// ArrayList will insert in the index order and not in the required index 
		// if we try we will get - IndexOutOfBoundsException
		
		
		ArrayList<Integer> myList= new ArrayList<Integer>();
		
	}

}
