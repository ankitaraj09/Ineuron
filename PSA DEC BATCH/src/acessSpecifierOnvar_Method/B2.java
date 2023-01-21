package acessSpecifierOnvar_Method;
//same package non  sub class (no inherit)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              


public class B2 {
		 // do not create var or method bcz here we try to accessed default  var / or method of class C

		public static void main(String[] args) {
			C a = new C();                                 //non sub class so obj class C ki create krenge
			System.out.println(a.x);
			
			a.type();
			
			

		}

	}
