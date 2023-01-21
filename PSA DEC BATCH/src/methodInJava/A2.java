package methodInJava;

public class A2 {
	
	
	public static void main(String[] args) {
		
		double X = A2.anku();      // store returning value in var X and datatype of returning value is double  ...for shotcut "ctrl 1" in reff var of method calling statement 
		                         // do not create obj bcz static method
		boolean val = A2. soni();   // store return value in val variable
		                            // static so no obj direct call using class
		System.out.println(X);
		System.out.println(val);
		}
	
	public static double anku() {         // static method return type double by default not write float
		return 5.5 ; 
	}
	
	public static boolean soni() {
		return true;
	}

}
