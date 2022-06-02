import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueue {
    public static void main(String[] args) {

        //queue is a collection of elements that are inserted and removed according to FIFO
        //queue is a linear data structure
        //queue is a first-in first-out structure [FIFO]
        Queue<String> queue = new LinkedList<>();
       queue.offer("nancy");
       queue.offer("tom");
       queue.offer("jerry");
       queue.offer("kitty");
       System.out.println(queue);

       //1.poll() - removes and returns the head of the queue
       System.out.println(queue.poll());

       //2.peek() - returns the element at the head of the queue without removing it
       System.out.println(queue.peek());

       //3.element() -  returns the element at the head of the queue without removing it
       System.out.println(queue.element());

       //4.remove() - removes the first element
       System.out.println(queue.remove());

       //5.contains() - returns true if the queue contains the specified element
       System.out.println(queue.contains("nancy"));

       //6.add - add element at the end of the queue
       queue.add("jerry");
       System.out.println(queue);

    }
}
