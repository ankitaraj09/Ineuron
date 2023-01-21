package sib_StaticInitializationBlock;

//SIB are created inside class with static keyword---and executed before main method---it runs only once ---no need to create obj 

//public class A {
//	static {
//		System.out.println("SIB");
//	}
//
//	public static void main(String[] args) {
//	
//     }
//
//}
                     // give o/p= SIB ---bcz no need to create obj in SIB



public class A {
	static {
		System.out.println("SIB");
	}

	public static void main(String[] args) {
		System.out.println("main");
	
     }

}


//                o/p --  SIB
//                        main 
// bcoz SIB executes before main method
