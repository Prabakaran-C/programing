package MidLevel;

class add{ //super , parent
	
	add(){
		
		
	}
	add(int a ,int b){ 
		System.out.println(a + b);

	}
	void run () {
		System.out.println("this is add class");
	}
	 
}
class sub extends add{// extends is keyword  (subclass , or child class)
	void run2 () {
		System.out.println("This is subclass");
	}
	
	//sub(int a , int b){
		//System.out.println(a-b);
		
	//}
}

class mul extends sub{
	//here has class of add,sub
}


public class inheritence {
	public static void main (String args[]) {
		/*
		add addition = new add(2,3);
		addition.run();
		sub s = new sub();
		s.run();
		s.run2();
		*/
		mul m = new mul();
		m.run();
		m.run2();
	}

}
