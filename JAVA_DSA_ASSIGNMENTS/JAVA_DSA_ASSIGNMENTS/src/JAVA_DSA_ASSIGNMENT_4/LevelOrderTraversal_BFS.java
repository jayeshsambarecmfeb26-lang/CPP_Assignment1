package JAVA_DSA_ASSIGNMENT_4;
//Q9. Level Order Traversal (BFS) 
//Implement level-order traversal of a binary tree. 
//Test Case: 
//Tree: 
//       1 
//     /   \ 
//    2     3 
//   / \   / \ 
//  4   5 6   7 
//Output: 1 2 3 4 5 6 7 
import java.util.*;

public class LevelOrderTraversal_BFS 
{

	  
	    static class Node {
	        int data;
	        Node left, right;

	        Node(int value) {
	            data = value;
	            left = right = null;
	        }
	    }

	  
	    static void levelOrder(Node root) {
	        if (root == null) return;

	        Queue<Node> queue = new LinkedList<>();
	        queue.add(root);

	        while (!queue.isEmpty()) {
	            Node current = queue.poll();
	            System.out.print(current.data + " ");

	            if (current.left != null) {
	                queue.add(current.left);
	            }

	            if (current.right != null) {
	                queue.add(current.right);
	            }
	        }
	    }

	    public static void main(String[] args) {

	        Node root = new Node(1);

	        root.left = new Node(2);
	        root.right = new Node(3);

	        root.left.left = new Node(4);
	        root.left.right = new Node(5);

	        root.right.left = new Node(6);
	        root.right.right = new Node(7);

	  
	        System.out.print("Output: ");
	        levelOrder(root);
	    }
	
}
