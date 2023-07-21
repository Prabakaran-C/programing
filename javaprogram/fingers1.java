package basicks;
import java.util.*;

public class fingers1 {
	public static void main (String args[])
	{
		Scanner pk = new Scanner(System.in);
			int n;
			n = pk.nextInt();
			int r =n%8;
			if(r==1)
			{
				System.out.println("thumb");
			}
			if(r==2 || r==0)
			{
				System.out.println("index");
			}
			if(r==3 || r==7)
			{
				System.out.println("middle");
			}
			if(r==4 || r==6)
			{
				System.out.println("ring");
			}
			if(r==5)
			{
				System.out.println("little");
			}
	}
}
