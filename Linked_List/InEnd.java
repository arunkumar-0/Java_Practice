package Linked_List;

//insertion at the end  and the begining of the linked list 
public class InEnd {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insertion at the end
    public void insertEnd(int newData) {
        Node newNode = new Node(newData);

        // if linked list is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }

        // if linked list is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;

    }

    // insertion at the begining
    public void insertBegining(int newData) {
        Node newNode = new Node(newData);
        // list is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        // list is not empty
        newNode.next = head;
        head = newNode;
    }

    // insertion at any node
    public void insertBetween(Node prev_node, int newData) {
        if (prev_node == null) {
            System.out.println("previous node cannot contain null value");
            return;

        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }

    // displaying the linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InEnd ie = new InEnd();
        ie.insertEnd(23);
        ie.insertEnd(45);
        ie.insertEnd(12);
        ie.insertEnd(90);
        ie.insertBegining(34);
        ie.insertBetween(ie.head.next.next, 13);
        ie.display();

    }
}
