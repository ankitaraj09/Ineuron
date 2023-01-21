package interfaceInJava;
//interface only consist incomplete (abstract method )method.
//incomplete means method body are not present 

             //     program-1
//public interface A {
//	public void test() {           //error bcz complete method
//		
//	}
//}

                //program-2
public interface A {
	public void test() ;                  //no error bcz incomplete method
	public void test1();               //write void is mandatory otherwise give error bcz incomplete method so no body and no return anything
		
	}


                        