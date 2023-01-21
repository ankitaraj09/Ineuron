package sib_StaticInitializationBlock;

// multiple SIBs ....so in program which SIB  written first ....that SIB are called first ....then 2nd SIB ...then after ending bracket of SIB block main method start 

public class C {
	
	static {
		System.out.println("SIB-2");
	}
	
	static {
		System.out.println("SIB-1");
	}

	public static void main(String[] args) {
		System.out.println("main");
		
	}

}
