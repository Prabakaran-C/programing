package basicks;

public class jumbstatement {
	public static void main (String args[])
	{
		System.out.println("its a break ");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println("it is a contine statement");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//System.out.print(" ");
				continue;
			}
			System.out.print(i);
		}
	}

}
