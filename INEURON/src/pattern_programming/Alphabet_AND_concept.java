package pattern_programming;

// wwhich part i dont want i use for this && .....bcoz in this operartor if both condition  true then it execute the  statement

public class Alphabet_AND_concept {

	
		public static void main (String args[]) {
			int n=11;
			

			for(int i=0;i<n;i++)
			{
				
				// for "D"
				for(int j=0;j<n;j++)
				{
					if( (i==0 && j<n-1 )||  (i==n-1 && j<n-1 ) || (j==0 ) || (j==n-1 && i>0 && i<n-1 ))
						
//					if( (i==0 && j!=n-1 )||  (i==n-1 && j!=n-1 ) || (j==0 ) || (j==n-1 && i!=0 && i!=n-1 ))
							
					{
					System.out.print("*");
					}
					
					else
					{
						System.out.print(" ");
					}
				}
				
				
				 
				System.out.print("           ");                                    // this worked as give spaces between alpahabets
        //      System.out.println();                                               // this is not worked here to shift letters to next line 
			
			       
				// for "B" ......but not full we try half of square part
				for(int j=0;j<n;j++)
				{
					if(   j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2  || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1  )                           // if you dont give bracket on n-1 then that statement not execute
							
					{
					System.out.print("*");
					}
					
					else
					{
						System.out.print(" ");
					}
				}
				
				
				
				
				
				System.out.print("      ");                                           // this worked as give spaces between alpahabets
				
				
				
				  
				// for "I"
					for(int j=0;j<n;j++)
				{
					if(  j==(n-1)/2  || i==0 || i ==n-1  )           
							
					{
					System.out.print("*");
					}
					
					else
					{
						System.out.print(" ");
					}
				}
					
					
					
				System.out.print("     ");
				
				
				//for "H"
				for(int j=0;j<n;j++)
				{
					if(   j==0 || j==n-1 || i==(n-1)/2 )                          
							
					{
					System.out.print("*");
					}
					
					else
					{
						System.out.print(" ");
					}
				}
				
				
				
				
				System.out.print("       ");
				
				
				// for "P" .... In half part 
				for(int j=0;j<n;j++)
				{
					if(   j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2  || j==(n-1)/2 && i>0 && i<(n-1)/2  ) 
						                                                          // here u wont use i!= n-1/2
					{
					System.out.print("*");
					}
					
					else
					{
						System.out.print(" ");
					}
				}
				
				
				
				
				System.out.println();
			} 				
	}
}

