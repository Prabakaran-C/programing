package workout;
import java.util.*;

public class NoOFCharInString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pk = input.nextLine();
		int count = 0;
		 char[] arr = pk.toCharArray();
		// System.out.println(arr);
		
		 for(int i=0;i<arr.length;i++) {
			count++;
		}
		input.close();
		 System.out.println(count);
	}

}
