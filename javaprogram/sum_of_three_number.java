package basicks;
import java.util.*;

public class sum_of_three_number {
	public static void main (String args[])
	{
		Scanner pk =new Scanner(System.in);
		int n = pk.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=pk.nextInt();
		}
		int count = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
						count++;
					}
					
				}
			}
		}
		if(count==0)
		{
			System.out.println("no element fount");
		}
	}

}
