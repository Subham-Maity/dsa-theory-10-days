import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    //priorityQueue - ordered collection of unique elements and sorted in ascending order by default
    //timecomplexity - O(log n)
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(121);
        pq.offer(20);
        pq.offer(303);
        pq.offer(40);

         //1. poll() - here we get the highest priority element and remove it from the queue which is the smallest element
        System.out.println(pq.poll());
        System.out.println(pq);


        //2. peek() - here we get the highest priority element ,but it does not remove it from the queue which is the smallest element
        System.out.println(pq.peek());
        System.out.println(pq);

        //3.reverseOrder() - here we reverse the order of the elements in the queue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(121);
        pq1.offer(20);
        pq1.offer(303);
        pq1.offer(40);

        System.out.println(pq1.poll());
        System.out.println(pq1);

        System.out.println(pq1.peek());
        System.out.println(pq1);
    }
}
