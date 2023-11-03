package javapackage1;

public class Global_Local {
	 int age= 100;
	String name;
	double salary;
	void student( int age,String name,double salary)
	{
		System.out.println("remember i am student");
		
	}

	public static void main(String[] args) {
		Global_Local s=new Global_Local();
		s.student(32, "dsp", 4.52);  
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.salary);

	}

}
