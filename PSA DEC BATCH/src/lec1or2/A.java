package lec1or2;

//twoObjHaveDiffAddress

public class A {

			public static void main(String[] args) {
				A a1 = new A();                                  
				System.out.println(a1);
				
				
				A a2 = new A();
				System.out.print(a2);
				
				}

}

		//new keyword send request to class and class  will create obj and new get the obj address and store that addrtess in refference variable
		//the new will created as many time as you use the new keyword
