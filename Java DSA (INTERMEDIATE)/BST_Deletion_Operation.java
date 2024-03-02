public class BST_Deletion_Operation {

  Node root;

  Node deletNode(Node root, int key) {
    if (root == null) return root;

    // If the node to be deleted is found with no child then simply remove it.
    if (root.left == null && root.right == null) return null;

    // 1. Remove the minimum element from the right subtree of the node to be deleted and replace the node with that
    // 1. Remove the minimum element from the right subtree of the node and copy it to the node.
    // 2. Delete the copied node.
    if (root.left != null && root.right == null) {
      root = root.left;
    } else if (root.left == null && root.right != null) {
      root = root.right;
    } else {
      Node minV = findMinValueNode(root.right);
      root.data = minV.data;
      root.right = deleteRec(root.right, minV.data);
    }
    return root;
  }

  private Node deleteRec(Node right, Object data) {
    if (right == null) return right;
    Node temp = right;
    right = right.left;
    temp.left = deleteRec(right, data);
    return temp;
  }

  // Helper method that returns the node having the minimum value in a Binary Tree
  Node findMinValueNode(Node node) {
    Node current = node;
    while (current.left != null) {
      current = current.left;
    }
    return current;
  }

  public static void main(String[] args) {
    BST bst = new BST();
    int arr[] = { 50, 30, 70, 80, 60, 40 };
    for (int i : arr) bst.insert(i);
    System.out.println("Inorder Traversal Before Deletion : ");
    bst.inOrderTraversal(bst.getRoot());
    bst.delete(50);
    System.out.println("\n\n Inorder Traversal After Deletion : ");
    bst.inOrderTraversal(bst.getRoot());
  }
}

class Node {

  public Object data;
  Node left;
  Node right;
  int key;

  Node(int x) {
    key = x;
    left = right = null;
  }
}
