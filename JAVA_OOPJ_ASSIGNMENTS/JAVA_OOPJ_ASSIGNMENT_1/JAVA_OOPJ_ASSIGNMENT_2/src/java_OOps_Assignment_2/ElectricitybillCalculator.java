package java_OOps_Programms_2;

//1. Electricity Bill Calculator 
//Create a Java program to calculate a household electricity bill. 
//Requirements 
//● Accept customer name, consumer number, and units consumed. 
//● Calculate bill using slab rates such as: 
//○ First 100 units → Rs. 5 per unit 
//○ Next 100 units → Rs. 7 per unit 
//○ Above 200 units → Rs. 10 per unit 
//● If the bill exceeds Rs. 1500, apply a 5% surcharge. 
//● Display complete bill details. 



import java.util.*;

public class ElectricitybillCalculator 
{

	public static void main(String args[]) 
	{


    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Customer Name: ");
    
    String CustomerName = sc.nextLine();

    System.out.print("Enter Consumer Number: ");
    
    int consumerNo = sc.nextInt();

    System.out.print("Enter Units Consumed: ");
    
    int units = sc.nextInt();

    double bill = 0;

   
    if (units <= 100) 
    {
        bill = units * 5;
        
    } else if (units <= 200)
    {
        bill = (100 * 5) + (units - 100) * 7;
    } else
    {
        bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
    }

   
    if (bill > 1500) 
    {
        bill += bill * 0.05;
    }

    System.out.println(" Electricity BILL DETAILS ");
    
    System.out.println("Name: " + CustomerName);
    System.out.println("Consumer No: " + consumerNo);
    System.out.println("Units: " + units);
    System.out.println("Total Bill: Rs. " + bill);
}



}



//Name: jayesh
//Consumer No: 567
//Units: 210
//Total Bill: Rs. 1300.0
