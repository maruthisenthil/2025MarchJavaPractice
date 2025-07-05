package classConcept;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User();
		u1.name="Abhi";
		u1.age=24;
		u1.city="Mauthamalai";
		
		User u2 = new User();
		u2.name="SENTHIL";
		u2.age=40;
		u2.city="Dubai";

		User u3 = new User();
		u3.name="Revathy";
		u3.age=35;
		u3.city="LA";
		
		User u4 = new User();
		u4.name="Vani";
		u4.age=20;
		u4.city="Palladam";
		
		System.out.println(u1.name+"  "+u1.age+" "+ u1.city);
		System.out.println(u2.name+"  "+u2.age+" "+ u2.city);
		System.out.println(u3.name+"  "+u3.age+" "+ u3.city);
		System.out.println(u4.name+"  "+u4.age+" "+ u4.city);
		
		System.out.println("-----------------------------");
		
//		u1=u2;
//		
//		System.out.println(u1.name+"  "+u1.age+" "+ u1.city); // S
//		System.out.println(u2.name+"  "+u2.age+" "+ u2.city); // S
//		System.out.println(u3.name+"  "+u3.age+" "+ u3.city); // R
//		
//		System.out.println("-----------------------------");
//		
//		u2=u3;
//		
//		System.out.println(u1.name+"  "+u1.age+" "+ u1.city); // S
//		System.out.println(u2.name+"  "+u2.age+" "+ u2.city); // R
//		System.out.println(u3.name+"  "+u3.age+" "+ u3.city); // R
//		
//		System.out.println("-----------------------------");
//		
//		u3=u1;
//		
//		System.out.println(u1.name+"  "+u1.age+" "+ u1.city); // S
//		System.out.println(u2.name+"  "+u2.age+" "+ u2.city); // R
//		System.out.println(u3.name+"  "+u3.age+" "+ u3.city); // S
//		
//		System.out.println("-----------------------------");
//		
		
		u1=u2=u3=u4; // Always LHS breaks the connection first and RHS 
		
		System.out.println(u1.name+"  "+u1.age+" "+ u1.city); // S
		System.out.println(u2.name+"  "+u2.age+" "+ u2.city); // S
		System.out.println(u3.name+"  "+u3.age+" "+ u3.city); // S
		System.out.println(u4.name+"  "+u4.age+" "+ u4.city); //
		System.out.println("-----------------------------");
	}

}
