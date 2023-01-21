package abstractionInJava;



                                   //program--1

//abstract public class B{
//	public static void main(String args[]) {
//		B b1=new B();                                     //error bcz obj of abstract class can't be created
//	}
//}
       


                                 //program--2
//we can create both static and non static members in abstract class but only able to access static member bcz without creating obj non static members cant be accessed 
//but using inheritance ....inherit abstract class in normal class we can access non static memeber 

//abstract public class B{
//	int x=10;
//	static int y=20;
//public static void main(String args[]) {
//	System.out.println(B.y);                                   //for static member no need to create obj direct access
//          //  System.out.println(a1.X);                       //error bcz obj of abstract class can't be created and we not able to access non static member
//}
//}




                                              //program--3
//we can create both static and non static method in abstract class but only able to call static member bcz without creating obj non static method cant be called
//but using inheritance ....inherit abstract class in normal class we can called non static method 

abstract public class B{
public void test() {
	System.out.println(1);
}
public static void test1() {
	System.out.println("static method");
}
public static void main(String args[]) {
	B.test1();                                            //for static member no need to create obj direct call
      //b1.test1();                    //error bcz obj of abstract class can't be created and we not able to call non static method
  }
}
