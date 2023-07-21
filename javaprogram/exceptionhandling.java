package MidLevel;

import java.util.Scanner;

public class exceptionhandling {
	public static void main (String[] args) {
		try {
			float number;
			Scanner input =new Scanner(System.in);
			number =input.nextFloat();
			System.out.println(number/5);
		}
		catch(Exception ex) { // if i give any string it will so because number is a integer
			System.out.println("Only number value are accepted");
		}
		
	}
	
	

}
