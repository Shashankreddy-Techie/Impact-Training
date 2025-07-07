class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DeleteKeyDLL {

    public static Node deleteAllOccurrences(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                // If it's the head node
                if (current.prev == null) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
            }
            current = current.next;
        }

        return head;
    }

    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create DLL: 10 <-> 20 <-> 10 <-> 30 <-> 10
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(10);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(30);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original DLL:");
        printDLL(head);

        int key = 10;
        head = deleteAllOccurrences(head, key);

        System.out.println("DLL after deleting key " + key + ":");
        printDLL(head);
    }
}
