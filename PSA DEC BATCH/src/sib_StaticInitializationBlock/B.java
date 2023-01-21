package sib_StaticInitializationBlock;

//public class B {
//	static int k ;           // static var created outside method inside class ....and it is blue colour with italic style
//	
//		static {                   //if we created static var inside method  or SIB it will give error
//			int k=200;                   // we initialize(value dena ) static var inside SIB ...
//			System.out.println(k);       // if we use "" so o/p is K not 200
//		}
//
//		public static void main(String[] args) {
//			System.out.println("main");
//		
//	     }
//
//	}

                                   // o/p--- 200
                                   //        main
                                   // bcoz  1st SIB execute then main method



//public class B {
//	 int k ;               
//	
//		static { 
//			
//			 k=200;                    we  can not initialize(value dena )non  static var inside SIB ...
//			                           so give error
//			      
//		}                          
//
//		public static void main(String[] args) {
//			System.out.println("main");
//		 }
//}



//public class B {
//	 int k ;               
//	
//		static { 
//			
//			 k=200;                   // we  can not initialize(value dena )non  static var inside SIB ...
//			 System.out.println(k);
//			                          // so give error
//			      
//		}                          
//
//		public static void main(String[] args) {
//			System.out.println("main");
//		 }
//}



public class B {
	 int k ;               
	
		static { 
			
			int k=200;                 // we  can not initialize(value dena )non  static var inside SIB ...
			System.out.println(k);     // so give error but --if we write--- int k=200; so it can autocorrect and give o/p...but it is wrong approch
			      
		}                          

		public static void main(String[] args) {
			System.out.println("main");
		 }
}



