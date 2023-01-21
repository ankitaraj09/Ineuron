package constructorOverloading;
//in ~ we create more than one constructor inside same class , provided 1)diff no of args 2)diff type of args 3) diff order of datatype 

public class A {
	A(){
	System.out.println(1);	
	}
	
	A(int x){
		System.out.println(x);
		}

	A(float y){
		System.out.println(y);
	}
	A(float z,String a){
		System.out.println(z);
		System.out.println(a);
	}
	
	A( String a, float z){
		System.out.println(a);
		System.out.println(z);
		}
	
	public static void main(String[] args) {
		A a =new A();
		A b =new A(100);
		A c =new A(2.2f,"mike");
		A d =new A("mike",2.6f);
		A e =new A(3.445f);
		

	}

}
