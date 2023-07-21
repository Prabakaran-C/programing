package workout;
import java.util.Scanner;

public class mul {
	    	    public static void main(String[] args) {
	    	        Scanner input = new Scanner(System.in);
	    	        
	    	        // Get the size of the arrays
	    	        System.out.print("Enter the size of the arrays: ");
	    	        int size = input.nextInt();
	    	        
	    	        // Declare the arrays
	    	        int[] a = new int[size];
	    	        int[] b = new int[size];
	    	        int[] c = new int[size];
	    	        
	    	        // Get the elements of the arrays
	    	        System.out.print("Enter the elements of array a: ");
	    	        for (int i = 0; i < size; i++) {
	    	            a[i] = input.nextInt();
	    	        }
	    	        
	    	        System.out.print("Enter the elements of array b: ");
	    	        for (int i = 0; i < size; i++) {
	    	            b[i] = input.nextInt();
	    	        }
	    	        
	    	        // Calculate the sums of the corresponding elements
	    	        for (int i = 0; i < size; i++) {
	    	            c[i] = a[i] + b[i];
	    	        }
	    	        
	    	        // Output the sums and the "s" or "d" indicators
	    	        for (int i = 0; i < size; i++) {
	    	            System.out.print(c[i] + " ");
	    	            if (c[i] % 2 == 0) {
	    	                System.out.print("s ");
	    	            } else {
	    	                System.out.print("d ");
	    	            }
	    	        }
	    	    }
	    	

	       
	    }
	



