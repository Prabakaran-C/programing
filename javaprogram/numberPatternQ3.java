package workout;
import java.util.*;

public class numberPatternQ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the N terms");
		int num= input.nextInt();
		
		int row,col,k =1;
		for( row=1;row<num;row++) {
			for(col=1;col<=row;col++) {
				System.out.print(k +" ");
				k++;
			}
			System.out.println( );
		}
	}

}
