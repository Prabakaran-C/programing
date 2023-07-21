package MidLevel;
import placement.accept;
import lab.increaseSizeOfArray;
public class connection {
	public static void main (String[] args) {
		
		
		rr obj = new rr();// it from abstract_ class
		obj.running();
		accept pk = new accept();
		pk.main(args);// it is from the another package main value package name = palcement ,class = accept
		constractor check = new constractor(); // its from constractor class
		check.main(args);
		
		increaseSizeOfArray arr = new increaseSizeOfArray();
		arr.main(args);
		
	}

}
