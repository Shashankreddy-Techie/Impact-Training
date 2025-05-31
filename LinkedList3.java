package Day26;
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList3 {
    public static Node traverseNode(Node head, int index) {
        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        return current;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Original Linked List:");
        head = traverseNode(head, 0);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
