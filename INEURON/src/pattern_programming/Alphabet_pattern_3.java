package pattern_programming;

public class Alphabet_pattern_3 {

	public static void main(String[] args) {
		

			int n=11;
			
			// for box outline 
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if( i==0 || i==n-1 || j==0 || j==n-1 )
							
					{
					System.out.print("*");
					}
					
					else
					{
						System.out.print(" ");
					}
				}
				
				
				 
				System.out.print("           ");    // this worked as give spaces between alpahabets
        //      System.out.println();               // this is not worked here to shift letters to next line 
			
			
				for(int j=0;j<n;j++)
				{
					if(  i==(n-1)/2  || j==0 || j==n-1 )           // if you dont give bracket on n-1 then that statement not execute
							
					{
					System.out.print("*");
					}
					
					else
					{
						System.out.print(" ");
					}
				}
				
				
				
				
				
				System.out.print("      ");                                           // this worked as give spaces between alpahabets
				
				
				
				  
				
					for(int j=0;j<n;j++)
				{
					if(  j==(n-1)/2  || i==0  )           
							
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
