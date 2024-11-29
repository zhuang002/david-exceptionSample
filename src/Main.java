import java.util.Scanner;


/***
 * a static method is a method that can be access through class name. It exists before the existence of any object.
 * Thus, it can only access static properties which also exist before any object.
 * 
 * static properties are members of a class which can be accessed through class name. they exist before any objects
 * are newed. And a static property of all objects share the same memory space.
 * 
 */
public class Main {

	
	
	public static void main(String[] args) {
		staticMemberSample();
		
		
		//sc = new Scanner(System.in);
		//sample1();

	}

	private static void staticMemberSample() {
		Human.staticMethod();  // you can access the static method through the class name, before any objects are newed.
		
		Human david = new Human(); // you new an object. 
		david.name = "David";  // set an instance property
		david.gender = 'M';  // set an instance property
		
		Human hz = new Human();   // new another object
		hz.name = "Huang Zheng"; // set an instance property
		hz.gender = 'F'; // set an instance property
		
		david.info();  // call an instance method.
		hz.info();  // call an instance method.
		
		david.sharedNumber = 2; // set a static property
		david.info(); // you will see the static  property is changed.
		hz.info(); // you will see the static property is also changed because the share the
						// same memory space.
		
		Human.sharedNumber = 3; // you can set a static property through the class, rather
									// than use an object.
		david.info();		// the static property value is changed for all objects.
		hz.info();
		
		Human.staticMethod();
		
		
	}

	private static void sample1() {
		double a = 10;
		double b = 0;
		double c = a/b;
		System.out.println(c);
		
	}

}

class Human {
	String name = null;  // this is an instance property
	char gender = 'M';   // this is an instance property
	static int sharedNumber = 1; // this is a static perperty which is shared by all objects.
	
	public void info() {
		System.out.println(this.name + ","+ this.gender +"," + sharedNumber);
		/**
		 * you can access the instance property using "this". But for static property,
		 * "this" does not have any sense. 
		 */
		
	}
	
	public static void staticMethod() { // this is a static method.
		System.out.println(sharedNumber);
		/**
		 * a static method can only access static properties. You cannot use "this" to
		 * refer to a  instance property because "this" object may have not yet been newed. 
		 */
	}
}
