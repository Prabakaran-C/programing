package basicks;
import java.util.*;

public class leastjumb {
	public static void main(String args[])
	{
		Scanner pk =new Scanner(System.in);
		int t =pk.nextInt();
		while(t!=0)
		{
			int n =pk.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=pk.nextInt();
			}
			//Arrays.sort(arr);
			//int start = arr[0];
			//int end = arr[n-1];
			int count =0;
			for(int i=0;i<n;i++)
			{
				if(i%2==0 && i!=0)
				{
					count ++;
				}
			}
			if(count!=0)
			{
				System.out.println(count);
			}
			t--;
		}
	}

}
