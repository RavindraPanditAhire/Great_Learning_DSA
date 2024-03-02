
class Node {

  Node left;
  Node right;
  int data;

  Node(int val) {
    this.data = val;
    this.left = null;
    this.right = null;
  }
}

public class Depth_First_Search {

  private Node root;

  private Node insert(Node current, int data) {
    if (current == null) {
      return new Node(data);
    }

    if (data < current.data) {
      current.left = insert(current.left, data);
    } else if (data > current.data) {
      current.right = insert(current.right, data);
    }

    return current;
  }

  private void inOrder(Node root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }

  public void insert(int data) {
    root = insert(root, data);
  }

  public void inOrder() {
    if (root == null) {
      System.out.println("\nTree is Empty...");
      return;
    }

    System.out.println("\n-----Tree Items----------\n");
    inOrder(root);
  }

  public static void main(String[] args) {
    Depth_First_Search d=new Depth_First_Search();

    d.inOrder();
    d.insert(10);
    d.insert(20);
    d.insert(30);
    d.inOrder();
  }
}
