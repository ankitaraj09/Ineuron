package iib_Assignment;


// creating one constructor with IIB and cheak which is called first
//public class B {
//	
//	{
//		System.out.println("from IIB");
//	}
//	
//	B()                                               // constructor created with same class name 
//	{
//		System.out.println("from constructor");
//	}
//
//	public static void main(String[] args) {
//		B b1 = new B();                                  // obj created with same class name and dont give (B.b1) this give error
//		
//    }                                                     
//
//}
                                        // o/p ---- 1st IIB then constructor is called 

public class B {
	
	{
		System.out.println("from IIB");
	}
	
	B()                                                
	{
		System.out.println("from constructor");
	}

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		
		                  //  two obj created  so o/p---- 1st obj call IIB then constructor then 2nd obj call IIB then constructor
                         //		from IIB
                         //		from constructor
                         //		from IIB
                        //		from constructor

		
    }                                                     

}
