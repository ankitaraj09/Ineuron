package methodInJava;
//multiple single datatype values and  single var in method args

public class B1 {
	public static void main(String[] args) {
		B1.goal(10,20,30,40); 
	}
	
	

    
    public static void goal(int... i) {    //3 dots after int
    	System.out.println(i[0]);
    	System.out.println(i[1]);
    	System.out.println(i[2]);
    	System.out.println(i[3]);
    	
    }
}
