package basicks;
import java.util.*;

public class extraword {
	public static void main (String args[])
	{
		Scanner pk =new Scanner(System.in);
		String w = pk.next();
		char arr[] = w.toCharArray();
		String t = pk.next();
		char arr1[] = t.toCharArray();
		for(int i=0;i<w.length();i++)
		{
			int count =0;
			for(int j=0;j<t.length();j++)
			{
				if(arr[i]==arr1[j])
				{
					i++;
				}
				else
				{
					count++;	
				}
			}
			if(count!=0)
			{
				System.out.println(count);
				break;
			}
			else
			{
				System.out.println(count);
				break;
			}
		}
		
		
		
	}

}