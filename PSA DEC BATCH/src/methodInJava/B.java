package methodInJava;

public class B {

	public static void main(String[] args) {
		B.anshu("haree krishna");
		B.goal(100,2.2,'b',true);   // if we use multiple args ..no of arg, type of args and order of args should match in calling stmt or in calling method
		}
		
	
    public static void anshu(String y) {    // in void method we cant use return val so we can print like this
    	System.out.println(y);
}
    
    public static void goal(int i, double d, char c, boolean b) {
    	System.out.println(i);
    	System.out.println(d);
    	System.out.println(c);
    	System.out.println(b);
    	
    }
}
