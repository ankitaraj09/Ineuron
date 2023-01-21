package accessSpecifierOnConstructor_0201;
// construcctor is private so its object cant be created outside the class

public class A {
	private A() {
		System.out.println(1);
		
	}

 public static void main (String [] args) {    // main method inside class 
	 A a1 = new A();
 }
} 
