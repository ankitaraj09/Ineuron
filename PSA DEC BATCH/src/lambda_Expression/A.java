package lambda_Expression;

@FunctionalInterface
public interface A {
	public void anshu(int x , String y);

	default void anku(char x, float g) {
		System.out.println(x);
		System.out.println(g);
	}

	default void sonu() {
		System.out.println("can create any no of complete method using default key");
	}

}
