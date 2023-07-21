package basicks;
import java.util.*;

public class doctor {
	public static void main(String args[])
	{
		Scanner pk = new Scanner(System.in);
		int n = pk.nextInt();
		if(n<=20)
		{
			int arr[]= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=pk.nextInt();
			}
			int ans = 0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]<17)
				{
					ans=ans+200;
				}
				if(arr[i]>=17 && arr[i]<40)
				{
					ans=ans+400;
				}
				if(arr[i]>=40)
				{
					ans=ans+300;
				}
			}
			System.out.println(ans);
		}
		else
		{
			System.out.println("more than 20 ");
		}
	}

}
