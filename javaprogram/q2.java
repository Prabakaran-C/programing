package workout;
import java.util.*;

public class q2 {
	    public static void main(String[] args) {
	        Scanner pk = new Scanner(System.in);
	        System.out.print("sentence: ");
	        String sen = pk.nextLine();
	        String[] words = sen.split("\\s+");
	        String s = words[0];
	        String l = words[0];

	        for (int i = 1; i < words.length; i++) {
	            if (words[i].length() < s.length()) {
	                s = words[i];
	            }
	            if (words[i].length() > l.length()) {
	                l= words[i];
	            }
	        }
	        System.out.println("small:" + s);
	        System.out.println("large:" + l);
	    }
	}
	

