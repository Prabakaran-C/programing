package placement;
import java.util.*;

public class condition {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		/*
		int number ;
		System.out.println("enter a number");
		number = input.nextInt();	
		System.out.println(number + " vatti ombu");
		*/		
	
		int pen = 10 ;
		int SpecialPen =20;
		int cost;
		System.out.println("enter a availability");
		 cost = input.nextInt();
		
		if (cost >=SpecialPen ){
			System.out.println("you can buy a SpecialPen");
		}
		//else if (cost >= 30)
				//System.out.println("you can buy both pen");
			
		else if (cost >= pen) 
		{System.out.println("you can buy a pen");
		}
		
			
		else{
			System.out.println("you have less money");
		}
		
		
	}
	

}
