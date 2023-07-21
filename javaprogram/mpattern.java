package hackerrank;

public class mpattern 
{
	public static void main (String args[])
	{
		int n =5;
		
		for(int x=0;x<n;x++)
		{
			for(int y=0;y<n;y++)
			{
				System.out.print(" ");
				if(y==0 || y==4 || (x==1 && y==1) || (x==1 &&y==3) || (x==2 && y==2)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");

		}
	}
	
}
