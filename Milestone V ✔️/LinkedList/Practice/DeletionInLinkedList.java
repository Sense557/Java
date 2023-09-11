
//Deletion in LinkedList

class LinkedList {
    // Define a Node class to represent individual nodes in the linked list.
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // The head of the linked list.

    // Constructor to create an empty linked list.
    public LinkedList() {
        head = null;
    }

    // Method to delete a node with a specific value from the linked list.
    public void deleteNode(int key) {
        Node current = head;
        Node previous = null;

        // Check if the node to be deleted is the head node.
        if (current != null && current.data == key) {
            head = current.next; // Move the head to the next node.
            return;
        }

        // Search for the node to be deleted while keeping track of the previous node.
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // If the key was not found in the linked list, do nothing.
        if (current == null) {
            return;
        }

        // Update the previous node's next pointer to skip the current node.
        previous.next = current.next;
    }

    // Method to display the elements of the linked list.
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original Linked List:");
        list.displayList();

        list.deleteNode(3); // Delete node with value 3
        System.out.println("Linked List after deleting 3:");
        list.displayList();
    }

    // Method to insert a new node at the end of the linked list.
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}
