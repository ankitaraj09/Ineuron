package pattern_programming;

public class IfElseOutlinePattern {
	public static void main (String args[]) {
		int n=5;
		
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
			System.out.println();
		} 
		
		
System.out.println();                                       // this line for after one alphabet next line
         // for "H"
		
		for(int i=0;i<n;i++)
		{
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
			System.out.println();
		} 
		
		
System.out.println();
                // for "T"
		
		for(int i=0;i<n;i++)
		{
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
		
System.out.println();

                               // for "E"
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(  i==(n-1)/2  || i==0 || i==n-1 || j==0 )           
						
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

