package test;

public class A1 implements A{

	public static void main(String[] args) {
		A1 a=new A1();
		a.anku(200,3.334f,'d',true);
		a.samir("i miss you");

	}

	@Override
	public void anku(int x,float y,char z, boolean b) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(b);
		
	}

}
