package workout;
import java.util.*;
class crossadd{

	public crossadd(int n, int[] arr1, int[] arr2, int[] ans) 
	{
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(i==0 && j==1 || (i==2 && j==1) || (i == 2 && j == 4) || (i ==5 && j ==4) || (i == 5 && j==6) ){
					{
						ans[i] = arr1[i]+arr2[j];
						System.out.print(ans[i] + " ");
					}
				}
		}
	}
	}
	
}


public class newadd {
	public static void main(String[] args) 
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
		
		crossadd ad = new crossadd(n,arr1,arr2,ans);
		
	}

}
