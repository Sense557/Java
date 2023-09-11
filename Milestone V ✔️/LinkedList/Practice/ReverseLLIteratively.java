/**
 *  LinkedList
 */

//Reverse LinkedList Iteratively

class LinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void reverseIteratively() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node.
            current.next = previous; // Reverse the current node's pointer.
            previous = current; // Move previous to current.
            current = next; // Move current to next.
        }

        head = previous; // Update the head to the last node.
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

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

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original Linked List:");
        list.displayList();

        list.reverseIteratively();

        System.out.println("Reversed Linked List:");
        list.displayList();
    }
}
