package classesAndObjects;

public class User {

	String name;
	int age;
	String city;
	public static void main(String[] args) {
	
	User u1= new User();
	u1.name="Abhisek";
	u1.age=30;
	u1.city="Bangalore";
	
	User u2= new User();
	u2.name="Naveen";
	u2.age=30;
	u2.city="Bangalore";
	
	User u3= new User();
	u3.name="Senthil";
	u3.age=40;
	u3.city="Dharapuram";

	User u4= new User();
	u4.name="MSD";
	u4.age=43;
	u4.city="Mumbai";
	
	System.out.println(u1.name + " " +u1.age+" "+ u1.city); // A
	System.out.println(u2.name + " " +u2.age+" "+ u2.city); // N
	System.out.println(u3.name + " " +u3.age+" "+ u3.city); // S
	System.out.println(u4.name + " " +u4.age+" "+ u4.city); // M
	System.out.println("---------------------------------");
	u1=u2;
	System.out.println(u1.name + " " +u1.age+" "+ u1.city); // N
	System.out.println(u2.name + " " +u2.age+" "+ u2.city); // N
	System.out.println(u3.name + " " +u3.age+" "+ u3.city); // S
	System.out.println(u4.name + " " +u4.age+" "+ u4.city); // M
	
	System.out.println("---------------------------------");
	u2=u3;
	System.out.println(u1.name + " " +u1.age+" "+ u1.city); // N
	System.out.println(u2.name + " " +u2.age+" "+ u2.city); // S
	System.out.println(u3.name + " " +u3.age+" "+ u3.city); // S
	System.out.println(u4.name + " " +u4.age+" "+ u4.city); // M

	System.out.println("---------------------------------");
	u3=u4;
	System.out.println(u1.name + " " +u1.age+" "+ u1.city); // N 
	System.out.println(u2.name + " " +u2.age+" "+ u2.city); // S
	System.out.println(u3.name + " " +u3.age+" "+ u3.city); // M
	System.out.println(u4.name + " " +u4.age+" "+ u4.city); // M

	System.out.println("---------------------------------");
	u4=u1;
	System.out.println(u1.name + " " +u1.age+" "+ u1.city); // N
	System.out.println(u2.name + " " +u2.age+" "+ u2.city); // S
	System.out.println(u3.name + " " +u3.age+" "+ u3.city); // M
	System.out.println(u4.name + " " +u4.age+" "+ u4.city); // A
	
	}

}
