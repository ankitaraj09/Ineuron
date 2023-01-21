package interfaceInJava;
//we use implement keyword bcz we inherit interface A in class B 
// if we try to inherit class B in interface A ...so it is not possible
// class-class   or interface-interface inheritance using extends keyword


public class B implements A{               // ctrl 1 on B so auto complete

	@Override                            //  this cheak modification off parent interface done or not
	public void test() {                 //here we complete incomplete method which i get through inheritance
		System.out.println(200);
		
	}
	
	public static void main(String[] args) {
		B b1 =new B();                           //creating obj for non static method 
		b1.test();                               //calling non static method
		b1.test1();
	}

	@Override           
	public void test1() {                    //compliting another incomplete method
		System.out.println(100);
		
		}

}
