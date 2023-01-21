package test;
@FunctionalInterface
public interface A {
	public void anku(int x,float y,char z, boolean b);
	
	default void samir(String y) {
		System.out.println(y);
	}

}
