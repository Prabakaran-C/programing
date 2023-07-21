package placement;
import java.util.Scanner;

public class AdamNum {
  


    public static void main(String[] arr) {

    Scanner sc = new Scanner(System.in);
      int num,num1,sq1=0,sq2=0,r,numsq;
      
      System.out.println("ENTER A VALUE: ");
      num=num1=sc.nextInt();
      
      numsq = num*num;
      while(numsq>0)
      {
      r=numsq%10;
      sq1=(sq1*10)+r;
      numsq=numsq/10;
      }
      
      while(num1>0)
      {
      r=num1%10;
      sq2=(sq2*10)+r;
      num1=num1/10;
      }
      
      sq2*=sq2;
      
      if(sq1==sq2)
       System.out.println(num+" is a adam number");
      else
      System.out.println(num+" is not a adam number");
         
    }
}