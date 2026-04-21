package JAVA_DSA_ASSIGNMENT_3;

//1. Create a LinkedList and insert elements at the end. 
//Testcase: 
//Existing LinkedList: [5, 10, 15] 
//Elements to insert: [20, 25] 
//Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25 



	class Node 
	{
	    int data;
	    Node next;

	    Node(int data)
	    {
	        this.data = data;
	        this.next = null;
	    }
	}

public	class LinkedListEndInsertation 
	{
	    Node head;

	    // Insert at end
	    Node insertAtEnd(int data)
	    {
	        Node newNode = new Node(data);

	        if(head ==null)
	        {
	     
	            head = newNode;
	            
	            return  head;
	        }
	        Node temp = head;
	        while (temp.next != null) 
	        {
	            temp = temp.next;
	        }

	       
	        temp.next = newNode; // Insert at end
	        
	        return temp;
	    }

	    
	    void display()
	    {
	        Node temp = head;
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
	        LinkedListEndInsertation list = new LinkedListEndInsertation();

	        list.insertAtEnd(5);
	        list.insertAtEnd(10);
	        list.insertAtEnd(15);

	     
	        list.insertAtEnd(20);
	        list.insertAtEnd(25);

	        System.out.print("LinkedList: ");
	        list.display();
	    }
	}
		
		
		
	




