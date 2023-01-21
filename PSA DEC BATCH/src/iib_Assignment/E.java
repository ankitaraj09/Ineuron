package iib_Assignment;

//public class E {
//	int j;                                    // non static var created outside method but inside class
//	
//		{
//			j=100;                           // we  can initialize non static var inside IIB                  
//			System.out.println(j);           // o/p-100
//		}
//		
//		
//		public static void main(String[] args) {
//			
//			E e1 = new E();
//	
//		}
//			
//	}

public class E {
	static int j;                                    // static var created outside method but inside class
	
		{
			j=100;                           // we  can initialize both static and  non static var inside IIB                  
			System.out.println(j);           // o/p-100
		}
		
		
		public static void main(String[] args) {
			
			E e1 = new E();                  // brown local var e1 and this var are created inside method and use in inside same method where it is created 
	
		}
			
	}


	
		

	