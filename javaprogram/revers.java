package workout;
import java.util.Scanner;

public class revers {
	    public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        String s=in.next();
	        for(int i=s.length()-1;i>=0;i--){
	            System.out.print(s.charAt(i));
	        }
	    
	}

}
