class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a new node at a specific position
    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If the position is 0, insert at the head
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        // Traverse to the position just before the desired index
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtPosition(10, 0); // Add 10 at position 0
        list.addAtPosition(20, 1); // Add 20 at position 1
        list.addAtPosition(30, 1); // Add 30 at position 1
        list.addAtPosition(40, 3); // Add 40 at position 3

        list.printList(); // Output: 10 -> 30 -> 20 -> 40 -> null
    }
}
