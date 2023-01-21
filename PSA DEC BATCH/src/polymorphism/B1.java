package polymorphism;


public class B1 extends B {  //here we inherit 2  methods created in class B  
	
	public void test2() {           // we create same signature method of class B and modify one method, do not need to modify both method for polymorphism , u cant modify any one  method which u want 
		System.out.println(1000);       // modify test2 200 to 1000
	}
	
	

	public static void main(String[] args) {
		B1 a =new B1();                            // obj of child class so it call only method inside child class
		a.test2();                                 
		
		a.test1();                               // o/p 100 bcz due to inheritance test1 annd test2 both method in class B1 but we modify only one 
		a.test2();                               // 1000 bcz it is after child class obj and reference varr of child class
		
		B b =new B();                           //  we create obj  of parent class and store in reff var  b 
		b.test2();                             // call through refff var of  parent class so it print inside parent class which value print 
		
		
		

	}

}
