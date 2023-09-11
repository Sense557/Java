
//Reverse LinkedList Recursively

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

    public void reverseRecursively() {
        head = reverseRecursivelyUtil(head);
    }

    private Node reverseRecursivelyUtil(Node current) {
        if (current == null || current.next == null) {
            return current;
        }

        Node nextNode = current.next;
        current.next = null;
        Node reversedList = reverseRecursivelyUtil(nextNode);
        nextNode.next = current;

        return reversedList;
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

        list.reverseRecursively();

        System.out.println("Reversed Linked List:");
        list.displayList();
    }
}
