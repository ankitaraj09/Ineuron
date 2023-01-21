package pattern_programming;
//Instance initialization block----called when obj created----no of time obj created same no of time it iscalled----use to 
//initialize non static var in one place

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


public class A {
	{ 
		System.out.println("from IIB");
	}

	public static void main(String[] args) {
		A a1 =new A();                                  //  object is created so give output
	}

}

