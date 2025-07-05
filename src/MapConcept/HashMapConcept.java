package MapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		// Key-Value pair: hashmap
		// no order of insertion is maintained
		// In generics only non-primitive classes are available in the Generics section
		// One null key but n number of null values are allowed
		// key = null always on top in the order, 
		// in case of more duplicate key only last duplicate considered, same rule applies to duplicate null key  
		// duplicates not allowed if user enter duplicates Map will maintain the last duplicate key and value ..   
		//Order not maintained
		
		// Memory management: 
		// for each map object 16 VC[Virtual Segments/ Virtual nodes] created
		
		// name:macbook
		// brand:app
		// stock:instock 
		// price:1000
		// available:true
		
		HashMap<String,Object> dataMap = new HashMap<String, Object>();
		
		dataMap.put("name", "Macbook");
		dataMap.put("brand", "apple");
		dataMap.put("stock", "instock");
		dataMap.put("price", 1000);
		dataMap.put("available", true);
		
		System.out.println(dataMap);
		
		String v1 = (String) dataMap.get("name");
		System.out.println(v1);
		
//		int v2 = Integer.parseInt((String)dataMap.get("price")); works for String data
		int v2 = (Integer) dataMap.get("price");

		System.out.println(v2);
		
		boolean v3= (Boolean) dataMap.get("available");
		System.out.println(v3);
		
		HashMap<String,Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("Apple", 90);
		studentMap.put("Orange", 40);
		studentMap.put("Blue", 50);
		studentMap.put("Pink", 80);
		studentMap.put("Orange", 100);
		studentMap.put(null, 100);
		studentMap.put(null, 10);
		studentMap.put(null, null);
		studentMap.put("Senthil", null);
		studentMap.put("Revathi", null);
		studentMap.put("Sonali", null);
		
		System.out.println(studentMap.get("Pink"));
		System.out.println(studentMap.get("Naveen")); // null
		System.out.println(studentMap.get("Orange"));
		System.out.println(studentMap.get(null));
		System.out.println(studentMap.get("Senthil"));
		System.out.println(studentMap.get("Sonali"));
		System.out.println(studentMap.get("Revathi"));
		System.out.println("-----------------------------");
		System.out.println(studentMap);
		
		HashMap<String, String> empData = new HashMap<String, String>();
		empData.put("Senthil", "Manager");
		empData.put("Naveen","Scientist");
		empData.put("Revathy","Admin");
		System.out.println(empData);
		System.out.println("-----------------------------");
//		HashMap<String,Integer> userMap = new HashMap<String, Integer>();
//		userMap.put("Senthil", 100);
//		userMap.put("Revathy", 200);
//		userMap.put("Ravi", 100);
//		userMap.put("Swetha", 100);
//		userMap.put(null, 10);
//		userMap.put("Senthil", 100);
//		
//		System.out.println(userMap);
//		
//		System.out.println("-----------------------------");
		
		// LinkedHashMap
		// Maintain the Insertion Order and rest are same like HashMap
		
		LinkedHashMap<String,Integer> userMap1 = new LinkedHashMap<String, Integer>();
		
		userMap1.put("Senthil", 100);
		userMap1.put("Revathy", 200);
		userMap1.put("Ravi", 100);
		userMap1.put("Swetha", 100);
		userMap1.put(null, 10);
		userMap1.put("Senthil", 100);
		
		userMap1.put(null, 200);
		userMap1.put(null, 100);
		System.out.println(userMap1);
	
		
		//TreeMap
		// it maintains the sorting for the Keys and the order is Ascending order
		// key Cannot be null in TreeMap
		
		TreeMap<String,Integer> userMap = new TreeMap<String, Integer>();
		userMap.put("Zaheer", 100);
		userMap.put("Senthil", 10);
		userMap.put("Revathy", 200);
		userMap.put("Ravi", 100);
		userMap.put("Swetha", 100);
		userMap.put("Abhisheik", 100);
		userMap.put("Manoj", null);
		userMap.put("Senthil", 90);
//		userMap.put(null, 200);
//		userMap.put(null, 100);
		System.out.println(userMap.size());
		
		System.out.println(userMap);
		
		// Top Casting Advantage - will help in Type casting and no need to create multiple references 
		
		Map<String, Integer> myMap=new HashMap<String, Integer>();
		myMap = new LinkedHashMap<String, Integer>();
		myMap = new TreeMap<String, Integer>();
		
		
	}

}
