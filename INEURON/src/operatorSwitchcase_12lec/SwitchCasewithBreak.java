package operatorSwitchcase_12lec;
//if this case is true so this case or below this case all case are execute   to calibrate this we use break statement

public class SwitchCasewithBreak {
	
   public static void main(String[] args) {
		
		int num=100;
		
		switch(num) {
		
    case 10 : System.out.println("1st case");    
	
	case 100 :System.out.println("2nd case");
	break;                                                // only matchind condition is execute not below cases are executes due to break bcoz break
	case 8 : System.out.println("3rd case");              // bcoz break push to the cursor outside switch boundary after switch boundary statement will execute
		
	}
		System.out.println("Ankita");
   }
}


