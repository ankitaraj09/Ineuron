package exceptionInjava;
//Types of exceptions


                                         //Program -1 
//import java.io.FileReader;
//
//public class B {
//
//	public static void main(String[] args) {
//		FileReader fr=new FileReader("G://test.txt");    
//		                                                 //Unhandled exception type FileNotFoundException
//                                          //show exception before run means exception occurred when .java file converted into  .class file ,it is call compileTime or checked exception
//	}
//
//}
    



                                       //Program -2

public class B {

public static void main(String[] args) {
      int x=10/0;    
               //show exception after run(in console window) means exception occurred when we run .class file ,it is call RunTime or unchecked exception
      System.out.println(x);
    }
}