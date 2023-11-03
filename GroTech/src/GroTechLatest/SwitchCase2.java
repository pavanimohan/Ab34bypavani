package GroTechLatest;
import java.util.Scanner;
public class SwitchCase2 {

	public static void main(String[] args) {

		   double num1,num2,result;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Choose an operator");
		   char operator=sc.next().charAt(0);
		   
		   System.out.println("Enter first number");
		   num1 =sc.nextDouble();
		   System.out.println("Enter first number");
		   num2 =sc.nextDouble();

		   switch (operator)
		   {
		   case '+':
			   result=num1+num2;
			   System.out.println(result);
			   break;
		   case '-':
			   result=num1-num2;
			   System.out.println(result);
			   break;
			   
		   case '/':
			   result=num1/num2;
			   System.out.println(result);
			   break;
		   case '*':
			   result=num1*num2;
			   System.out.println(result);
			   break; 
			     
		   default:
		    System.out.println("Invalid Input");

			   
		   }
		   
		   
	}

}
