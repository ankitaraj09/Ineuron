package funcrtionalInterface;
//we complete incomplete method of FunctionalInterface in class through inheritance
//without using Lambda expression 

public class A1 implements A {                                   // all non static member of interface inherit here

	@Override                                           //we modify inherited incomplete method to complete method
	public void anshu() {

		System.out.println("incomplete method of interface complete here");
	}

	public static void main(String[] args) { 
		A1 a = new A1();                                        // create obj of child class
		a.anshu();
		a.anku();
		a.sonu();

	}

}
