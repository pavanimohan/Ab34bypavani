package GroTechLatest;

public class LeapYear {

	public static void main(String[] args) {
int year=2014;
if ((year%4==0) && ((year%100)!=0) || (year%400==0))
{
	System.out.println("LeapYear");
}
else
	System.out.println("not a Leap Year");
	}

}
