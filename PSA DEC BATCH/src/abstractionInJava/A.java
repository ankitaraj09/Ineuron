package abstractionInJava;
//hiding of implementation details is called  Abstraction. and we achieve this using using interface or abstraction class
//using abstract keyword we create incomplete method and incomplete class
//abstract class consist both complete and incomplete method 
//while creating incomplete method ....abstract keyword is opti0nal in----interface 
//                                                         mandatory in----abstract class

                            //program-1

//  public class A {
//	public void test() {
//		
//	}
//public void test1();           // error bcz normal class cant consist incomplete method
//
//	}


                           //program-2
//public class A {
//	public void test() {
//		
//	}
//abstract public void test1();           // error bcz normal class cant consist incomplete method using abstract keyword also
//                                        //only interface or abstract class
//}



                            //program--3

//abstract public class A {
//	public void test() {
//		
//	}
//public void test1();           // error bcz abstract class can consist incomplete method but it is mandatory to using abstract keyword
//                               //in interface optional
//}




                             //program --4

abstract public class A {
	public void test() {
		System.out.println("complete method");
		}
abstract public void test1();           // no error bcz abstract class can consist incomplete method but using abstract keyword

	}

