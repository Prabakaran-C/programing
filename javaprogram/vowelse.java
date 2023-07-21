package workout;
import java.util.*;

public class vowelse {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		          String pk=input.next();
		          int count=0;
		          for(int i=0;i<pk.length();i++){
		            if(pk.charAt(i)=='a'||pk.charAt(i)=='e'||pk.charAt(i)=='i'||pk.charAt(i)=='o' || pk.charAt(i)=='u' )
		               count++;
		          }
		          input.close();
		          System.out.println(count);
		          
	
		}
}
	


