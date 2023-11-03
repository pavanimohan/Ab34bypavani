package package1;

import java.util.Scanner;

public class ConceptScan 
{

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in); // it writes to accepect human input at run time
		//String name = s1.next();  //used to accept the string value at run time
		         
  		System.out.println("enter value value of a");
          int a  =  s1.nextInt();  //int values are accepeted
	      System.out.println("enter value value of b");
        int b =s1.nextInt();
        System.out.println("addition of two numbers");
		   int c=a+b;
		  System.out.println(c);
		   System.out.println("enter value of i");
		   int i=s1.nextInt();
		   System.out.println("enter value of j");
            int j =s1.nextInt();
 		   System.out.println("sutraction of two numbers");
            int k=i-j;
  		  System.out.println(k);
 		   System.out.println("enter value of p");
 		   int p=s1.nextInt();
		   System.out.println("enter value of q");
             int q=s1.nextInt();
   		   System.out.println("division of two numbers");
            int r=p/q;
  		  System.out.println(r);
  		   System.out.println("enter value of x");
             int x=s1.nextInt();
   		   System.out.println("enter value of y");
           int y=s1.nextInt();
   		   System.out.println("multplication of two numbers");
            int z=x*y;
  		  System.out.println(z);

 		   s1.close();//to close the human input we have to write this otherwise it will wait for input
	} 
 		   
 		   
	}   
 		   
 		   
 		   
 		   
 		   
 		   

		