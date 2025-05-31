package Day26;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList2 {
    public static Node insertLast(int new_data, Node head) {
        Node new_node = new Node(new_data);
        if (head == null) {
            return new_node;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return head;
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Original Linked List:");
        printList(head);
        System.out.println("Inserting 5 at the end:");
        int new_data = 5;
        head = insertLast(new_data, head);
        printList(head);
    }
}
