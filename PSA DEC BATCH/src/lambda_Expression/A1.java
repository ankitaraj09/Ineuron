package lambda_Expression;
//Lambda expression reduces the line of code in java , only applied on functional  interface 
//no need to create obj, implement ,and overriding
//it makes code less readable

//with using Lambda expression 

                      //program -1
//public class A1{
//	public static void main(String[] args) {                 //l-1
//		A a =(int c ,String b)->System.out.println(c);     //L-3 ---if one stmt under body so no need of bracket
//		a.anshu(200, "goal");                               //l-2
//	}


                                      //program -2

public class A1 {                                    //in Lambda expression no need to write implements

	public static void main(String[] args) {
		A a=(int c , String b)-> {                //L-3 // () this is bracket of method when calling then executes body  
			                                          //inside arg write type of incomplete method not complete method  like overriding bcz here no need to write
			                                          //no need to create obj only a reff var for calling
			System.out.println(c);                        //here no create obj of child class ....bcz no implement key so like non subclass write parent class A ...that is not called obj creation
			System.out.println(b);
		};
		a.anku('c', 2.33f);                         //l-1
		a.anshu(100, "goal");                       //l-2
		a.sonu();
		

	}                                            //end of main method
}

