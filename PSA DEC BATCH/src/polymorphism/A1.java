package polymorphism;
//A1 is child class, here we inherit non static method public void test from parent class with same signature.
// annd modify its value 100 to 500

public class A1 extends A {
	
	public void  test() {
		System.out.println(500);
	}

	public static void main(String[] args) {          // inside main method  we create obj and call foe non static method
		
		A1 a= new A1();                          // here we create obj of child class 
		a.test();                                // call non static method: refferance var . method name();        
		

	}

}
