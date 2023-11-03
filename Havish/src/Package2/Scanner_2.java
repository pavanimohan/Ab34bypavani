package Package2;

import java.util.Scanner;

public class Scanner_2 {

	public static void main(String[] args) {

			
			//*When its asking to enter the value of a which is of int type but if we give the string value or float value it will give InputMismatchException.

		
		// When we place over on Scanner its showing C on top F which is nothing but its a Class which final in nature.
			Scanner s1=new Scanner(System.in);//System.in--> The Scanner class will accept the input from the Keyboard at the run time that is why its in. When we place over on System.in is nothing but C on top F which is also a class final in nature.  
			System.out.println("enter the value of a");
			
			int a=s1.nextInt();//Which is a Pre-defined method from Scanner class.
		   
			System.out.println("enter the value of b");
		    int b=s1.nextInt();
		    
		   // System.out.println("enter the value of c");
		    int  c= a+b;
		    System.out.println("enter the value of c");
			System.out.println(c);
			}


	}


