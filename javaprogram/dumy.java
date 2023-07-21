package workout;
import java.util.*;

public class dumy {
	public static void main(String[] args) {    
		Scanner in = new Scanner(System.in);
		 String string =in.nextLine();
        int count;        
        string = string.toLowerCase(); 
       // String dub[]= {};
        String dub[] = string.split(" ");       
        for(int i = 0; i < dub.length; i++) {    
            count = 1;    
            for(int j = i+1; j < dub.length; j++) {    
                if(dub[i].equals(dub[j])) {    
                    count++;    
                      
                    dub[j] = "0";    
                }    
            }     
            if(count > 1 && dub[i] != "0")    
                System.out.println(dub[i]);    
        }    
        in.close();
    }    
}    