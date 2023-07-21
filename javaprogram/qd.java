package workout;
import java.util.*;

public class qd {
	    public static void main(String[] args) {
	    	Scanner pk = new Scanner(System.in);
	    	System.out.println("starting");
	    	int st=pk.nextInt();
	    	System.out.println("ending");
	    	int n = pk.nextInt();
	        int[] nums = {1, 4, 6, 8, 9};
	        
	        
	        for (int i = st; i <= n; i++) {
	            int ceil = 0;
	            int floor = 0;
	            
	            for (int j = 0; j <nums.length; j++) {
	                if (nums[j] == i) {
	                    ceil = floor = nums[j];
	                    break;
	                } else if (nums[j] < i) {
	                    floor = nums[j];
	                } else {
	                   ceil = nums[j];
	                    
	                    break;
	                }
	            }
	            
	            System.out.println("Number " + i + " -> ceil is " + ceil + ", floor is " + floor);
	        }
	    }
}

	
