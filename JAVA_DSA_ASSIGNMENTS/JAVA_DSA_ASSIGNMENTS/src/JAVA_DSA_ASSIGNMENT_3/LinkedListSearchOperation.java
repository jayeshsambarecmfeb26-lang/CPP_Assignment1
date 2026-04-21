package JAVA_DSA_ASSIGNMENT_3;

//7. Search for an element in a LinkedList. 
//Testcase: 
//Existing LinkedList: [10, 20, 30, 40] 
//Element to search: 30 
//Expected Output: Element found at index 2

	class Node6 {
	    int data;
	    Node6 next;

	    Node6(int data)
	    {
	        this.data = data;
	        this.next = null;
	    }
	}

	 public class LinkedListSearchOperation 
	{
 
	    Node6 head;

	
	    void insert(int data)
	    {
	        Node6 newNode = new Node6(data);

	        if (head == null)
	        {
	            head = newNode;
	            return;
	        }

	        Node6 temp = head;
	        while (temp.next != null)
	        {
	            temp = temp.next;
	        }

	        temp.next = newNode;
	    }

	
	    int search(int key) 
	    {
	        Node6 temp = head;
	        int index = 0;

	        while (temp != null)
	        {
	            if (temp.data == key) 
	            {
	                return index;
	            }
	            temp = temp.next;
	            index++;
	        }

	        return -1; 
	    }

	  
	    void display()
	    {
	        Node6 temp = head;
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
	    	LinkedListSearchOperation list = new LinkedListSearchOperation();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        list.display();

	        int result = list.search(30);

	        if (result != -1) {
	            System.out.println("\nElement found at index " + result);
	        } else {
	            System.out.println("Element not found");
	        }
	    }
	
}
