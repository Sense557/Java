import java.util.*;

import org.w3c.dom.Node;

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

    //implementation of insertion of a node at the beginning
    public void insertAtBeginning(int newData)
    {
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
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

    // Implementation of insertion of node at any node
    public void insertAfterAnyNode(Node prev_node, int newData)
    {
        if(prev_node == null)
        {
            System.out.println("The Previous node cannot contain null values");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    //Implementation of deletion of node at any node form the linkedlist
    public void deleteNode(int position)
    {
        //linkedlist is empty
        if(head == null)
        {
            return;
        }

        Node temp = head;
        //deletion is the begining of the node
        if(position == 0)
        {
            head = temp.next;
            return;
        }

        //deletion is not the begining of the node
        for(int i = 0; temp != null && i<position -1; i++)
        {
            temp = temp.next;
        }

        if(temp == null && temp.next == null)
        {
            return;
        }

        temp.next = temp.next.next;
    }


    //Implementation of reversal of a node in a linkedlist iteratively
    public void reverseLL()
    {
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while(curr != null)
        {
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }
        head = prev;
        return;
    }

    //Implementation of reversal of a linkdelist using Recursive approach
    public void reversalRec(Node curr, Node prev)
    {
        //Last node of a linkedlist
        if(curr.next == null)
        {
            head = curr;
            curr.next = prev;
            return;
        }

        Node nextPtr = curr.next;
        curr.next = prev;
        //recursive function call
        reversalRec(nextPtr, curr);
    }


    //Implementation of finding of middle data in a linkedlist
    public void middleNode()
    {
        Node slow = head, fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }   
        System.out.println("Middle data of a given linkedlist is: "+slow.data);
    }


    //Implementation of detecting the loop in a linkedlist
    public void detectLoop()
    {
        int flag = 0;
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
             
            if(slow == fast)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("No loop detected");
        }
        else
        {
            System.out.println("Loop id detected");
        }

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

        list.insertAtBeginning(1);
        list.insertAtBeginning(9);

        list.insertAfterAnyNode(list.head.next.next, 13);
        list.displayLL();
        System.out.println();

        System.out.println("After insertion of 10");
        list.insertAtEnd(10);
        list.displayLL();
        System.out.println();


        // System.out.println("Deletion of node at any position");
        // list.deleteNode(0);
        // list.displayLL();
        // System.out.println();

        // System.out.println("After reversal the list is: ");
        // list.reverseLL();
        // list.displayLL();
        // System.out.println();

        System.out.println("After reversal the list is: ");
        list.reversalRec(list.head, null);
        list.displayLL();
        System.out.println();


        //Middle Node data find
        list.middleNode();
        System.out.println();


        //Circular Linkedlist
        Node temp = list.head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = list.head;
        list.detectLoop();
        System.out.println();
    }
}
