package HSQ;

import java.util.Queue;

public class StackQ {
    // stack using queue

    Queue<Integer> q1 = new Queue<Integer>();
    Queue<Integer> q2 = new Queue<Integer>();

    static void add(int data) {
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(data);

        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    static int delete() {
        if (q1.isEmpty) {
            System.out.println("queue is empty");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll()
        return ele;
    }

    public static void main(String[] args) {
        StackQ q = new StackQ();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);

        System.out.println(" " + q.delete());

    }
}
