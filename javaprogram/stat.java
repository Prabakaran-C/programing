package MidLevel;//static- is a fixed value

class Student{
	int reg;
	int Class;
	static String principal;
	
	
}



public class stat {
	public static void main (String args[]) {
		
		Student.principal = "kavitha";
		
		Student praba = new Student();
		praba.reg = 111;
		praba.Class = 12;
		
		
		Student vicky = new Student();
		vicky.reg = 112;
		vicky.Class = 12;
	
		Student ravi = new Student();
		ravi.reg = 113;
		ravi.Class = 11;
	
		System.out.println(Student.principal);
		//System.out.println(praba);//?
		
	}

}
