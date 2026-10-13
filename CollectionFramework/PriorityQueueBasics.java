import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.offer(40);
        pq.offer(50);
        pq.offer(60);
        pq.offer(70);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}