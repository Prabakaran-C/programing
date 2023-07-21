package workout;
import java.util.*;

public class q1 {
	public static void main(String[] args) {
		Scanner pk = new Scanner (System.in);	
	        int n = pk.nextInt();
	        int[] arr = new int[n];
	        int temp=0;
	        for (int i = 0; i < n; i++) {
	            arr[i] = pk.nextInt();
	        }
	        for (int i = 0; i < n; i++) {
	            int r = (int) Math.sqrt(arr[i]);
	            if (r * r == arr[i]) {
	                temp++;
	            }
	        }
	        //int ans = temp-1;
	        	
	        System.out.println(temp);
	    }

}
