package workout;
import java.util.*;

public class div {
	public static void man(String[] args) {
		Scanner pk = new Scanner(System.in);
		int n = pk.nextInt();
		int m =pk.nextInt();
		int y =0;
		while(n!=0){
			int x =n%m+y;
			y = x;
			System.out.println(y);

		}
	
				
	}

}
