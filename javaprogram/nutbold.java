package basicks;
import java.util.*;

public class nutbold {
	public static void main(String args[])
	{
		Scanner pk =new Scanner(System.in);
		int n = pk.nextInt();
		char or[]= {'!','#','$','%','&','*','@','^','~'};
		char nu[]=new char[n];
		char b[]=new char[n];
		for(int i=0;i<n;i++)
		{
			nu[i]=pk.next().charAt(0);
		}
		for(int i=0;i<n;i++)
		{
			b[i]=pk.next().charAt(0);
		}
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(or[i]==nu[j])
				{
					System.out.print(nu[j]+" ");
				}
			}
		}
		System.out.println();
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(or[i]==b[j])
				{
					System.out.print(b[j] + " ");
				}
			}
		}
	}

}
