package Package2;
class Teachers
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

public class UpCasting extends Teachers
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
		Teachers t1=new Teachers();  //upcasting 
		t1.teaching_java();
		t1.teaching_selenium();
		

	}

}
