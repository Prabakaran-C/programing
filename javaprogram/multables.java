package hackerrank;
import java.util.*;

public class multables {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the wanted tables");
	
		int num = in.nextInt();
		System.out.println("how long you need");
		int las = in.nextInt();
		for(int i=0;i<=las;i++) {
			int ans = num*i;
			System.out.println(num + " x " + i + " = "+ans);
			
		}
		in.close();
	}
	

}
