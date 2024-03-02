class Node {

  String data;
  Node left;
  Node right;

  Node(String val) {
    this.data = val;
    left = right = null;
  }
}

public class BST_PreOrder {

  Node root;

  private Node insert(Node root, String data) {
    if (root == null) {
      return new Node(data);
    }

    if (data.compareTo(root.data) < 0) {
      root.left = insert(root.left, data);
    } else if (data.compareTo(root.data) > 0) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  private void preOrder(Node root) {
    if (root != null) {
      System.out.print(root.data + " "); // Add space after printing data
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  private void inOrder(Node root) {
    if (root != null) {
      preOrder(root.left);
      System.out.print(root.data + " "); // Add space after printing data
      preOrder(root.right);
    }
  }

  public void insert(String data) {
    root = insert(root, data);
  }

  public void preOrder() {
    System.out.println("\nPreOrder Traversal: ");
    preOrder(root);
  }

  public void inOrder() {
    System.out.println("\nInOrder Traversal: ");
    inOrder(root);
  }

  public static void main(String[] args) {
    String[] words = {
      "apple",
      "banana",
      "orange",
      "grapefruit",
      "kiwi",
      "pineapple",
    };
    BST_PreOrder tree = new BST_PreOrder();
    for (int i = 0; i < words.length; i++) {
      tree.insert(words[i]);
    }
    tree.preOrder();
    tree.inOrder();
  }
}
