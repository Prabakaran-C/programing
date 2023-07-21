package placement;

public class Loops {
	public static void main (String arg[]) {
		/*loops
		 types
		 for loop,while loop, do while , for-each loop
		 */
		for (int initial = 0 ; initial < 2 ; initial ++) {
			System.out.println("hi dudes");
		}
		int number = 3;
		while(number > 0) {
			System.out.println("while loop");
			number -- ;
		}
		
		int number1=4;
		do {//condition false analum ooru time avathu intha proccess nadankum
			System.out.println("do while");
			number1 -- ;
		}while (number1 >0);
			
		
		//foreach
		String vegetables [] = {"onnion" , "carrot" ,"tomato"};
		for(String vegetable : vegetables) {
			System.out.println(vegetable);
		}
		
	}

}
