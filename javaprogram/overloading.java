package MidLevel;
import java.util.*;

class mul {
	
}



//this concept
	class This{
		 int number1;
		 This(int number1) {
			 this.number1=number1;
		}

	}

public class overloading {

	
	public static void main (String args[]) {
		Scanner pk = new Scanner(System.in);
		int a = pk.nextInt();
		int b = pk.nextInt();
		mul mult = new mul();
		
		add(2,3,5);
		This object = new This(20);
		System.out.println(object.number1);
		
		
	}

	
//overloading
	
	static void add(int num1 ){
		System.out.println(num1 + num1);
	}
	
	static void add(int num1 ,int num2){
		System.out.println(num1 + num2);
	}
	
	static void add(int num1 ,int num2 ,int num3){
		System.out.println(num1 + num2 + num3);
	}
	
}
