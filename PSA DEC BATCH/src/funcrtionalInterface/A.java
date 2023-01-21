package funcrtionalInterface;
//FunctionalInterface should contain exactly one incomplete method not more than or less than  one 
//in java 8 using default keyword we can create any no, of complete method inside functional interface but only one incomplete method.... before that in previous
//versions of java  no complete method are allowed in interface or in FunctionalInterface

                   //program-1
//@FunctionalInterface                  //F and I should be capital 
//public interface A {
//	                              // error bcz zero incomplete method
//
//}
   
//
//                            //program-2
//
//@FunctionalInterface                  
//public interface A {                          //error on A bcz two incomplete method
//	public void anshu();       
//	public void anshi();
//
//}




//                              //program-3
//
//@FunctionalInterface                  
//public interface A {                     //no error on A bcz exactly one incomplete method
//public void anshu();       
//
//}

                                //program-4

@FunctionalInterface                  
public interface A {                     //no error on A bcz exactly one incomplete method
public void anshu();                     //we complete this incomplete method in class through inheritance
default void anku() {
	System.out.println("complete method using default key");
}

default void sonu() {
	System.out.println("can create any no of complete method using default key");
}

}