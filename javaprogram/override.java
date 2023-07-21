package MidLevel;

class a1{
	void display() {
		System.out.println("a1 class");
	}
}

class b1 extends a1{//child has power
	void display() {
		System.out.println("b1 class");
	}
}


public class override {
	public static void main (String[] args) {
		b1 obj = new b1();
		obj.display();
		
		
	}

}
