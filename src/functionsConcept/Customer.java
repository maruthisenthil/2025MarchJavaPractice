package functionsConcept;

import java.util.ArrayList;

public class Customer {
	
	
	
	
	public ArrayList<String> getProductList(String name) {
		System.out.println("getting the product list for customer: "+name);
		
		ArrayList<String> productList = new ArrayList<String>(); // pc:10, vc=10;
		
		if(name.equals("ramya")) {
			productList.add("MacBookPro");
			productList.add("iPhone");
			productList.add("iMac");
		}
		else if(name.equals("Senthil")) {
			productList.add("MacBookPro");
			productList.add("Samsung");
		}
		else if(name.equals("Ramu")) {
			productList.add("Motoroola");
		}else {
			System.out.println("cutomer not found");
		}
		
		return productList;
	}

	public static void main(String[] args) {
		Customer c1=new Customer();
		ArrayList<String> prList=c1.getProductList("Senthi");
		System.out.println(prList);
		System.out.println(prList.size());

	}

}
