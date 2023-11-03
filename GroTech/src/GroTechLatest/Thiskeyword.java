package GroTechLatest;

class Student1
{
	int roll;
	String name;
	float fee;
	Student1 (int roll,String name,float fee)
	{
		this.roll=roll;
		this.name=name;
		this.fee=fee;
	}
	

   void display()
  {
System.out.println(roll+" "+name+" "+fee);	
     }
}

public class Thiskeyword {

	public static void main(String[] args) {
		Student1 obj=new Student1(123,"Rani",6000);
		Student1 obj1=new Student1(1233,"Rasi",5000f);
		obj.display();
		obj1.display();

	}

}
