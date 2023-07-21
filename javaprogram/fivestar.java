package workout;
import java.util.*;
/*
class inverse{
	 static int ck{
		
		
	}
}*/

public class fivestar {
	public static void main(String[] args) {
		Scanner pk = new Scanner(System.in);
		System.out.println("row");
		int row = pk.nextInt();
		System.out.println("col");
		int col = pk.nextInt();
		//inverse a=new inverse();
		
		int arr[][]=new int [3][3];
		for(int i =0; i<row;i++) {
			for(int j =0;j<col;j++) {
				arr[i][j]=pk.nextInt();
			}
			//System.out.println();
		}
		for(int i =0; i<row;i++) {
			for(int j =0;j<col;j++) {
				if(i==j&&i<2&&j<2&&i>0&&j>0) {
					
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		
	//	a.ck();
		
	}

}
