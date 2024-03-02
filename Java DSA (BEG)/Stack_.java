import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
public class Stack_{
public static void main(String[]args)
{
    Stack<Integer>s1=new Stack<>();
    s1.push(10);
    s1.push(20);
    s1.push(30);
    s1.push(40);
    System.out.println(s1);
    System.out.println("peek: "+s1.peek());
    while(!s1.empty()){
        System.out.print(s1.peek()+" ");
        s1.pop();
    }System.out.println();

    System.out.println(s1.empty());

    // Stack.sort(s1);

    // Iterator Object
    Iterator it=s1.iterator();

    while(it.hasNext()){
        Object s2=it.next();
        System.out.print(s2+" ");
    }System.out.println();


}}