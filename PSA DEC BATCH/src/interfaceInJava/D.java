package interfaceInJava;
//use implements keyword bcz we inherit interface C1 in class D
//in class D we complete all incomplete method of interface C1
//this is not multiple inheritance 

public class D implements C1 {

	public static void main(String[] args) {
		D d = new D();                         //we create obj of class D bcz in inheritance we create obj of same class 
		d.test();
		d.test1();
		d.test4();
		d.test5();
		

	}

	@Override
	public void test4() {
		System.out.println("this is inherit from I C");
	}

	@Override
	public void test() {
		System.out.println("this is inherit from I A");
		
		
	}

	@Override
	public void test1() {
		System.out.println("this is inherit from I A");
		
		
	}

	@Override
	public void test5() {
		System.out.println("this is inherit from I C1");
		
	}

}
