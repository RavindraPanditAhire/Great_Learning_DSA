class QueueUsingArray {
    int front, rear, capacity;
    int[] arr;

    QueueUsingArray(int cap) {
        capacity = cap;
        rear = -1;
        front = -1;
        arr = new int[capacity];
    }

    void enqueue(int data) {
        if (rear + 1 == capacity) {
            System.out.println("Queue is Full...\n");
            return;
        }

        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = data;
        System.out.println(data + " added at: " + rear);
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty. Nothing to Delete...\n");
            return;
        }

        System.out.println(arr[front] + " is Deleted...\n");

        if (front == rear) {
            front = rear = -1; // Reset queue
        } else {
            front++;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty. Nothing to Display...\n");
            return;
        }

        System.out.println("\n-------------Queue Items--------------\n");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueUsingLinkedList {
    Node front, rear;

    QueueUsingLinkedList() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            System.out.println(data + " added first...\n");
            return;
        }

        rear.next = newNode;
        rear = newNode;
        System.out.println(data + " added...\n");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty. Nothing to Delete...\n");
            return;
        }

        System.out.println(front.data + " is Deleted...\n");
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is Empty. Nothing to Display...\n");
            return;
        }

        System.out.println("\n-------------Queue Items--------------\n");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }
}

public class Queue {
    public static void main(String[] ar) {
        QueueUsingArray q1 = new QueueUsingArray(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.dequeue();
        q1.enqueue(60);
        q1.display();

        QueueUsingLinkedList q2 = new QueueUsingLinkedList();
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueue(30);
        q2.enqueue(40);
        q2.enqueue(50);
        q2.dequeue();
        q2.enqueue(60);
        q2.display();
    }
}
