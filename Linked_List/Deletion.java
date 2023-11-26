package Linked_List;

public class Deletion {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insertion
    public void insertion(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // deletion in the linked list - my approach
    // public void deletion(Node prev_node, Node current_node) {
    // if (prev_node == null) {
    // System.out.println("no previous node exists");
    // }
    // if (current_node.next == null) {
    // prev_node.next = null;
    // }
    // prev_node.next = current_node.next;
    // current_node.next = null;

    // }

    // deletion in a linked list -- mam approach
    public void deletion(int position) {
        if (head == null) {
            return;
        }

        Node temp = head;
        // deletion in the begining
        if (position == 0) {
            head = temp.next;
            return;
        }

        // deletion at any point
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null && temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    // reverse of a linked list by iterative approach
    public void reverse() {
        Node current_ptr = head;
        Node prev_ptr = null;
        Node next_ptr = null;

        while (current_ptr != null) {
            next_ptr = current_ptr.next;
            current_ptr.next = prev_ptr;
            prev_ptr = current_ptr;
            current_ptr = next_ptr;
        }
        head = prev_ptr;
    }

    // reverse of a linked list using recursive approach
    public void reverseRec(Node curr, Node prev) {
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextPtr = curr.next;
        curr.next = prev;
        reverseRec(nextPtr, curr);

    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Deletion dl = new Deletion();
        dl.insertion(23);
        dl.insertion(24);
        dl.insertion(90);
        dl.insertion(32);
        dl.show();
        System.out.println();

        dl.deletion(2);
        dl.show();
        System.out.println();

        dl.reverse();
        dl.show();
        System.out.println();

        dl.reverseRec(dl.head, null);
        dl.show();

    }
}
