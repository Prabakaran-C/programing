package basicks;
import java.util.*;

public class switchcase {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		char attendance = input.next().charAt(0);
		switch (attendance)
		{
			case'o':
				System.out.println("on-duty");
				break;
			case'p':
				System.out.println("pressent");
				break;
			case'a':
				System.out.println("absent");
				break;
			default:
				System.out.println("invalid ");
		}
	
		
	}

}
