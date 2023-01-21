package polymorphism;
//child class C

public class C extends A {
 //@Override                      // here O should be capital otherwise it will shoe error at @override
	                              // @override for check whether overriding is happening or note
	                              // if uncomment overrride so it will show error at test1()--bcz test1 is not override means not same signature with parent class A 
	                              // here not overriding done 
	public void test1() {
		System.out.println(500);
		}

	public static void main(String[] args) {
		C c1 = new C();
		c1.test();             //o/p 100 bcz after inherit class A test method also in child class c and when w call it print 100 bcz test is not modify in class c 
		
        c1.test1();            // 500
	}

}
