/**
 *  LinkedList
 */

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

    //implementation of insertion of a node at the end
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData); 
        // linklist is empty
        if(head == null)
        {
            head = new Node(newData);
            return;
        }

        //linklist is not empty
        newNode.next = null;
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
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
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(6);

        System.out.println("Before insertion of 10");
        list.displayLL();
        System.out.println();


        System.out.println("After insertion of 10");
        list.insertAtEnd(10);
        list.displayLL();
        System.out.println();
    }
}
