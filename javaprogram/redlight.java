package hackerrank;
import java.util.*;
class pk{
	// your code goes here
	static void pp() {
	Scanner inp = new Scanner(System.in);
	int t=inp.nextInt();
	for(int i=0;i<t;i++){
	    int count=0;
	    int n= inp.nextInt();
	    int h=inp.nextInt();
	    int arr[]=new int[n];
	    for(int j=0;j<n;j++){
	        arr[i]=inp.nextInt();
	        if(arr[i]>h){
	            count++;
	        }
	    }
	    System.out.println(count);
	}
	}

}

/* Name of the class has to be "Main" only if the class is public. */
public class redlight
{
	public static void main (String[] args) {
	
	pk n = new pk (); 

}
}