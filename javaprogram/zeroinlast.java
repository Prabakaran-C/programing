package basicks;
import java.util.*;

public class zeroinlast {
	public static void main (String args[] )
	{
		Scanner pk =new Scanner (System.in);
		int n =pk.nextInt();

		int count =0;
		for(int i=5;n/i>=1;i*=5)
		{
			count+=n/i;
		}
		System.out.println(count);
	
	}

}
