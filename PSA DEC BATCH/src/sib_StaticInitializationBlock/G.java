package sib_StaticInitializationBlock;
// create obj inside SIB block and Main method ......execute line wise .....

public class G {
	static {
		System.out.println("SIB-2");                // 1st 
	}
	
	static {
		System.out.println("SIB-1");                 // 2nd 
		new G();                                     // due to obj IIB called then end of static block 
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {             // if main start so due to obj again IIB is called 
		new G(); 
		System.out.println("main");
		

	}

}
