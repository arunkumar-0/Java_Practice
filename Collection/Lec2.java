package Collection;

import java.util.*;

public class Lec2 {
    public static void main(String[] args) {
        // Array deque - also known as array double ended queue
        ArrayDeque ad = new ArrayDeque();
        ad.addLast(45);
        ad.addFirst("abcd");
        ad.add("add");
        ad.offer("offer");
        ad.offerFirst("first");

        System.out.println(ad);

        // Priority Queue
        PriorityQueue pq = new PriorityQueue();
        pq.add("abs");
        pq.add("asn");
        pq.add("asdm");
        pq.add("aslkdnqw");
        pq.add("sdwne");
        System.out.println(pq);
    }
}
