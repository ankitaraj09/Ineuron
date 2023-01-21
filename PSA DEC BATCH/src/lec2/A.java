package lec2;

//NON Static member

public class A {
	int X = 10;                 // this is non static variable bcz not static word use here and non static memeber are created inside class but outside main method    

	public static void main(String[] args) {
		
		A b1 = new A();       //  create new object with the help of new keyword and store in refference variable b1
		A b2 = new A();
		A b3 = new A();
		
		System.out.println(b1.X);      // b1.x ---go to obj ....inter in obj ......give X 
		System.out.println(b2.X);      // jitni baar new key use krenge utni baar obj create hoga but usko ek diff refference variavle me store krenge
		System.out.print(b3.X);      // adress . give variable
		
		
		

	}

}


//in above program in line 9 if we not create obj and direct print so it will give error
//in non static memeber -----obj creation is must before printing





