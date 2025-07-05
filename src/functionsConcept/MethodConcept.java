package functionsConcept;

import java.util.Arrays;

public class MethodConcept {
	
	// nested function is not possible in all programming language
	// call a function from another function 
	// no concept of nested function
	// functions are parallel to each other
	// a function can return only one value/entry at a time
	public void test() {

	}
	
	public int calcualteSalary(int baseSalary, int bonus, int tax, boolean isApplicable, int performanceBonus) {
		int finalSalary = baseSalary+bonus-tax;
		
		if(isApplicable) {
			finalSalary=finalSalary+performanceBonus;
		}
		return finalSalary;
	}
	
	public String[] getProductList() {
		String product[]= {"macbook","imac","sim","ipad"};
		return product;
	}
	
	
	public static void main(String[] args) {
		
		MethodConcept obj=new MethodConcept();
		
		int salary = obj.calcualteSalary(10000, 500, 5, true, 1000);
		System.out.println(salary);
		
		salary = obj.calcualteSalary(30000, 1000, 10, false, 0);
		System.out.println(salary);
		
		
		System.out.println("-----");
		
		String pr[]=obj.getProductList();
		System.out.println(pr.length);
		System.out.println(Arrays.toString(pr));
	}

}
