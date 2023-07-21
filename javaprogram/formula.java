package hackerrank;
import java.util.*;
// explantion in down 
public class formula {
	    public static void main(String []argh){
	    	 Scanner in = new Scanner(System.in);
	    	 System.out.println("number of times");
	         int t=in.nextInt();         
	        for(int i =0;i<t;i++){
	        	 System.out.println("Enter The value of a");	        
	             int a = in.nextInt();
	             System.out.println("Enter The value of b");
	             int b = in.nextInt();
	             System.out.println("Enter The value of n");
	             int n = in.nextInt();
	             int suma = 0;
	             int c =0;
	            // int p =0;
	             int power =1;
	         for(int j=0;j<n;j++){
	             suma = power*b+c;
	             System.out.print(a+suma+" ");
	            // p++;
	              power = power+power;
	             c = suma;  
	         }
	         System.out.println( );
	         
	        }
	         
	         in.close();
	    }
}

/*
 *(a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ... ,(a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)
 * a =0 ;b=2 ; n=10
 * answer 1 = 2+2^0*b=2
 *  answer 2 = 2+2^0*b + 2^1*b=6
 *  
 *  
 * ******************* shortest method is ********************* 
 *class Playground {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for(int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int num = a;
            for(int j = 0; j < n; j++) {
                num += (((int) Math.pow(2, j)) * b);
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }  
    
      
 */
