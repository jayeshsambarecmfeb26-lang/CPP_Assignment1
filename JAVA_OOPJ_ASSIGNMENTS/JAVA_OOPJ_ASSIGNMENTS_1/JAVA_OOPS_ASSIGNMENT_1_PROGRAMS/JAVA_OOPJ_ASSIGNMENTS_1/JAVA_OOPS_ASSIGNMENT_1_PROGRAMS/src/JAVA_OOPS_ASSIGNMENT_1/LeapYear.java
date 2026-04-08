package JAVA_OOPS_ASSIGNMENT_1;

// 8. Write a program to check whether a year is a leap year. 

public class LeapYear 
{
   public static void main(String[] args)
   {
       int year = 2020;
       
       if((year%4==0 && year%100!=0) || year%400==0)
    	   
       {
           System.out.println("Leap Year");
        }
}
}