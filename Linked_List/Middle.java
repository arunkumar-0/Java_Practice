package Linked_List;

public class Middle {
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

    // middle of the linked list
    public void mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is : " + slow.data);
    }

    // cycle detection in the linked list
    public void cycleDetection() {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("No cycle detected");
        } else {
            System.out.println(" cycle  detected");
        }
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        Middle md = new Middle();
        md.insertion(23);
        md.insertion(3);
        md.insertion(43);
        md.insertion(8);
        // md.insertion(12);
        md.show();
        System.out.println();

        md.mid();
        md.cycleDetection();

    }
}
