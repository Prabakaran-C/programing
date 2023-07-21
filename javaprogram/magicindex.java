package basicks;
import java.util.*;

public class magicindex {
	public static void main(String args[])
	{
		Scanner pk =new Scanner(System.in);
		int t = pk.nextInt();
		while(t!=0)
		{
			int n =pk.nextInt();
			int arr[]= new int[n];
			int temp =0;
			for(int i=0;i<n;i++)
			{
				arr[i]=pk.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				if(arr[i]==i || arr[i]==i*-1)
				{
					temp=i;
					break;
				}
			}
			if(temp!=0)
			{
				System.out.println(temp);
			}
			else
			{
				System.out.println("-1");
			}
			t--;
		}
	}
}
