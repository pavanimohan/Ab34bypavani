package javapackage1;

public class Nestedifblock {

	public static void main(String[] args) {
    int a=100;
    int b=300;
    if (a==100)
    {
    	if (b==300)
    	{
    		if (a==b)
    		{
    			System.out.println("1");
    		}
    		else
    		{
    			System.out.println("2");
    		}
    	}
    		else
    		{
    			System.out.println("3");
    		}
    	}
    	System.out.println("4");
    }
	}


