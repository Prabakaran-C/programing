/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
Accepted
1.4M
Submissions
3M
Acceptance Rate
46.5%
Seen this question in a real interview before?
1/4
Yes
No
Discussion (127)
Related Topics
*/

// code
class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int ch =0;
         if(s.length()==1)
       {
           return 1;
       }
       else
       {
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ' && ch ==0)
            {
                ch++;
            }
             if(s.charAt(i)==' ' && ch!=0 )
            {
                break;
            }
            else if(ch!=0)
            {
                ans++;
            }
        }
       }
         return ans;
    }
}