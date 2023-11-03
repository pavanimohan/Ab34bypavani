package package1;

public class ThisKeyword {
	int age;
	double shoesize;
	String name;
	void student(int age, double shoesize,String name)
	{
		
		System.out.println("i am one of the student");
	}

	public static void main(String[] args) {
		ThisKeyword t1=new ThisKeyword();
		t1.student(23,6.5,"Ram");
		
		System.out.println(t1.age);
		
		System.out.println(t1.shoesize);
		
		System.out.println(t1.name);

		
		
		
	}

}
