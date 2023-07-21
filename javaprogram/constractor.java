package MidLevel;
import java.util.*;

//import java.util.*;

//import placement.string;

class car {
	int speed ;
	int price ;
	String colour ;
	String specification ;
	
	// ithu constractor = athavathu entha valuevum kudukatti ithulla irruka value default aa varum
	car (){
		 speed = 100;
		 price = 50;
		 colour = "your choice" ;
	}
	/*// parametriced constrctor = ithu ethukuna killa value assingn pannurapa nama thani thaniya
	  							   //int color poda thevai illa directaa pottukalam
	car(int s,int p ,String c ){
		speed = s;
		price = p
		clour = c
	} 
	 */
	
	void work () {
		System.out.println("it can move");
	}
}

public class constractor {
	public static void main (String[] args) {
		car bmw = new car();
		bmw.speed = 300 ;
		bmw.price = 100000;
		bmw.colour = "blak &"+" " + "white";
	    bmw.specification =(("bmwspeed :" + bmw.speed  )+ " " +("bmwprice : " + bmw.price) + " " +("bmwcolour : " + bmw.colour)) ;
		
		car rr =new car();
		rr.speed = 400;
		rr.price = 10000000;
		rr.colour = "custColour";
		rr.specification =(("rrspeed :" + rr.speed )+ " " +("rrprice : " + rr.price) + " " +("rrcolour : " + rr.colour));
		//System.out.println(rr.price+rr.speed);
		car benz =new car ();
		benz.specification = (("benzspeed :" + benz.speed )+ " " +("benzprice : " + benz.price) + " " +("benzcolour : " + benz.colour));
		
		
		//System.out.println(bmw.specification);
		//System.out.println(rr.specification);
		System.out.println(rr.specification + "\n" + bmw.specification + "\n" + benz.specification);
		//System.out.println(bmw.speed);
		}
}











