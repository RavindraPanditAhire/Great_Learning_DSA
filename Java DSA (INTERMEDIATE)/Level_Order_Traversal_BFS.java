import java.util.LinkedList;
import java.util.Queue;

/**
 * Node
 */
class Node {

  Node left;
  Node right;
  int data;

  public Node(int d) {
    data = d;
    left = right = null;
  }
}

public class Level_Order_Traversal_BFS {

  Node root;

  /* Function to print level order traversal of a tree*/
  void printLevelOrder() {
    Queue<Node> q = new LinkedList<>(); // Create a queue for BFS
    Node temp = root; // Create a temporary node and initialize it with the root of the tree
    if (temp == null) return; // If the tree is empty, return from function
    System.out.println(); // Printing the starting bracket
    q.add(root); // Add the root node to the queue
    while (!q.isEmpty()) { // While the queue is not empty
      temp = q.peek(); // Get the front node from the queue
      System.out.print(temp.data + " "); // Print the data of front node
      q.remove(); // Remove the front node from the queue

      /* For a non-leaf node, add its children to the queue */
      if (temp.left != null) {
        q.add(temp.left);
      }
      if (temp.right != null) {
        q.add(temp.right);
      }
    }
  }

  public static void main(String[] args) {
    Level_Order_Traversal_BFS tree = new Level_Order_Traversal_BFS();
    tree.root = new Node(1); // Root of the binary tree
    tree.root.left = new Node(2); // Left subtree
    tree.root.right = new Node(3); // Right subtree
    tree.root.left.left = new Node(4); // Left-most leaf
    tree.root.right.right = new Node(5); // Right-most leaf

    System.out.println("Level Order Traversal of binary tree is -");
    tree.printLevelOrder();
  }
}
