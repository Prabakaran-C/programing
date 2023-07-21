package MidLevel;


abstract class bike {// abstract is used to hide a un wanted to user
	void run() {
		System.out.println("nothing is running");
	}
	abstract void running();//declaration
	
}
class rr extends bike{ //concrete class 
	void running() {//define
		System.out.println("running");
	}
	
}


public class abstract_ {
	public static void main (String[] args) {
		bike obj = new rr();
		obj.run();
		obj.running();
	}

}
