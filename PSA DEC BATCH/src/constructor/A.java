package constructor;

public class A {
	                                //program-1
	
//	A(){                                        //constructor should have same name as that of class
//		System.out.println(200);
//		
//	}
//
//	public static void main(String[] args) {
//		A a =new A();                              //when we create obj constructor are automatically called
//		A b =new A();                             //no. of times we create object same no. of times constructors are being called 
//		A c =new A();
//		
//	}
//
//}
	
	                            //program-2
	
//	A(){                                    //noOfArgs=0
//		return 100;                        //show error :Void methods cannot return a value
//		                                 //constructors are internally permanently void can never return any value
//		                                 //dont need to write void , it is by default void if u write void A(){ ...so program not run
//	}
//	public static void main(String[] args) {
//		A a =new A();
//	}
//}
	
	
                                //program-3:bcz we cant return value in constructor so for print value we try args method        	
	

	 A(int i, String x, double d, boolean b, char c) {                ////noOfArgs=5
		 
		 System.out.println(x);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(i);
		 System.out.println(d);
		 return;                                        //no error bcz constr is internally void so we can use return keyword here
		                                                //dont write anything after return key..if write so error...bcz stmt unreachable
	}                           

	public static void main(String[] args) {
		A a =new A(300,"anju",2.3 , true,'c');
	}

}
