package JAVA_OOPJ_PROGRAM_3;
//Question 8: Design an Online Order System 
//Requirements: 
//Each order has: 
//● Order ID, customer name 
//C-DAC Mumbai
//● Items and price 
//System should: 
//● Store multiple orders 
//● Calculate total bill 
//● Apply GST 
//Support: 
//● Use array for multiple items 
//● Use constructor for initialization 
//Display: 
//● Final bill with details
class Order 
{
    int id;
    String name;
    double[] items;

    Order(int i,String n,double[] it)
    {
        id=i; name=n; items=it;
    }

    double total()
    {
        double sum=0;
        for(double x:items) sum+=x;
        return sum;
    }

    double gst()
    {
    	return total()*0.18;
    	
    }

    void display()
    {
        System.out.println("Total="+total()+" GST="+gst());
    }
}

public class OnlineOrderSystem
{
    public static void main(String[] args) 
    {
        Order o=new Order(1,"Jay",new double[]{200,300});
        o.display();
    }
}