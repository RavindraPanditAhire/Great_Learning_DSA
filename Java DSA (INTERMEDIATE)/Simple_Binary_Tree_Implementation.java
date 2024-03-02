class Node {

  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
  }
}

public class Simple_Binary_Tree_Implementation {

  Node root;

  void preOrder(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  void postOrder(Node root) {
    if (root != null) {
      preOrder(root.left);
      preOrder(root.right);
      System.out.print(root.data + " ");
    }
  }

  void inOrder(Node root) {
    if (root != null) {
      preOrder(root.left);
      System.out.print(root.data + " ");
      preOrder(root.right);
    }
  }

  public static void main(String[] args) {
    Simple_Binary_Tree_Implementation t = new Simple_Binary_Tree_Implementation();
    Node root = new Node(100);

    root.left = new Node(50);
    root.right = new Node(150);

    root.left.left = new Node(30);
    root.left.right = new Node(130);

    root.right.left = new Node(20);
    root.right.right = new Node(180);
    System.out.println("PreOrder Traversal: ");
    t.preOrder(root);
    System.out.println();

    System.out.println("PostOrder Traversal: ");
    t.postOrder(root);
    System.out.println();

    System.out.println("InOrder Traversal: ");
    t.inOrder(root);
    System.out.println();
  }
}
