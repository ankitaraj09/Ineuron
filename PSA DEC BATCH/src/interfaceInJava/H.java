package interfaceInJava;
//if we inherit both class and interface in same class so first use extends then implements 
//here in class H only complete (modify ) incomplete method which inherit from interface but not complete method which inherit from class

public class H  extends G implements A,A1,A2 {

	public static void main(String[] args) {
		H h =new H();
		h.test();
		h.test1();
		h.test2();
		h.test7();             // call class method which inherit in class H not call from class G not show but test7method present in class H
		
	}

	@Override
	public void test2() {
		System.out.println(3);
		
	}

	@Override
	public void test() {
		System.out.println(2);
		
	}

	@Override
	public void test1() {
		System.out.println(1);
		
		
	}

}
