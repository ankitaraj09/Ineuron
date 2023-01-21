package exceptionInjava;


                                //  program-1
//public class A {
//     public static void main(String[] args) {
//		int x=10;
//		int y=0;
//        int z=x/y;                       // exception, program execution stops here
//                                         //this is runtimeException  bcz show exception when we run not before that show  in console window
//		System.out.println("welcome");
//
//	}
//}



                                //  program-2
//public class A {
//public static void main(String[] args) {
//	                                      //for try block ctrl spacebar 
//	                                      //try block create one exception obj and give this obj to catch block , and this obj address stores in "e" 
//try {                            
//	int x=10;
//	int y=0;
//	int z=x/y;
//	System.out.println(1);               //not print 1 bcz this line in try block
//	
//} catch (Exception e) {                  //here Exception is a class or type 
//	// TODO: handle exception
//	System.out.println(e);               //this line not give obj address, it will print reason for exception but not show in which line exception occurs
//}                      
//System.out.println("welcome");
//
//}
//}



                                                //  program-3

public class A {
    public static void main(String[] args) {
		try {
			int x=10;
			int y=0;
	       int z=x/y;  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();                    // to know the reason os exception with exact line no. where exception occurred we use this instead of using System.out.println(e)
		}                     
		System.out.println("welcome");

	}
}
