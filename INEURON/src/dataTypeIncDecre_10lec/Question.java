package dataTypeIncDecre_10lec;

public class Question {

	public static void main(String[] args) {
//		int a=10 ; int b=20;     // 
//		byte c =(a>b)? 30:40 ;   // literal nhi var are involve in operation so compiler not perform operation it cheak typeof result ...mension it  a and b is int and store in byte so it give error
//		byte d =(a<b)? 30:40 ;  
//				System.out.println(c);           // error
//				System.out.println(d);          //error
		
		
		
		
		
		byte c =(10>20)? 30:40 ;           //literals are involved so compiler perform operartion  and compiler knoe it is byte 
		byte d =(10<20)? 30:40 ;           // byte d=30 ; // byte 30 store in byte
				System.out.println(c);      // in above phle hi int bol diya hai esliye error
				System.out.println(d);

	}

}
