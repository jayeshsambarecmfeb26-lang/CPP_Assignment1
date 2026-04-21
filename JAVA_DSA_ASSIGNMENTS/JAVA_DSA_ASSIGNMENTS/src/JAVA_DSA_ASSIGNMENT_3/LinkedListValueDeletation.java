package JAVA_DSA_ASSIGNMENT_3;

//6. Delete a node by its value in a LinkedList. 
//Testcase: 
//Existing LinkedList: [10, 20, 30, 40] 
//Node to delete: 30 
//Expected Output: LinkedList: 10 → 20 → 40 


	class Node5
	{
	    int data;
	    Node5 next;

	    Node5(int data) 
	    {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class LinkedListValueDeletation
	 {
	    Node5 head;


	    void deleteByValue(int value) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        
	        if (head.data == value) 
	        {
	            head = head.next;
	            return;
	        }

	        Node5 temp = head;

	        
	        while (temp.next != null && temp.next.data != value)
	        {
	            temp = temp.next;
	        }

	  
	        if (temp.next != null) 
	        {
	            temp.next = temp.next.next;
	        } else {
	            System.out.println("Value not found");
	        }
	    }

	    void display()
	    {
	        Node5 temp = head;
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

	    public static void main(String[] args) {
	    	LinkedListValueDeletation list = new LinkedListValueDeletation();

	        list.head = new Node5(10);
	        list.head.next = new Node5(20);
	        list.head.next.next = new Node5(30);
	        list.head.next.next.next = new Node5(40);

	      
	        list.deleteByValue(30);

	        list.display();
	    }
	

}
//10 → 20 → 40