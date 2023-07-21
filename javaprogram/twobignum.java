package basicks;
import java.util.*;

public class twobignum {
	public static void main(String args[])
	{
		Scanner pk =new Scanner(System.in);
		int n=pk.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=pk.nextInt();
		}
		int fh=0,sh=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>fh)
			{
				fh=arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>sh && arr[i]<fh)
				sh=arr[i];
		}
		int ans = fh+sh;
		System.out.println(ans);
		
	}

}
