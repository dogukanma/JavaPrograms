import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class GenericPractice {
  public static void main(String[] args){
    ArrayList rawList = new ArrayList();
    rawList.add(5.4);
    System.out.println(rawList.get(0));

    ArrayList<String> safeList = new ArrayList<String>();
    safeList.add("Steak");
    System.out.println(safeList.get(0));

    Stack<String> stack = new Stack<String>();
    stack.push("Apple");
    stack.push("Peach");
    stack.add("Tomato");
    System.out.println(stack + "\nPeek: " + stack.peek());
    System.out.println("Popped: " + stack.pop());
    System.out.println(stack);

    Queue<String> queue = new LinkedList<String>();
    System.out.println("Queue Peek: " + queue.peek());
    queue.add("Restaurant");
    queue.add("Market");
    queue.add("Hospital");
    System.out.println("Queue Peek: " + queue.peek());
    System.out.println("Queue: " + queue);
    System.out.println(queue.poll());
    System.out.println(queue);
  }
}
