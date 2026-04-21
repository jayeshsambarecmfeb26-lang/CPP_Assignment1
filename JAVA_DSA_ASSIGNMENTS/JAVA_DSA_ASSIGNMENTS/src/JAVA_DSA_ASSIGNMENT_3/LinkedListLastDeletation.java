package JAVA_DSA_ASSIGNMENT_3;

//5. Delete the last node of a LinkedList. 
//Testcase: 
//Existing LinkedList: [10, 20, 30, 40] 
//Expected Output: LinkedList: 10 → 20 → 30 


	class Node4
	{
	    int data;
	    Node4 next;

	    Node4(int data) 
	    {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class LinkedListLastDeletation
	{
	    Node4 head;

	
	    Node4 deleteLast() 
	    {
	        if (head == null)
	        {
	            System.out.println("List is empty");
	            return head;
	        }

	
	        if (head.next == null) 
	        {
	            head = null;
	            return head;
	        }

	        Node4 temp = head;

	       
	        while (temp.next.next != null) 
	        {
	            temp = temp.next;
	        }

	       
	        temp.next = null;
	        
	        return temp;
	    }

	    
	    void display()
	    {
	        Node4 temp = head;
	        while (temp != null) 
	        {
	            System.out.print(temp.data);
	            if (temp.next != null)
	            {
	                System.out.print(" → ");
	            }
	            temp = temp.next;
	        }
	    }

	    public static void main(String[] args)
	    {
	    	LinkedListLastDeletation list = new LinkedListLastDeletation();

	       
	        list.head = new Node4(10);
	        list.head.next = new Node4(20);
	        list.head.next.next = new Node4(30);
	        list.head.next.next.next = new Node4(40);

	      
	        list.deleteLast();

	        list.display();
	        
	
	    }
	
}
//10 → 20 → 30