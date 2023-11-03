package Package2;

public class Array {

	public static void main(String[] args) {
	
			int age[]=new int[3];
			age[0]=10;
			age[1]=20;
			age[2]=30;


			try
			{
			System.out.println(age[3]);
			}
			
			catch(ArrayIndexOutOfBoundsException a1) 
			{
				System.out.println(a1.getMessage());
			}
			
			System.out.println(age[0]);
			
			
			
	}

}
