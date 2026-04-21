package JAVA_DSA_ASSIGNMENT_3;

//9. Reverse a LinkedList. 
//Testcase: 
//Existing LinkedList: [10, 20, 30, 40] 
//Expected Output: LinkedList: 40 → 30 → 20 → 10 
//Existing LinkedList: [] 
//Expected Output: LinkedList: (empty)


	class Node8 {
	    int data;
	    Node8 next;

	    Node8(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class ReverseLinkedList 
	{
	    Node8 head;

	   
	    void insert(int data) 
	    {
	        Node8 newNode = new Node8(data);

	        if (head == null) 
	        {
	            head = newNode;
	            return;
	        }

	        Node8 temp = head;
	        while (temp.next != null) 
	        {
	            temp = temp.next;
	        }

	        temp.next = newNode;
	    }

	   
	    void reverse()
	    {
	        Node8 prev = null;
	        Node8 curr = head;
	        Node8 next = null;

	        while (curr != null) {
	            next = curr.next;   // store next
	            curr.next = prev;   // reverse link
	            prev = curr;        // move prev
	            curr = next;        // move curr
	        }

	        head = prev;
	    }


	    
	    void display()
	    {
	       
	        if (head == null) {
            System.out.println("\nLinkedList: (empty)");
            return;
        }
	        Node8 temp = head;
	        while (temp != null) 
	        {
	            System.out.print(temp.data);
	            if (temp.next != null)
	            {
	                System.out.print(" → ");
	            }
	            temp = temp.next;
	            System.out.print(" ");
	        }
	    }

	    public static void main(String[] args) 
	    {
	    
	    	ReverseLinkedList list1 = new ReverseLinkedList();
	        list1.insert(10);
	        list1.insert(20);
	        list1.insert(30);
	        list1.insert(40);

	      
	        list1.reverse();
	        list1.display();

	        ReverseLinkedList list2 = new ReverseLinkedList();
	        list2.display();
	        list2.reverse();
	        list2.display();
	    }
	
}
