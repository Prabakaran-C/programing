package workout;
import java.util.*;

class box
{
	float h ;
	float b;
	float d;	
	box()
	{
		Scanner pk = new Scanner(System.in);
		h = pk.nextFloat();
		b = pk.nextFloat();
		d = pk.nextFloat();
		float vol = h*b*d;
		System.out.println(vol);
		pk.close();
	}
	
}

public class volume 
{
	public static void main(String[] args)
	{
		box newbox = new box();
		
	}
	
	

}
