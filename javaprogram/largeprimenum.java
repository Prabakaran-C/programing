package basicks;
import java.util.*;

public class largeprimenum {
	public static void main (String args[])
	{
		Scanner pk =new Scanner(System.in);
		int s = pk.nextInt();
		int e =pk.nextInt();
		int great =0;
		
		for(int i=s;i<e;i++)
		{
			int count =0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				great=i;
				//System.out.println(i);
			}
		}
		
		if(great>0)
		System.out.println(great);
		else {
			System.out.println("invalid");
		}
			
	}

}
