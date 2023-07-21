package basicks;

import java.util.*;

public class monkey {
	public static void main (String args[])
	{
		Scanner pk = new Scanner (System.in);
		System.out.println("Total no of Monkeys");
		int n = pk.nextInt();
		System.out.println("Number of eatable Bananas ");
		int k = pk.nextInt();
		System.out.println("Number of eatable Peanuts ");
		int j = pk.nextInt();
		System.out.println("Total no of Bananas ");
		int m =pk.nextInt();
		System.out.println("Total no of Peanuts ");
		int p =pk.nextInt();
		
		if(k<0 && j<0)
		{
		int ans= m/k + p/j;
		int ans1 = n -ans;
		System.out.println("Number of  Monkeys left on the tree:" + ans1);
		}
		else
		{
			System.out.println("invalid input ");
		}
	}

}
