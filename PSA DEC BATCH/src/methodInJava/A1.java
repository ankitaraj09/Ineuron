package methodInJava;

public class A1 {
	public static void main(String[] args) {
		A1 a = new A1();        // obj address store in reff var a if we not store address so after using one time we cant able to use obj again
		int X = a.anku();      // store returning value in var X and datatype of returning value is int ...for shotcut "ctrl 1" in reff var of method calling statement 
		System.out.println(X);
		
		}
	
	public int anku() {
		return 100;              // if method is not void then writing return value is mandatory
		                        // it transfer both control and value to the method calling statement
		
		
		
		}
	}

