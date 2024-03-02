
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import javax.script.ScriptContext;
import javax.xml.crypto.Data;

/**
 * Node
 */

import java.util.Stack;

class Node {

  Node next;
  int data;

  Node(int val) {
    this.next = null;
    this.data = val;
  }
}

/**
 * Scratch_LL
 */
 class Scratch_LL {
    Node head;

    Scratch_LL(){
        this.head=null;
    }

    boolean isEmpty(){
        return head == null;
    }

    // insert new node as Start
    void addStart(int data){
        Node newNode=new Node(data);

        newNode.next=head;
        head=newNode;
        System.out.println(data+" added as Head..\n");
    }

    //deleting from start
    void deleteStart(){
        if (isEmpty()) {
            System.out.println("No data for Delertion...\n");
            return;
        }
        System.out.println(head.data+" is Deleted");
        head=head.next;
    }

    // print item noeds
    void display(){
        if (isEmpty()) {
            System.out.println("NO data for Display...\n");
            return;
        }

        Node temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next;
        } while (temp != null);
    }
}
public class Linked_List {

  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    l1.add(10);
    l1.add(20);
    l1.add(30);
    l1.remove();
    l1.add(1, 100);

    Iterator it = l1.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println();

    System.out.println("Size: " + l1.size());
    System.out.println("Peek: " + l1.peek());
    System.out.println(l1.contains(8));
    System.out.println(l1.contains(20));
    System.out.println(l1);

    // copying datastructure
    Stack<Integer> s1 = new Stack<>();
    s1.add(42);
    s1.add(52);
    s1.add(46);
    System.out.println("Stack: " + s1);
    l1.addAll(s1);
    System.out.println("LL: " + l1);


    // scartch Linked list implementatioan
    Scratch_LL ll=new Scratch_LL();
    ll.display();
    ll.addStart(100);
    ll.addStart(200);
    ll.addStart(300);
    ll.deleteStart();
    ll.display();
  }
}
