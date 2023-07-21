package workout;
import java.util.Scanner;

public class vowelinword {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String sent = pk.nextLine();
        String lsent = sent.toLowerCase();
        char arr[] = lsent.toCharArray();
        // number of words
        int wordCount = sent.split("\\s+").length;
        System.out.println("Number of words in sentence: " + wordCount);
       
        
        //number of vowels
        int vowels=0;
        for(int i =0 ;i<arr.length;i++) 
        {
        	if(arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' || arr[i]=='o' || arr[i]=='u') 
        	{
        		vowels++;
        	}
        }
        System.out.println("number of vowels in sentence : " + vowels);
        
        //vowels in words
        int space =0;
        for(int i =0;i<arr.length;i++)
        {
        	int vowelsword =0;
        
        	if(arr[i]==' '|| arr[i]==arr.length-1 )
        	{
        		for(int j =i-1;j>=space;j--) 
        		{
        			if(arr[j]=='a' || arr[j]=='e'|| arr[j]=='i' || arr[j]=='o' || arr[j]=='u') 
        			{
                		vowelsword++;
                		
        	    	}
        			
            	}
        		space = i+1;
            }
        	int a =1;
        	a++;
        	System.out.println("number of words in "  +vowelsword);
        }
        
    }
}
