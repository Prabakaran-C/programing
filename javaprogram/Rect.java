package workout;
import java.util.*;

public class Rect {
	
    int length;
    int width;
    int height;

    public Rect(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public int getVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
    	

    	Scanner pk = new Scanner(System.in); 
    	System.out.println("length");
        int length = pk.nextInt();
        System.out.println("width");
        int width = pk.nextInt();
        System.out.println("height");
        int height = pk.nextInt();
    	
        Rect myRect = new Rect(length, width, height);
        System.out.println("Length: " + myRect.length);
        System.out.println("Width: " + myRect.width);
        System.out.println("Height: " + myRect.height);
        System.out.println("Volume: " + myRect.getVolume());
        pk.close();
    }
}