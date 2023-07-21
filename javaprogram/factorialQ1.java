package workout;
import java.util.*;

public class factorialQ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The N Size");
		int n = input.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			 fact =fact*i;
		
		}
		System.out.println(fact);
		input.close();
	}

}
