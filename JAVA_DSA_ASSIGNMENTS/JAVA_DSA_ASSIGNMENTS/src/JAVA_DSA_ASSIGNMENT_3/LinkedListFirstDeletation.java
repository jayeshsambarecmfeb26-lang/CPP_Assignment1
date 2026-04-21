package JAVA_DSA_ASSIGNMENT_3;

//4. Delete the first node of a LinkedList 
//Testcase: 
//Existing LinkedList: [10, 20, 30, 40] 
//Expected Output: LinkedList: 20 → 30 → 40


	class Node3 
	{
	    int data;
	    Node3 next;

	    Node3(int data)
	    {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class LinkedListFirstDeletation 
	{
		
	    Node3 head;

	    
	    Node3 deleteFirst()
	    {
	        if (head == null) 
	        {
	            System.out.println("List is empty");
	            return  head;
	        }

	        head = head.next; 
	        return head;
	        
	    }

	    void display()
	    {
	        Node3 temp = head;
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
	    	LinkedListFirstDeletation list = new LinkedListFirstDeletation();

	      
	        list.head = new Node3(10);
	        list.head.next = new Node3(20);
	        list.head.next.next = new Node3(30);
	        list.head.next.next.next = new Node3(40);

	        list.deleteFirst();

	        list.display();
	    }
	

}
//20 → 30 → 40