package Day26;
import java.util.Scanner;

public class LinkedList4 {
    public static void insertAtPosition(int new_data, int position, Node head) {
        Node new_node = new Node(new_data);
        if (position == 0) {
            new_node= head;
            return ;
        }
        Node curr = head;
        for (int i = 0; i < position - 1 ; i++) {
            curr = curr.next;
        }
        new_node.next = curr.next;
        curr.next = new_node;
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

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position to insert 5: ");
        int pos = sc.nextInt();

        insertAtPosition(5, pos, head);
        System.out.println("Linked List after insertion:");
        printList(head);
        sc.close();
    }
}
// ...existing code...