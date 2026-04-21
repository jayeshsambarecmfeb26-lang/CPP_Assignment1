package JAVA_DSA_ASSIGNMENT_3;

//8. Count the total number of nodes in a LinkedList. 
//Testcase: 
//Existing LinkedList: [10, 20, 30, 40] 
//Expected Output: Total nodes: 4


	class Node7 
	{
	    int data;
	    Node7 next;

	    Node7(int data) 
	    {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class LinkedListNodesCount 
	{
	    Node7 head;


	    void insert(int data) 
	    {
	        Node7 newNode = new Node7(data);

	        if (head == null)
	        {
	            head = newNode;
	            return;
	        }

	        Node7 temp = head;
	        while (temp.next != null)
	        {
	            temp = temp.next;
	        }

	        temp.next = newNode;
	    }


	    int countNodes() {
	        int count = 0;
	        Node7 temp = head;

	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }

	        return count;
	    }

	
	    void display()
	    {
	        Node7 temp = head;
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
	    	LinkedListNodesCount list = new LinkedListNodesCount();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        list.display();

	        int total = list.countNodes();
	        System.out.println("\nTotal nodes: " + total);
	    }
	
}
