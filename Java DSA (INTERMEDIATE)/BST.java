class Node {

  int data;
  Node left;
  Node right;

  Node(int val) {
    this.data = val;
  }
}

class BST {

  private Node root;

  private Node insertNode(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }
    if (data < root.data) {
      root.left = insertNode(root.left, data);
    } else if (data > root.data) {
      root.right = insertNode(root.right, data);
    }

    return root;
  }

  private void inOrder(Node root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }

  BST() {
    this.root = null;
  }

  public void insert(int data) {
    root = insertNode(root, data);
  }

  public void inOrder() {
    System.out.println("\n-------InOrder Traversal--------\n");
    inOrder(root);
  }

  public static void main(String[] args) {
    BST b = new BST();
    b.insert(100);
    b.insert(200);
    b.insert(50);
    b.insert(30);
    b.insert(400);
    b.insert(60);
    b.inOrder();
  }

  public Object getRoot() {
    return root;
  }

  public void delete(int i) {
    root = deleteNode(root, i);
  }

  private Node deleteNode(Node root2, int i) {
    // Base case
    if (root2 == null) return root2;

    /* If the key to be deleted is smaller than the root's key, then it is in the left subtree */
    if (i < root2.data) root2.left =
      deleteNode(root2.left, i); /* Else the key is greater */
    else if (i > root2.data) root2.right =
      deleteNode(root2.right, i); /* We have found the node to be deleted */
    else {
      /* The task is now to remove this node from tree without violating the property of Binary Search Tree */
      /* The node with only one child or no children */
      if (root2.left == null) return root2.right; else if (
        root2.right == null
      ) return root2.left;

      /* Node with two children: Get the minimum value from the right subtree and make that the root of this node */
      /* Node with two children: Get the   minimum value from the right subtree and make that the
         new root of this subtree */
      root2.data = (int) minValue(root2.right);
      root2.right = deleteNode(root2.right, root2.data);
    }
    return root2;
  }

  private Object minValue(Node right) {
    Node current = right;
    /* Find the leaf value pointed by current, keep going till we find a leaf */
    while (current.left != null) current = current.left;
    return current;
  }

  public void inOrderTraversal(Object root2) {
    Node r = (Node) root2;
    inOrderHelper(r);
  }

  /** Helper method for performing an in-order traversal on the tree. */
  protected static void inOrderHelper(Node x) {
    if (x != null) {
      System.out.print(x + " ");
      inOrderHelper(x.left);
      inOrderHelper(x.right);
    }
  }
}
