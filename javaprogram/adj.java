package workout;
import java.util.*;
class inverse{
	void iv(int n ,int ar[][]){
		//int n = arr.length;
		int ans;
		for(int i =0; i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j]=ar[i*j][j*i];
			}
			
		}
	}

	public void iv(int length, int i) {
		// TODO Auto-generated method stub
		
	}
}

public class adj {
	public static void main(String[] args) {
		Scanner pk = new Scanner(System.in);
		int arr[][]=new int[2][2];
		int r =0;
		int c =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				 arr[i][j]=pk.nextInt();
				 System.out.print(arr[i][j]+" ");
				 
			}
			System.out.println( );
			
		}
		
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(i==0 &&j==0  ) {
					
					System.out.print(arr[1][1]);
					
				}
				else if( i==1&& j==1)
					System.out.println(arr[0][0]);
				else {
					arr[i][j]=arr[i][j]*-1;
					System.out.print(arr[i][j]+" ");		
				}
			
				
				
			}
				System.out.println();
			
		}
		inverse a = new inverse();
		a.iv(arr.length,arr[2][2]);
		System.out.println();
		pk.close();
		
	}

}
