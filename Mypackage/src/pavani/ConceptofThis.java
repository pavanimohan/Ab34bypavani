package pavani;


public class ConceptofThis {
	int age;
	double shoesize;
	String name;
	void student(int age, double shoesize,String name)
	{
		
		System.out.println("i am one of the student");
		this.age=age;
		this.shoesize=shoesize;
		this.name=name;
		
	}


	public static void main(String[] args) {
		ConceptofThis t1=new ConceptofThis();
		
          t1.student(43, 7.5, "Hanuman");
  		System.out.println(t1.age);
		
  		System.out.println(t1.shoesize);
		
		System.out.println(t1.name);



	}

}
