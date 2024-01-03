package HSQ;

import java.util.Stack;

//implementation of queue using stack 
public class QueueS {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enQueue(int data) {
        stack1.push(data);
    }

    static int deQueue() {
        int ele;
        if (stack1.empty() && stack2.empty()) {
            System.out.println("the stack is empty");
            System.exit(0);
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }
        ele = stack2.pop();
        return ele;
    }

    public static void main(String[] args) {

        QueueS.enQueue(23);
        QueueS.enQueue(67);
        QueueS.enQueue(3);
        QueueS.enQueue(10);

        System.out.println(QueueS.deQueue());
    }
}
