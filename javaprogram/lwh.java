package workout;
import java.util.*;

public class lwh {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length Of The Photo");
		 int length = input.nextInt();
		
		System.out.println("Enter the number of photo you have");
		int n = input.nextInt();
		
		for(int i=0 ; i<n;i++) {
	
		 System.out.println("Enter the width and height Of The Photo");
		 int width = input.nextInt();
		// System.out.println("Enter the height Of The Photo");
		 int height = input.nextInt();
		 
		 if(length<=width && width==height) {
			 System.out.println("Accepted");
		 }
		 else if (length <= width && width!=height) {
			 System.out.println("crop it");
		 }
		 else {
			 System.out.println("upload another ");
		 }
		}
		 input.close();
		
	}

}
