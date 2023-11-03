package Package2;
class Teacher
{
	void teaching_java()
	{	
		System.out.println("Iam teaching java");


	}
	void teaching_selenium()
	{
		System.out.println("Iam teaching selenium");

     }
}
public class DownCasting extends Teacher
{
	void java()
	{
		System.out.println("Iam learning java");
}
	
    void selenium()
    {
		System.out.println("Iam learning selenium");

    }
	public static void main(String[] args) {
		
		Teacher t1=new Teacher();
		t1.teaching_java();
        t1.teaching_selenium();
        DownCasting s1=   (DownCasting)t1; //downcasting explicity
        
        s1.java();
        s1.selenium();
        s1.teaching_java();
        s1.teaching_selenium();
	}

}
