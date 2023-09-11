/**
 *  LinkedList
 */

//Insert At Beginning in a Linkedlist

class LinkedList {
    Node head;
    
    class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //implementation of insertion of a node at the Beginningning
    public void InsertAtBeginning(int newData)
    {
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    public void displayLL()
    {
        Node current = head;
        while(current != null)
        {
            System.out.println(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.InsertAtBeginning(2);
        list.InsertAtBeginning(4);
        list.InsertAtBeginning(6);

        System.out.println("Before insertion of 10");
        list.displayLL();
        System.out.println();

        System.out.println("After insertion of 10");
        list.InsertAtBeginning(10);
        list.displayLL();
        System.out.println();
    }
}
