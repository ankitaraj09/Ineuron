package abstractionInJava;

public class D1 extends D{                   //D has incomplete method so error bcz normal class cant contain incomplete method so we complete in class D1 

	public static void main(String[] args) {
		D1 d=new D1();
		d.test();

	}

	@Override                                   //we complete incomplete method of class D which inherit in class D1
	public void test() {
		System.out.println(" complete  incomplete method that means modify");
		
	}

}
