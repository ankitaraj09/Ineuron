package pattern_programming;

public class Triangle {
	public static void main(String args[]) {

//		int n=11;
//		for(int i=0;i<n;i++)                                             // type of i declare krna compulsory
//		{
//			for(int j=0;j<n;j++)
//			{
//				
//				if((i==0) || j==0 ||(i==n-1) || (j==n-1) || i+j==(n-1)/2) ||  (i-j==(n-1)/2)  || (j-i==(n-1)/2)  ||   i+j== n-1+(n-1)/2 )
//				{
//				System.out.print("*");
//				}
//				else
//				{
//				System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
//
//	}
//
////}    i+j>=(n-1)/2 && j<=(n-1)/2 && i<=(n-1)/2||
//		i-j<=(n-1)/2 && i>=(n-1)/2  && j<=(n-1)/2||
//		j-i <=(n-1)/2 && j>=(n-1)/2 && i<=(n-1)/2
//		|| i+j <= n-1 + (n-1)/2 && i>(n-1)/2 && j>(n-1)/2
//		
//		int n=15;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				if( i+j==(n-1)/2   || i==(n-1) || i==0 || j==0 || j==(n-1) ||
//						i-j==(n-1)/2 ||
//						j-i ==(n-1)/2 
//						|| i+j == n-1 + (n-1)/2 
//						
//					    )
//				{
//				System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//	}
//
//}
		int n=11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i+j==(n/2) && i>0  && j>0  || i==(n-1) || i==0 || j==0 || j==(n-1) ||
						i-j==(n)/2  ||
						j-i ==(n)/2 
						|| i+j == n-1 + (n)/2 
						
					    )
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

