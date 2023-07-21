package workout;
import java.util.*;

class work{
	static void cl(){

	Scanner in =new Scanner(System.in);
	int n = in.nextInt();	
	int arr[]= new int[n];	
	int ans = 0;
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();		
	}
	for(int i=0;i<n-1;i++) {
		ans = arr[i]+arr[i+1];
	}
	int sol = ans/arr.length;
	System.out.println(sol);
}
	
}

public class classconection {
	public static void main(String[] args) {
		work.cl();
		
		
		
	}

}
