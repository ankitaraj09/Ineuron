package pattern_programming;
import java.util.Scanner;

public class Z {
	


		public static void main(String[] args)
		{
		  Scanner scan =new Scanner(System.in);
		  
		  int [][][] hyder=new int[2][2][];
		hyder  [0][0] = new int [2];
		hyder  [0][1] = new int [3];
		hyder  [1][0] = new int [4];
		hyder  [1][1] = new int [2];
		  
		  
		  for(int i=0;i<hyder.length;i++)
		  {
			  for(int j=0; j<hyder[i].length;j++)
			  {
				  for(int k=0;k<hyder[i][j].length;k++)
				  {
					  System.out.println("Enter marks of College "+ i+ " Class "+ j + " Student "+k);
					  hyder[i][j][k]=scan.nextInt();
				  }
			  }
		  }
		  System.out.println("Marks stored are as follows");
		  for(int i=0;i<hyder.length;i++)
		  {
			  for(int j=0; j<hyder[i].length;j++)
			  {
				  for(int k=0;k<hyder[i][j].length;k++)
				  {
					  System.out.print(hyder[i][j][k] +" ");
				  }
				  System.out.println();
			  }
		  }

		}

	}

