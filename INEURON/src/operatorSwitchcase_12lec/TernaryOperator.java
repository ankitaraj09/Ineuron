package operatorSwitchcase_12lec;

public class TernaryOperator {

	public static void main(String[] args) {
//		int a=10 ; int b=20;
//		
//		int c = (a>b)? a : b;
//		System.out.println(c);

		
		int a=100; int b= 20; int c =80;               // for cheaking least number
		
		int res=(a<b)?  (a<c? a : c) : (b<c? b: c);
		System.out.println(res);
	}

}
