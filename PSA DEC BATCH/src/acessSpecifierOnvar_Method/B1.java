package acessSpecifierOnvar_Method;
// same package sub class (inheritance)

public class B1 extends C{
	 // do not create var or method bcz here we try to accessed default  var / or method of class C

	public static void main(String[] args) {
		B1 a = new B1();                                 // sub class so obj esi class ki create krenge
		System.out.println(a.x);
		
		a.type();
		
		

	}

}
