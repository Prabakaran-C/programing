package workout;
import java.util.*;
class add {

	public add(int n, int[] arr1, int[] arr2, int[] ans)
	{
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++) 
			{
				if(i==0 && j == 2 || (i==1 && j == 1) || (i ==2 && j == 0) || (i == 3 && j == 3) ||(i==4 && j ==6) || (i==5 && j ==5) || (i==6 && j==4))
				{
					ans[i] = arr1[i]+arr2[j];
					System.out.print(ans[i] + " ");
				}
			}
		}
		
	}
	
}
class crossadd{

	public crossadd(int n, int[] arr1, int[] arr2, int[] ans) 
	{
		for(int i =0;i<n;i++) 
		{
			for(int j =0;j<n;j++) 
			{
				if(i==0 && j==1 || (i==2 && j==1) || (i == 2 && j == 4) || (i ==5 && j ==4) || (i == 5 && j==6) )
				{
						ans[i] = arr1[i]+arr2[j];
						System.out.print(ans[i] + " ");
				}
			}
			
		}
	
	}
	
}




public class adarray
{
	public static void main(String argd[])
	{
		Scanner pk = new Scanner(System.in);
		int n = pk.nextInt();
		int arr1[]=new int[n];
		int arr2[]= new int [n];
		int ans[]=new int [n];
		for(int i =0;i<n;i++) 
		{
			arr1[i]=pk.nextInt();
		}
		for(int i =0;i<n;i++) 
		{
			arr2[i]=pk.nextInt();
		}
		
		System.out.println();
		add ad = new add(n,arr1,arr2,ans);
		System.out.println();
		crossadd cad = new crossadd(n,arr1,arr2,ans);
		
	}

}



/*
for(int i =0;i<n;i++)		
{
	for(int j =0; j<n;j++)
	{
	if(i==0 && j == 1) 
	{
		ans[0]=arr1[0]+arr2[1];
		
	}
	if(i==1 && j==0) 
	{
		ans[1]=arr1[1]+arr2[0];
		
	}
	if(i==2 && j==2) 
	{
		ans[2]=arr1[2]+arr2[2];
		
	}
	if(i==3 && j==4) 
	{
		ans[3]=arr1[3]+arr2[4];
		
	}
	if(i==4 && j==3) 
	{
		ans[4]=arr1[4]+arr2[3];
		
	}
	
    }
}
for(int i =0;i<n;i++) 
{
	System.out.print(ans[i]+ " ");
}
System.out.println();

for(int i =0;i<n;i++) 
{
	if(ans[i]<10) 
	{
		System.out.print("s ");
	}
	else {
		System.out.print("d ");
	}
} */

