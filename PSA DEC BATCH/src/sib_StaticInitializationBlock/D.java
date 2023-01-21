package sib_StaticInitializationBlock;

//public class D {
//	{
//		System.out.println("IIB");
//	}
//	
//	static
//	{
//		System.out.println("SIB");
//	}
//	
//	D(){
//		System.out.println("constuctor");
//	}
//	
//	public static void main(String args []) {
//		D d1 =new D();
//		System.out.println("main");
//	}
//
//}

//      o/p---SIB
//             IIB
//             constuctor
//             main
// Sib execute before main method then after ending bracket of SIB ...main method start then after creating obj --IIB called
//then constructor called then main bcoz after obj 



public class D {
	{
		System.out.println("IIB");
	}
	
	static
	{
		System.out.println("SIB");
	}
	
	D(){
		System.out.println("constuctor");
	}
	
	public static void main(String args []) {
		System.out.println("main");
		D d1 =new D();
	}

}





/*SIB
main
IIB
constuctor*/

//  bcoz after SIB ---in method  first print main then obj create then call IIB then Constructor

