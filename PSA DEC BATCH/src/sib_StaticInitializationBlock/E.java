package sib_StaticInitializationBlock;

public class E {
	
		{
			System.out.println("IIB-1");
		}
		{
			System.out.println("IIB-2");
		}
		
		static
		{
			System.out.println("SIB-2");
		}
		static 
		{
			System.out.println("SIB-1");
		}
		
		E (){
			System.out.println("constuctor");
		}
		
		public static void main(String args []) {
			E d1 =new E();
			System.out.println("main");
		}

	}

	

