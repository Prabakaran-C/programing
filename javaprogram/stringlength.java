package workout;

import java.util.*;

public class stringlength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int length =  input.length();
		System.out.println(length);
		in.close();
	}
}
