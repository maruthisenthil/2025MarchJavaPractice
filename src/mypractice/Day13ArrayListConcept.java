package mypractice;

import java.util.ArrayList;

public class Day13ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList is a default class 
		// Dynamic array - Maintains the insertion order - Index based Collection

		//ArrayList with Raw Type
		// Like Array ArrayList also starts with index 0 as the first element. 
		ArrayList ar=new ArrayList();
		System.out.println("Size of the ArrayList ar: "+ar.size());
		ar.add(100); // 0 index
		ar.add(200); // 1 index
		System.out.println("Size of the ArrayList ar: "+ar.size());
		ar.add(300); // 2 index
		ar.add(400); // 3 index
		ar.add(500); // 4 index
		System.out.println("Size of the ArrayList ar: "+ar.size());
		
		ar.add(12.22); // 5 index
		ar.add(23.34); // 6 index
		System.out.println("Size of the ArrayList ar: "+ar.size());

		System.out.println("Size of the ArrayList ar: "+ar.size());
		System.out.println("Size of the ArrayList ar: "+ar);
		ar.remove(5); 
		System.out.println("Size of the ArrayList ar: "+ar);
		System.out.println("Size of the ArrayList ar: After Deleting  "+ar.size());
		
		System.out.println("Get : "+ar.get(0));
		System.out.println("Get : "+ar.get(5));
//		System.out.println("Get : "+ar.get(6)); // IndexOutofBoundsException
//		System.out.println("Get : "+ar.get(-1)); // IndexOutOfBoundsException
		System.out.println("-----------------------------");
		// Print all the values from ArrayList: iterate the ArrayList: using for Loop;
		System.out.println("Iterating ArrayList: using for_index");
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("Iterating ArrayList: using for_each");
		for(Object as:ar) {
			System.out.println(as);
		}
		System.out.println("---------ArrayList_Generics-------------------");
		
		// ArrayList with Generics: <DataType -- Non primitive>
		
		// When ever declare ArrayList we have to use with Generics
		// Generics is always non-primitive
		
		System.out.println("---------ArrayList_Integer-------------------");
		
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		
		System.out.println(marksList.size()); 
		// .size will give pc value (Physical Capacity) Based on the load capacity it will increase 
		// Load Factor = PC/2 - Defaut value for VC=10; PC=0
		// After adding 20 alues when VC=0, PC=10 JVM loads VC based on PC
		// Now LF = 10/2=5 so 5 new VC will be created
		System.out.println(marksList);
		
		ArrayList<Byte> byteList= new ArrayList<Byte>();
		ArrayList<Short> shortList= new ArrayList<Short>();
		
		
		System.out.println("----FOR_EACH----");
		for(Integer e:marksList) {
			System.out.println(e);
		}
		
		System.out.println("----------ArrayList_Double-------------------");
		ArrayList<Double> doubleList= new ArrayList<Double>();
		doubleList.add(11.22);
		doubleList.add(100d);
		doubleList.add(100.0);
		
		System.out.println(doubleList);
		System.out.println(doubleList.size());
		
		System.out.println("----------ArrayList_String-------------------");
		
		ArrayList<String> empList=new ArrayList<String>();
		empList.add("Naveen");
		empList.add("Senthil");
		empList.add("Tom");
		empList.add("Peter");
		
		System.out.println(empList);
		System.out.println(empList.size());
		
		System.out.println("----FOR_EACH----");
		for(String e:empList) {
		System.out.println(e);
		}
		
		System.out.println("----------ArrayList_Object-------------------");
		// All type of Data: 
		
		ArrayList<Object> empDataList = new ArrayList<Object>();
		
		empDataList.add("Senthil");
		empDataList.add(30);
		empDataList.add(40);
		empDataList.add(34.44);
		empDataList.add('m');
		empDataList.add(true);
		
		System.out.println(empDataList);
		
		System.out.println(empDataList.size());
		System.out.println("----FOR_EACH----");
		for(Object e:empDataList) {
			System.out.println(e);
		}
		
	}

}
