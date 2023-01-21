package iib_Assignment;

//Instance initialization block----called when obj created----no of time obj created same no of time it iscalled----use to 
//initialize non static var in one place ----// we  can initialize both static and  non static var inside IIB 

//public class A {
//	{ 
//		System.out.println("from IIB");
//	}
//
//	public static void main(String[] args) {
//		// no object is created so no output
//	}
//
//}


//public class A {
//	{ 
//		System.out.println("from IIB");
//	}
//
//	public static void main(String[] args) {
//		A a1 =new A();                                  //  object is created so give output----from IIB
//	}
//
//}




public class A {
	{ 
		System.out.println("from IIB");
	}

	public static void main(String[] args) {
		A a1 =new A();                          //  object is created twice so give output----  from IIB
		A a2 =new A();                                                                        //  from IIB
		                                       // we create obj with same name of refference var a1 so it give error thats why reference var name should be different
	}

}

