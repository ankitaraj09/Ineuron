package constructor;
// never use void or datatype while creating constructor if u do that so it is not a constructor it become a method 
//and without calling method not run but constructor run automatically after creating obj
  
                                 // program-1
//public class B {
//	
//	void B(){                            //use void so it become method 
//		System.out.println(1);
//		}
//
//	public static void main(String[] args) {
//		B b = new B();                          //no o/p bcz method not run till then it is not called
//		
//
//	}
//
//}

                             //program-2

public class B {
	
	void B(){                            
		System.out.println(1);
		}

	public static void main(String[] args) {
		B b = new B();                          
		b.B();                                  //calling ....and B.. compiler take it here method name
		

	}

}


