import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        //deque - double ended queue
        //timecomplexity - O(1)
        ArrayDeque<String> deque = new ArrayDeque<>();
        //offer - add
        deque.offer("b");
        deque.offerFirst("a");//offerFirst - addFirst
        deque.offerLast("c");//offerLast - addLast

        System.out.println(deque);

        deque.offer("d");//add - addLast
        System.out.println(deque);


        //peek - getFirst
        System.out.println(deque.peek());//getFirst -a
        System.out.println(deque.peekFirst());//getFirst -a
        System.out.println(deque.peekLast());//getLast - d



        //poll - removeFirst
        System.out.println(deque.poll());//removeFirst - a
        System.out.println(deque.pollFirst());//removeFirst - b
        System.out.println(deque.pollLast());//removeLast - d



    }
}
