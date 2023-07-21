package basicks;
import java.util.*;

public class sum {
	public static void main (String args[])
	{
		Scanner pk = new Scanner(System.in);
		int n = 6;
		int arr[] = {7,1,2,8,4,3};
		int t =pk.nextInt();
		int count =0;
		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==t)
				{
					System.out.println(arr[i] +" "+ arr[j]);
					count ++;
					
				}
			}
		}
		
		if(count==0)
		{
			System.out.println("no posible");
		}
	}

}
