package package1;

public class ConceptofThis 
{
	ConceptofThis()
	{
		this("future");  // this one calling below parameter constructor
		System.out.println("one");
	}
	ConceptofThis (String state)
	{
		System.out.println("two"); //if u create object for this constructor and 
		                           //this keyword for above constructor only this is the  output
	}
	public static void main(String[] args) {
      
		new ConceptofThis();

        //new ConceptofThis("present"); //in stead of c reating multiple object this keyword is used
	}

}
