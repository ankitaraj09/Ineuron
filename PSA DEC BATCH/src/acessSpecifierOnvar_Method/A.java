package acessSpecifierOnvar_Method;
// method or var is private so it inly accessed in same class .....not in same package with subclass or non sub class or not in diff package

public class A {
	private int x=10;                    // make my var and method private 
	
	private void type() {               // create private method
		System.out.println(100);
	}

	public static void main(String[] args) {
		A a1 = new  A();
		System.out.println(a1.x);        // try to accessed private var in same class
		
		a1 . type();                     // calling private method in same class
		

	}

}
