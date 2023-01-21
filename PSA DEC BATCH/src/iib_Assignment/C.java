package iib_Assignment;

// if IIB , constructor and main so 1st....IIB is called then constructor then main

//public class C {
//		
//		{
//			System.out.println("from IIB");
//		}
//		
//		C()                                                
//		{
//			System.out.println("from constructor");
//		}
//
//		public static void main(String[] args) {
//			C c1 = new C();
//			System.out.println("from main");
//		}
//			
//
//}


public class C {
	
	{
		System.out.println("from IIB");
	}
	
	C()                                                
	{
		System.out.println("from constructor");
	}

	public static void main(String[] args) {
		System.out.println("start main");
		C c1 = new C();
		System.out.println("end main");
	}
		
}

                                    
                 /* o/p---- start main
                            from IIB
                            from constructor
                            end main */
//bcoz IIB and constructor are called after creating obj so after start bracket of main method start main will print
