package JAVA_DSA_ASSIGNMENT_3;
//3. Insert a new node at a given position in a LinkedList. 
//Testcase: 
//Existing LinkedList: [10, 20, 30, 40] 
//Node to insert: 25 at position 2 
//Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40

	class Node2 {
	    int data;
	    Node2 next;

	    Node2(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class LinkedListIndexInsertation 
	 {
	    Node2 head;

	  
	    void insertAtPosition(int data, int position) {
	        Node2 newNode = new Node2(data);

	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node2 temp = head;

	        
	        for (int i = 0; i < position - 1; i++) {
	            if (temp == null) {
	                System.out.println("Position out of bounds");
	                return;
	            }
	            temp = temp.next;
	        }

	       
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	  
	    void display()
	    {
	        Node2 temp = head;
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
	    	LinkedListIndexInsertation list = new LinkedListIndexInsertation();

	   
	        list.insertAtPosition(10, 0);
	        list.insertAtPosition(20, 1);
	        list.insertAtPosition(30, 2);
	        list.insertAtPosition(40, 3);

	       
	        list.insertAtPosition(25, 2);

	        list.display();
	    }
	    
	 
	 }

