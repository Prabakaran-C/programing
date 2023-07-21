package basicks;
import java.util.*;

public class noofalpha {
	public static void main(String[] args)
	{
		Scanner pk =new Scanner(System.in);
		int n = pk.nextInt();
		char alpha[]=new char[n];
		int arr[] =new int[n];
		for(int i=0;i<n;i++)
		{
			alpha[i]=pk.next().charAt(0);
			//aaaabbbccdefaa
		}
		for(int i=0,z=0;i<n;i++)
		{
			int count =0;
			for(int j=i+1;j<n;j++)
			{
				if(alpha[i]==alpha[j])
				{
					count++;
					//System.out.println(arr[i]);
				}
			}
			if(count!=0)
			{
				arr[z]=count;
				z++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
