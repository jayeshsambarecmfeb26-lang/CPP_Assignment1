package JAVA_OOPS_ASSIGNMENT_1;

//7. Write a program to find the largest of three numbers. 

public class LargestThreeNumbers 
{
    public static void main(String[] args) 
    {
        int a=20,b=40,c=30;

       int max=a;
       
       if(b > max)
       {
    	   max=b;
       }
       
       if(c > max)
       {
    	   max=c;
       }
     
    	     
        System.out.println("Largest no is : " + max);

  
	}
}

//Largest no is : 40
