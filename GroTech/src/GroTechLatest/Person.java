package GroTechLatest;

public class Person
{	
	
	 public Person(int id,String name)
	 
	 { System.out.println("The Id and name of person is : " +" "+ id +" "+ name);
	 }
	 
	public void parent()
	{	
			int emplid = 12345;
			String name="pavani";
			System.out.println("The Id of a person is : " + emplid);
			System.out.println("The name of person is : " + name);
	
	}

	public class employe extends Parent 
	{
		void test()
		{
			int salary=987;
			System.out.println("salary of a person is : "+salary);	
		}
	}

	public static void main(String[] args) 
	{
		Person pn= new Person(123, "pavani");
		employe emp = new employe();
		emp.test();		
	}
}