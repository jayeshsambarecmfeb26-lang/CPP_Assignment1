package JAVA_OOPJ_PROGRAM_3;


//Question 10: Design a Transport Ticket System 
//Requirements: 
//Each ticket has: 
//● Ticket ID, passenger name 
//● Source, destination 
//● Fare 
//System should: 
//● Store multiple bookings 
//● Calculate total fare 
//● Update fare 
//Display: 
//● Ticket details  


	class Ticket
	{
	    int id;
	    String name, source, dest;
	    double fare;

	    Ticket(int i,String n,String s,String d,double f)
	    {
	        id=i; name=n; source=s; dest=d; fare=f;
	    }

	    void updateFare(double f)
	    {
	    	fare=f; 
	    	
	    }

	    void display()
	    {
	        System.out.println(name+" "+source+"->"+dest+" Fare="+fare);
	    }
	}

	public class TransportTicketSystem
	{
	    public static void main(String[] args) 
	    {
	        Ticket t=new Ticket(1,"Jay","A","B",500);
	        t.display();
	    }
	}

