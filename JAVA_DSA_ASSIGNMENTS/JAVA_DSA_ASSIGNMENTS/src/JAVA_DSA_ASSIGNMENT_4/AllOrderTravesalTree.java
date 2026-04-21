package JAVA_DSA_ASSIGNMENT_4;
//Q8. Inorder, Preorder, Postorder Traversals 
//Implement recursive functions to print inorder, preorder, and postorder traversals. 
//Test Case: 
//Tree: 
//      10 
//     /  \ 
//    20   30 
//   / \ 
//  40  50 
//• Inorder: 40 20 50 10 30 
//• Preorder: 10 20 40 50 30 
//• Postorder: 40 50 20 30 10 
public class AllOrderTravesalTree 
{

	    static class Node 
	    {
	        int data;
	        Node left, right;

	        Node(int value) {
	            data = value;
	            left = right = null;
	        }
	    }

	    static void inorder(Node root) {
	        if (root == null) return;

	        inorder(root.left);
	        System.out.print(root.data + " ");
	        inorder(root.right);
	    }

	  
	    static void preorder(Node root) {
	        if (root == null) return;

	        System.out.print(root.data + " ");
	        preorder(root.left);
	        preorder(root.right);
	    }
	    static void postorder(Node root) {
	        if (root == null) return;

	        postorder(root.left);
	        postorder(root.right);
	        System.out.print(root.data + " ");
	    }

	    public static void main(String[] args) 
	    {

	        Node root = new Node(10);

	        root.left = new Node(20);
	        root.right = new Node(30);

	        root.left.left = new Node(40);
	        root.left.right = new Node(50);

	
	        System.out.print("Inorder: ");
	        inorder(root);

	        System.out.print("\nPreorder: ");
	        preorder(root);

	        System.out.print("\nPostorder: ");
	        postorder(root);
	    }
	
}
