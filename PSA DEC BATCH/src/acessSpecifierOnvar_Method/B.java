package acessSpecifierOnvar_Method;
//method or var is default so it inly accessed in same class,same package with subclass or non sub class but not in diff package


public class B {
	
        int x=10;                    // make my var and method default not need to write default 
		
		void type() {                  // create default method
			System.out.println(100);
		}

		public static void main(String[] args) {
			B a1 = new  B();                  // create obj bcz not static var ot method --so 1st create obj then call method
			System.out.println(a1.x);        // try to accessed default var in same class
			
			a1 . type();                     // calling default method in same class
			

		}

	}
