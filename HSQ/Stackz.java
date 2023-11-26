package HSQ;

import java.util.Stack;

public class Stackz {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        stack1.push(34);
        stack1.push(67);
        stack1.push(10);
        stack1.push(9);

        System.out.println(stack1.peek());
        stack1.pop();
        System.out.println(stack1.peek());

        System.out.println("position of 67 is: " + stack1.search(67));
        System.out.println(stack1.empty());
        System.out.println("completed");
    }
}
