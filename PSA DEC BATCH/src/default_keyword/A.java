 package default_keyword;
 //in java 8 using default keyword we can create any no, of complete method inside functional interface but only one incomplete method.... before that in previous
//versions of java  no complete method are allowed in interface or in FunctionalInterface
//using default keyword we can add main method interface and can run like a class in previous version it is not allowed
 // we can able to create complete static method ---but till now incomplete static method is not allowed
 
public interface A {
	int x=10;                        //look like non static but static and final by default in interface
public static void anki() {
	System.out.println(A.x);           // static member has global access so use anywhere in the program
}

public static void main(String[] args) {
	System.out.println(A.x);
	A.anki();
}
}
