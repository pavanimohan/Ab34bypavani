package GroTechLatest;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
      
		int day;
		 System.out.println("Enter any day range(1-7)");
		 Scanner sc=new Scanner(System.in);
		 
		 day =sc.nextInt();
		 switch(day)
		 {
		 case 1:
		 System.out.println("Sunday");
		 break;
		 
		 case 2:
			 System.out.println("Monday");
           break;
		 case 3:
			 System.out.println("Tuesday");
           break;

		 case 4:
			 System.out.println("Wednesday");
           break;
           
		 case 5:
			 System.out.println("Thursday");
           break;

           
		 case 6:
			 System.out.println("Firday");
           break;
           
		 case 7:
			 System.out.println("Saturday");
           break;
           
           default:
        	   
  			 System.out.println("Invalid Input");

           
           

   }
		 
		 
		 
		 
		 
		 }
		 
	}


