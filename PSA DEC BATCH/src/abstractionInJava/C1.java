package abstractionInJava;
//extends key bcz  abs class to normal class inheritance 
//we can create both static and non static method or var in abstract class but only able to call or access static member bcz without creating obj non static method or var  cant be called or accessed
//but using inheritance ....inherit abstract class in normal class and in normal class we able to create obj

public class C1 extends C {                                  //due to inheritance non static method or var inherit here so we can access here creating child class obj

	public static void main(String[] args) {
		C1 a=new C1();                                         //in inheritance create obj of child class
		a.test();                                                    
		System.out.println(a.z);

	}

}
