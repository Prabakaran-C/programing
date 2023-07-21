package placement;
import java.util.*;
public class Switch {
	public static void main (String args[]) {
		
		string obj = new string();
		//obj = len();
			
		int number= 10;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the name ");
		name = input.next();
		
		switch (name) {
		case "kumar" :
			System.out.println("hi " +name + " appa");
			break;
		case "viji" :
			System.out.println("hi " +name + " amma");
			break;
		case "praveena" :
			System.out.println("hi " +name + " sis");
			break;
		case "praba" :
			System.out.println("hi " +name + " legent");
			break;
			
		default :
			System.out.println("not in list");
		}
		
		
	/*	int number = 10;
		String name;
		
		switch (name) {
		 case "kumar" :
		 System.out.println( "hi " + name + "appa");
		 break;
		 case "praveena" :
			 System.out.println( "hi " + name + "sis");
			 break;
		 case "viji" :
			 System.out.println( "hi " + name + "amma");
			 break;
		 case "pk" :
			 System.out.println( "hi " + name + " my self");
			 break;
		
		}
		*/
		
	}
}
