package operatorSwitchcase_12lec;

public class AssignmentOperator {
	public static void main(String args[]) {
		int b =2; int a=10;
		b+=2;
		System.out.println(b);
		
		
		b*=3;
		System.out.println(b);           // not 6 bcoz value changes 2to 4
		
		
		b/=3;
		System.out.println(b);          // here  12/3
		
		
		a%=3;
		System.out.println(a);           //10/3 remainder is 1
	}

}
