package basicks;
import java.util.*;

public class spcialcharacter {
	public static void main (String args[])
	{
		Scanner pk =new Scanner(System.in);
		String str = pk.next();
		char arr[]=str.toCharArray();
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='!' || arr[i]=='@' || arr[i]=='#' || arr[i]=='$'|| arr[i]=='%' || arr[i]=='^'|| arr[i]=='&'|| arr[i]=='*'|| arr[i]=='?')
			{
				count++;   
			}
		}
		System.out.println(count);
	}

}
