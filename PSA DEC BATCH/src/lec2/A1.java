package lec2;

//change the value of var in obj not affect the original non static var value...........here concept of xerox copy applicable

public class A1 {
	int X=10;

	public static void main(String[] args) {
		A1 a = new A1();
		a.X=20;                    // change only in refrence var a so it not affect other copy  b or manin X  value
		
		System.out.println(a.X);
		
		A1 b = new A1();
		System.out.print(b.X);         // not affect original value so print 10 ..........
		
		

	}

}


