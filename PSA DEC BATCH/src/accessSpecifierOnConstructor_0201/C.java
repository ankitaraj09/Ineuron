package accessSpecifierOnConstructor_0201;
///constructor is public so its object can be created in  same class , same package and in diff  package also .
// in diff package import is compulsory

public class C {
	public C() {
		System.out.println(1);
	}

	public static void main(String[] args) {
		C a1 = new C();
		

	}

}
