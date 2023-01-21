package sib_StaticInitializationBlock;
// obj create in SIB

public class F {
	{
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}
	
	static
	{
		new F();                                              // obj created with new keyword
		System.out.println("SIB-2");
	}
	static 
	{
		System.out.println("SIB-1");
	}
	
	F (){
		System.out.println("constuctor");
	}
	
	public static void main(String args []) {

		System.out.println("main");
	}

}


// 1st SIB block execute then due to creating obj ....IIB-1 called then IIB-2 called then constructor called then SIB-2 print (bcoz phle in program)
//then SIB-1 then main method start and main print
