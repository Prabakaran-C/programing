package basicks;
import java.util.*;

public class lessthen {
	public static void main(String args[])
	{
		Scanner pk =new Scanner(System.in);
		int n =pk.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=pk.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count =1;
			if(i==0 || arr[i]<arr[i-1])
			{
				count=1;
			}
			else
			{
				for(int j=i-1;j>0;j--)
				{
					if(arr[j]<arr[i])
					{
						count++;
						
					}
				}
			}
			System.out.println(count);
		}
	}

}
