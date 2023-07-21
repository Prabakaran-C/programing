package basicks;
import java.util.*;

public class mixedfraction {
	public static void main (String[] args)
	{
		Scanner pk = new Scanner(System.in);
		int n = pk.nextInt();
		int nu =pk.nextInt();
		int d =pk.nextInt();
		
		if(nu<d && d>0)
		{
			nu=d*n +nu;
			System.out.println(nu+" "+d);
		}
		else if (nu>d && d>0)
		{
			System.out.println(n+ ""+ nu+""+d);
		}
		else
		{
			System.out.println("invalid input");
		}
		
	}

}
