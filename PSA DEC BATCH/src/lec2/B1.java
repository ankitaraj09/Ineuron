package lec2;
//change the value of var affect the original static var value  ,...........here concept of xerox  not applicable
//here static var stores in commom class memory if chnge var value main var affect 


public class B1 {
	static  int Y =10;

	public static void main(String[] args) {
		
		System.out.println(B1.Y);
		
		B1.Y= 10000;                 // here store in commom place so original var vale change ...in non static store in diff refrrence var so original value not changes
		
		System.out.print(B1.Y);       
		

	}

}
