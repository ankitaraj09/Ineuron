package iib_Assignment;
// mutiple IIBs---so in program which IIB  written first ....that IIB are called first ....then 2nd IIB ...then constructor

public class D {
	{
		System.out.println("IIB-2");
	}
	
	D(){
		System.out.println("constructor");
	}
	{
		System.out.println("IIB-1");
	}

	public static void main(String[] args) {
		D d1 =new D();
		
		
	}

}
