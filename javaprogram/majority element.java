/* question
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/

//leadcode answer
class Solution {
    public int majorityElement(int[] nums) {
        int ans =0;
        int maxcount =0;
        for(int i=0;i<nums.length;i++)
        {
            int count =1;
            int temp = nums[i];
            for(int j=i+1;j<nums.length;j++ )
            {
                if(nums[j]==temp)
                {
                    count++;
                }
            }
            if(maxcount<count)
            {
                maxcount = count;
                ans=temp;
            }
        }
         return ans;
    }
}

/* for ide full program
import java.util.*;
public class majorityelement {
	public static void main(String[] args) {
		Scanner pk =new Scanner (System.in);
		int n =pk.nextInt();
		int nums[]=new int [n];
		for(int i=0;i<n;i++)
		{
			nums[i]=pk.nextInt();
		}
		 int ans =0;
		 int maxcount=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            int count =1;
	            int temp = nums[i];
	            for(int j=i+1;j<nums.length;j++ )
	            {
	                if(nums[j]==temp)
	                {
	                    count++;
	                }
	            }
	            if(maxcount<count)
	            {
	            	maxcount=count;
	                ans=nums[i];
	            }
	        }
	        System.out.println(ans);
	}
} */
