package methodInJava;

public class B2 {

	public static void main(String[] args) {
		B2 b = new B2();
		b.reusable();
		b.reusable();           //method helps us to reuses the code again and again we dont need to write code again
		b.reusable();
		
		}

	
	public void reusable() {
		System.out.println(1);
	}
}
