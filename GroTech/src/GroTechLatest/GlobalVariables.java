package GroTechLatest;

public class GlobalVariables {
int age;//declarition
String name;
double Salary;
void Student()
{
	System.out.println("i am nonstartic method");
	age=12;//initilization
	name="pavani";
	Salary=3.12;
	
}
void add()
{
	int age=12;//localvariable
	age=12;
	System.out.println(age);
}
	public static void main(String[] args) {
		GlobalVariables d1=new GlobalVariables();
		d1.Student();
		System.out.println(d1.age);
		System.out.println(d1.name);
		System.out.println(d1.Salary);
		
	}

}
