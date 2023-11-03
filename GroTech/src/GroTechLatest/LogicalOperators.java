package GroTechLatest;

public class LogicalOperators {

	public static void main(String[] args) {

		int a=14;
		int b=7;
		int c=9;
		
		if(a>b && !(b<c) || c<a && b>a) 
		{
			System.out.println("True");
		}
		else
			System.out.println("Flase");
		
	}

}
