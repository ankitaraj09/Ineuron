package methodInJava;

public class C {

//	public static void main(String[] args) {
//		C c1 =new C();
//	    c1.test();                                    //call test method
//		
//		}
//	
//	public void test() {
//		System.out.println(1);
//		C.test1();                                     // call test1 method 
//		
//	}
//
//	public static void test1() {
//		System.out.println(2);
//	}
//}
	
	
	public static void main(String[] args) {
		C c1 =new C();
	    c1.test();                            //here we call both method inside main method in above program not like this but both program give same o/p
	    C.test1();
		
		}
	
	public void test() {
		System.out.println(1);
		                                    
		}

	public static void test1() {
		System.out.println(2);
	}
}
