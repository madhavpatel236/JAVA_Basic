import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        // add()
        // Time complexity : O(log n)
        System.out.println("add");
        pq.add(12);
        pq.add(5);
        pq.add(8);
        pq.add(4);
        pq.add(7);
        pq.add(8);
        // pq.add("Madhav"); // not possible
        System.out.println(pq);

        // Offer
        System.out.println("Offer");
        System.out.println(pq);
        pq.offer(9);
        System.out.println(pq);

    }
}
