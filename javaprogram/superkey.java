package MidLevel;

class a {
	a(){
		System.out.println("default a");
	}
	a(int i){
		System.out.println("value assinged for a");
	}
	
}

class b extends a{
	b(){
		System.out.println("default b");
	}
	b(int i){
		super(i);// super keyword is used for aasign panan default illama value irrukuratha print pannunu
		System.out.println("value assinged b");
	}
	
}

public class superkey {
	public static void main (String[] args) {
		b obj = new b(10);
		
		
		
	}

}
