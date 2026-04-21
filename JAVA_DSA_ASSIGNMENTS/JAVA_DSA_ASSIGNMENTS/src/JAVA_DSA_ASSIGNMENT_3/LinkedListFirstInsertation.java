package JAVA_DSA_ASSIGNMENT_3;
//2. Insert a new node at the beginning of a LinkedList. 
//Testcase: 
//Existing LinkedList: [10, 20, 30] 
//Node to insert: 5 
//Expected Output: LinkedList: 5 → 10 → 20 → 30


class Node1 
{
    int data;
    Node1 next;

    Node1(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedListFirstInsertation
{
    Node1 head;

   
    void insertAtBeginning(int data)
    {
        Node1 newNode = new Node1(data);

        newNode.next = head;  
        head = newNode;       
    }

    void display()
    {
        Node1 temp = head;
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
    	LinkedListFirstInsertation list = new LinkedListFirstInsertation();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);


        list.insertAtBeginning(5);

     
        list.display();
    }
}