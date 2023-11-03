package javapackage1;

public class Pavani {
	Pavani ()
	{
		System.out.println("1");
	}

     Pavani (int a)
	{
		System.out.println("2");
		
	}
     
     Pavani (int a ,int b)
     {
    	 System.out.println("3");
    	 
     }

     public static void main(String[] args) {
      new Pavani();
      new Pavani(42);     
      new Pavani();
      Pavani m =new Pavani(32,56);
      
    



	}

}
