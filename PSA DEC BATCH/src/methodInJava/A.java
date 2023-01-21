package methodInJava;

public class A {

	public static void main(String[] args) {
		A a = new A();
		a.anku();                                 // method calling statement
		return;                     // not give error bcz main method is also a void method that means we can write return keyword   
		}
	
//	public void anku() {
//		return 100;                         so error bcz Void methods cannot return a value
//	}
	
	public void anku() {
		return;                          // we can use return keyword inside void method only it return control back to the method calling statement
		                                 // it is optional to use
//		System.out.println(1);         
		                                 //if we write anything after return keyword it give me error(Unreachable code) bcz 
				                        // due return key control back to the method calling statement and if we try to write anything that line is unreachable 
	}

}
