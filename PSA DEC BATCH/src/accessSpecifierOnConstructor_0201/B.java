package accessSpecifierOnConstructor_0201;
//constructor is default so its object can be created in  same class , same package but not outside pacckage .
// same in case of protected constructor

public class B {
	B(){
		System.out.println(1);
	}

	public static void main(String[] args) {
		B b1 = new B();
		

	}

}
